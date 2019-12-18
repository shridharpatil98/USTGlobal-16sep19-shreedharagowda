import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';


@Component({
  selector: 'app-alllibrarians',
  templateUrl: './alllibrarians.component.html',
  styleUrls: ['./alllibrarians.component.css']
})
export class AlllibrariansComponent implements OnInit {

  librarians = new Array();
  constructor(private service: LibraryserviceService) {
    this.getAllLibrarians();
   }

  ngOnInit() {
  }

  getAllLibrarians() {
    this.service.getAllLibrarians().subscribe( data => {
      console.log(data.librarianBeans);
      this.librarians = data.librarianBeans;
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
}
