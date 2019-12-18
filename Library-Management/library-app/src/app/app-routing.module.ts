import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AuthGuard } from './auth.guard';
import { RegstudentComponent } from './admin/regstudent/regstudent.component';
import { ReglibrarianComponent } from './admin/reglibrarian/reglibrarian.component';
import { AllstudentsComponent } from './admin/allstudents/allstudents.component';
import { AddbookComponent } from './librarian/addbook/addbook.component';
import { AllbooksComponent } from './librarian/allbooks/allbooks.component';
import { BooksComponent } from './student/books/books.component';
import { MybooksComponent } from './student/mybooks/mybooks.component';
import { IssuebooksComponent } from './librarian/issuebooks/issuebooks.component';
import { ReturnbooksComponent } from './librarian/returnbooks/returnbooks.component';
import { AlllibrariansComponent } from './admin/alllibrarians/alllibrarians.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { LoginUserComponent } from './login-user/login-user.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path : 'regstudent', component : RegstudentComponent, canActivate: [AuthGuard], data: {roles : ['admin']}},
  {path : 'reglibrarian', component : ReglibrarianComponent, canActivate: [AuthGuard], data: {roles : ['admin']}},
  {path : 'getallstudents', component : AllstudentsComponent, canActivate: [AuthGuard], data: {roles : ['admin']}},
  {path : 'addbook', component : AddbookComponent, canActivate: [AuthGuard], data: {roles : ['librarian']}},
  {path : 'allbooks', component : AllbooksComponent, canActivate: [AuthGuard], data: {roles : ['librarian']}},
  {path : 'books', component : BooksComponent, canActivate: [AuthGuard], data: {roles : ['student']}},
  {path : 'mybooks', component : MybooksComponent, canActivate: [AuthGuard], data: {roles : ['student']}},
  {path : 'issuebooks', component : IssuebooksComponent, canActivate: [AuthGuard], data: {roles : ['librarian']}},
  {path : 'retuenBooks', component : ReturnbooksComponent, canActivate: [AuthGuard], data: {roles : ['librarian']}},
  {path : 'getlibrarians', component : AlllibrariansComponent, canActivate: [AuthGuard], data: {roles : ['admin']}},
  {path : 'page-not-found', component : PageNotFoundComponent},
  {path : 'user-login', component : LoginUserComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
