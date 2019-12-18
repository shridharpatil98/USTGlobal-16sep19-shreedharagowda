import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';
import { AdminModule } from './admin/admin.module';
import { StudentModule } from './student.module';
import { LibrarianModule } from './librarian/librarian.module';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { NgMarqueeModule } from 'ng-marquee';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LoginUserComponent } from './login-user/login-user.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    PageNotFoundComponent,
    LoginUserComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AdminModule,
    StudentModule,
    NgMarqueeModule,
    LibrarianModule,
    RouterModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
