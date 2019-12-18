import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-returnbooks',
  templateUrl: './returnbooks.component.html',
  styleUrls: ['./returnbooks.component.css']
})
export class ReturnbooksComponent implements OnInit {

  books = new Array();
  student;
  message;
  constructor(private service: LibraryserviceService) {
    this.returnBooks();
  }

  ngOnInit() {
  }
  returnBooks() {
    this.service.returnRequestedBooks().subscribe(data => {
      console.log('requested books', data.bookIssueBeans);
      // for(let val in data.bookIssueBeans) {
      //   this.issueBooks.push(...data.bookIssueBeans[val].student, ...data.bookIssueBeans[val].book)
      // }
      for (let val = 0; val < data.bookIssueBeans.length; val++) {
        this.books.push({ ...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].student });
        // this.books.push(data.bookIssueBeans[val].student);
      }
      console.log(this.books);
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
  studentDetail(student) {
    this.student = student;
  }
  returnBook(book) {
    console.log(book.sid, ' book ', book.bid);
    this.service.acceptReturn(book).subscribe(data => {
      this.message = 'Book Returned';
      console.log('book issued');
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
}
