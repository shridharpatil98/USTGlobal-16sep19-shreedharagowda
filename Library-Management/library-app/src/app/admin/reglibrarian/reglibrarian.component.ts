import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-reglibrarian',
  templateUrl: './reglibrarian.component.html',
  styleUrls: ['./reglibrarian.component.css']
})
export class ReglibrarianComponent implements OnInit {
  constructor(private service: LibraryserviceService) { }

  get email() {
    return this.form.get('email');
  }
  get password() {
    return this.form.get('password');
  }
  get name() {
    return this.form.get('name');
  }

  msg;
  form = new FormGroup({
    name: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required,
                                  Validators.pattern('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}')]),
    email: new FormControl('', [Validators.required])
  });

  ngOnInit() {
  }

  addLibrarian(form) {
  this.msg = null;
  console.log(form.value);
  this.service.registerLibrarian(form.value).subscribe(data => {
      if (data.statusCode === 201) {
        console.log('Librarian registered successfully', data);
        this.msg = 'Librarian Register Success';
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
