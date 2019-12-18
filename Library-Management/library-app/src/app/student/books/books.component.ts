import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  message;
  books;
  constructor(private service: LibraryserviceService) {
    this.getAllBooks();
   }
  ngOnInit() {
  }
  getAllBooks() {
    this.service.allBooks().subscribe( data => {
      console.log(data);
      this.books = data.bookBeans;
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    })
  }
  issueBook(book) {
    console.log('issue book',book);

    const student = JSON.parse(localStorage.getItem('userDetails'));
    console.log(student[0].sid);
    this.service.issueBook(student, book).subscribe( data => {
      console.log('requested issue book',data);
      this.message = 'Book is Requested to issue wait';
    }, err => {
      console.log(err);
      this.message = 'Books is not issue';
    }, () => {
      console.log('success')
    })
  }
}
