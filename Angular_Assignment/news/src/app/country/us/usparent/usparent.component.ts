import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-usparent',
  templateUrl: './usparent.component.html',
  styleUrls: ['./usparent.component.css']
})
export class UsparentComponent implements OnInit {
news;
select;
  constructor(public http: HttpClient) {
    this.getNews();
   }

  ngOnInit() {
  }
  fun(n){
    this.select=n;
  }
  getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=b0a4ca5880ab41f3b3194e40dedaec58').subscribe(data=>{
      console.log(data);
      this.news=data.articles;
    },err=>{
      console.log(err);
    },()=>{
      console.log('data get successfully');
    })
  }
}
