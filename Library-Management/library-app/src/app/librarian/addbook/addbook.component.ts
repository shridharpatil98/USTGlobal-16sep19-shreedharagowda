import { Component, OnInit } from '@angular/core';
import { LibraryserviceService } from 'src/app/libraryservice.service';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  message;
  available = 'available';
  constructor(private service: LibraryserviceService) { }

  ngOnInit() {
  }

  addBook(book) {
    this.message = null;
    console.log(book.value);
    this.service.addBook(book.value).subscribe(data => {
      console.log('book added');
      this.message = 'Book Added';
      book.reset();
    }, err => {
      this.message = 'book not Added';
      console.log(err);
    }, () => {
      console.log('success');
    });
  }
}
