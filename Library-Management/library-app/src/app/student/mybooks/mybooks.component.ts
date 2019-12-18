import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-mybooks',
  templateUrl: './mybooks.component.html',
  styleUrls: ['./mybooks.component.css']
})
export class MybooksComponent implements OnInit {

  myBooks = new Array();
  issueDates = new Array();
  myData = new Array();
  issuedate;
  constructor(private service: LibraryserviceService) {
    this.getMybooks();
  }

  ngOnInit() {
  }
  getMybooks() {
    const student = JSON.parse(localStorage.getItem('userDetails'));
    console.log(student.student.sid);
    this.service.getMyBooks(student.student).subscribe(data => {
      console.log(data);
      // for (const val in data.bookIssueBeans) {
      //   this.myData.push({ ...data.bookIssueBeans[val].book, ...data.bookIssueBeans[val].issueDate});
      // }

      for(let i in data.bookIssueBeans ) {
        this.myBooks.push({ ...data.bookIssueBeans[i].book, issuedate : data.bookIssueBeans[i].issueDate});
      }
      console.log('date ',this.issueDates);
      // this.myData ={...this.issueDates, ...this.myBooks};
      console.log('my books', this.myBooks);

    }, err => {
      console.log(err);
    }, () => {
      console.log('succeess')
    })
  }
  returnBook(book) {
    const student = JSON.parse(localStorage.getItem('userDetails'));
    console.log(student[0].sid);
    this.service.returnBook(student, book).subscribe(data => {
      console.log('Book returned ', data);
    }, err => {
      console.log('book not returned');
    }, () => {
      console.log('success');
    })
  }
}
