import { Component, OnInit, DoCheck } from '@angular/core';
import { LibraryserviceService } from '../libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements DoCheck {

  isAdmin;
  isLibrarian;
  isNotLogIn = true;
  isStudent;
  color = false;
  constructor(private service: LibraryserviceService, private route: Router) { }

  ngDoCheck() {
    const admin = JSON.parse(localStorage.getItem('userDetails'));
    const librarian = JSON.parse(localStorage.getItem('userDetails'));
    const student = JSON.parse(localStorage.getItem('userDetails'));
    if (admin && admin.role === 'admin') {
    this.isAdmin = true;
    this.color = true;
    this.isNotLogIn = false;
    }
    if (librarian && librarian.role === 'librarian') {
      this.isLibrarian = true;
      this.color = true;
      this.isNotLogIn = false;
    }
    if(student && student.role === 'student'){
      this.isStudent = true;
      this.color = true;
      this.isNotLogIn = false;
    }
  }
  adminLogout() {
    localStorage.removeItem('userDetails');
    this.isAdmin = false;
    this.isNotLogIn = true;
    this.color = false;
    this.route.navigate(['user-login']);
  }
  librarianLogout() {
    localStorage.removeItem('userDetails');
    this.isLibrarian = false;
    this.color = false;
    this.isNotLogIn = true;
    this.route.navigate(['user-login']);
  }
  studentLogout() {
    localStorage.removeItem('userDetails');
    this.isStudent = false;
    this.isNotLogIn = true;
    this.color = false;
    this.route.navigate(['user-login']);
  }
}
