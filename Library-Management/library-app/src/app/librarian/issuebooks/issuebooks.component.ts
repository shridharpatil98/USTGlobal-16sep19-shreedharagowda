import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-issuebooks',
  templateUrl: './issuebooks.component.html',
  styleUrls: ['./issuebooks.component.css']
})
export class IssuebooksComponent implements OnInit {

  message;
  selectedStudent;
  issueBooks = new Array();
  constructor(private service: LibraryserviceService) {
    this.requestBooks();
   }

  ngOnInit() {
  }

  requestBooks() {
    this.service.requestBooks().subscribe( data => {
      console.log('requested books', data.bookIssueBeans);
      // for(let val in data.bookIssueBeans) {
      //   this.issueBooks.push(...data.bookIssueBeans[val].student, ...data.bookIssueBeans[val].book)
      // }
      for(let val=0;val<data.bookIssueBeans.length;val++){
        this.issueBooks.push({...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].student});
        // this.books.push(data.bookIssueBeans[val].student);
      }
      console.log(this.issueBooks);
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    })
  }
  studentDetail(student) {
    this.selectedStudent = student;
  }

  issueBook(book) {
    console.log(book.sid,' book ',book.bid)
    this.service.acceptIssue(book).subscribe( data => {
      this.message = 'Book Issued';
      console.log('book issued');
    }, err => {
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
}
