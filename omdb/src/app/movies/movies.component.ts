import { Component, OnInit, DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit,DoCheck {
movies: any[] = [];
search;
url;
  constructor(public http: HttpClient) { }

  ngOnInit() {
  }
  ngDoCheck(){
    this.getMovies();
  }
  searchMovie(event){
    this.search=event.target.value;
console.log(event.target.value);
  }
getMovies(){
this.url=`http://www.omdbapi.com/?s=${this.search}&apikey=bb2a4cc3`;
  this.http.get<any>(this.url).subscribe(data=> {
    // console.log("data",data.Search)
    this.movies=data.Search;
  },err=> {
    console.log(err);
  },()=>{
    console.log("data get successfully");
  });
}
}
