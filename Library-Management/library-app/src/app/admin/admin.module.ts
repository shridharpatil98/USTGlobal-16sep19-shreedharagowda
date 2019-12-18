import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReglibrarianComponent } from './reglibrarian/reglibrarian.component';
import { RegstudentComponent } from './regstudent/regstudent.component';
import { AllstudentsComponent } from './allstudents/allstudents.component';
import { AlllibrariansComponent } from './alllibrarians/alllibrarians.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { StudentFilterPipe } from './student-filter.pipe';


@NgModule({
  declarations: [ReglibrarianComponent,
    RegstudentComponent,
    AllstudentsComponent,
    AlllibrariansComponent,
    StudentFilterPipe],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class AdminModule { }
