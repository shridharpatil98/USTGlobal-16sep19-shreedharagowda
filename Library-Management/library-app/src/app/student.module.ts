import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BooksComponent } from './student/books/books.component';
import { MybooksComponent } from './student/mybooks/mybooks.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BookFilterPipe } from './student/book-filter.pipe';

@NgModule({
  declarations: [BooksComponent, MybooksComponent, BookFilterPipe],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class StudentModule { }
