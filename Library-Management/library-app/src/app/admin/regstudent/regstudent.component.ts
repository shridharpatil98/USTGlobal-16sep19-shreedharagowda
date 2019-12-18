import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-regstudent',
  templateUrl: './regstudent.component.html',
  styleUrls: ['./regstudent.component.css']
})
export class RegstudentComponent implements OnInit {
  constructor(private service: LibraryserviceService) { }
  get sname() {
    return this.form.get('sname');
  }
  get branch() {
    return this.form.get('branch');
  }
  get password() {
    return this.form.get('password');
  }
  get sem() {
    return this.form.get('sem');
  }
  get section() {
    return this.form.get('section');
  }
  get usn() {
    return this.form.get('usn');
  }

  get email() {
    return this.form.get('email');
  }
  msg;
  form = new FormGroup({
    sname: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required, 
      Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]),
    branch: new FormControl('', [Validators.required]),
    sem: new FormControl('', [Validators.required]),
    section: new FormControl('', [Validators.required]),
    usn: new FormControl('', [Validators.required]),
    email : new FormControl('',[Validators.required])
  })

  ngOnInit() {
  }
  addStudent(form) {
    this.msg = null;
    console.log(form.value);
    this.service.registerStudent(form.value).subscribe(data => {
      if (data.statusCode === 201) {
        console.log('student registered successfully', data);
        this.msg = 'Student Register Success';
        form.reset();
      } else {
        this.msg = 'User Already Exist';
      }
    }, err => {
      console.log('Register Not Success');
    }, () => {
      console.log('Login Success');
    });
  }
}
