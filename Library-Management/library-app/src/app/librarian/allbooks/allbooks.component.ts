import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-allbooks',
  templateUrl: './allbooks.component.html',
  styleUrls: ['./allbooks.component.css']
})
export class AllbooksComponent implements OnInit {
 
  books;
  selectedBook;
  message;
  constructor(private service: LibraryserviceService, private route: Router) {
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
  updateBook(book){
    this.selectedBook = book;
  }

  editBook(book) {
    console.log('updated book', book.value)
    this.service.updateBook(book.value).subscribe( data => {
      console.log('book Updated Succes');
      this.message = 'Book Updated';
      book.reset();
      this.route.navigate(['allbooks']);
    }, err => {
      console.log('book not updated');
    }, () => {
      console.log('success');
    })
  }
  deleteBooks(book){
    console.log(book.bid);
    this.service.deleteBook(book).subscribe(data => {
      console.log('book deleted Succes');
      this.message = 'Book Deleted';
      this.route.navigate(['allbooks']);
    }, err=> {
      console.log('book Not deleted');
      this.message = 'Book Not Deleted';
    })
  }
}
