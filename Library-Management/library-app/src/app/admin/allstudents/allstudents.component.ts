import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-allstudents',
  templateUrl: './allstudents.component.html',
  styleUrls: ['./allstudents.component.css']
})
export class AllstudentsComponent implements OnInit {
  students;
  constructor(private service: LibraryserviceService, private http: HttpClient) {
    this.getAllStudents();
  }

  ngOnInit() {
  }
  getAllStudents() {
    this.service.getAllStudents().subscribe(data => {
      console.log(data.studentBeans);
      this.students = data.studentBeans;
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
  deleteStudent(student) {
    console.log(student.sid);
    this.service.deleteStudent(student).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('successs');
    });
  }
}
