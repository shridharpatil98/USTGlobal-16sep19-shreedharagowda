import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddbookComponent } from './addbook/addbook.component';
import { AllbooksComponent } from './allbooks/allbooks.component';
import { IssuebooksComponent } from './issuebooks/issuebooks.component';
import { ReturnbooksComponent } from './returnbooks/returnbooks.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BookFilterPipe } from './book-filter.pipe';




@NgModule({
  declarations: [
    AddbookComponent,
    AllbooksComponent,
    IssuebooksComponent,
    ReturnbooksComponent,
    BookFilterPipe],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class LibrarianModule { }
