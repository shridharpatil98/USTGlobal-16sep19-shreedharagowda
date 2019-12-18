import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LibraryserviceService {

  isAdmin = false;
  isLibrarian = false;
  isStudent = false;
  constructor(public http: HttpClient) { }

  userLogin(user) {
    return this.http.post<any>(`http://localhost:8080/lms/userlogin/${user.email}/${user.password}`, user);
  }

  adminLogin(admin) {
    return this.http.post<any>(`http://localhost:8080/lms/adminlogin/${admin.id}/${admin.password}`, admin);
  }
  registerStudent(student) {
    return this.http.post<any>(`http://localhost:8080/lms/registerStudent`, student);
  }

  registerLibrarian(librarian) {
    return this.http.post<any>(`http://localhost:8080/lms/registerLibrarian`, librarian);
  }

  librarianLogin(librarian) {
    return this.http.post<any>(`http://localhost:8080/lms/librarianlogin/${librarian.email}/${librarian.password}`, librarian);
  }

  addBook(book) {
    return this.http.put<any>(`http://localhost:8080/lms/addBook`, book);
  }

  allBooks() {
    return this.http.get<any>(`http://localhost:8080/lms/getAllBook`);
  }

  updateBook(book) {
    return this.http.put<any>(`http://localhost:8080/lms/updateBook`, book);
  }

  deleteBook(book) {
    return this.http.delete<any>(`http://localhost:8080/lms/removeBook/${book.bid}`);
  }
  studentLogin(student) {
    return this.http.post<any>(`http://localhost:8080/lms/studentLogin/${student.usn}/${student.password}`, student);
  }
  issueBook(student, book) {
    return this.http.put<any>(`http://localhost:8080/lms/request/${student[0].sid}/${book.bid}`, student);
  }
  getMyBooks(student) {
    return this.http.get<any>(`http://localhost:8080/lms/getMyBooks/${student.sid}`);
  }
  returnBook(student, book) {
    return this.http.put<any>(`http://localhost:8080/lms/returnBook/${student[0].sid}/${book.bid}`,book);
  }
  requestBooks() {
    return this.http.get<any>(`http://localhost:8080/lms/issueBook`);
  }

  returnRequestedBooks() {
    return this.http.get<any>(`http://localhost:8080/lms/returnBook`);
  }
  acceptIssue(book) {
    return this.http.get<any>(`http://localhost:8080/lms/acceptIssue/${book.sid}/${book.bid}`);
  }
  acceptReturn(book) {
    return this.http.get<any>(`http://localhost:8080/lms/acceptReturn/${book.sid}/${book.bid}`);
  }
  getAllStudents() {
    return this.http.get<any>(`http://localhost:8080/lms/getAllStudents`);
  }
  deleteStudent(student) {
    return this.http.delete<any>(`http://localhost:8080/lms/deleteStudent/${student.sid}`);
  }
  getAllLibrarians() {
    return this.http.get<any>(`http://localhost:8080/lms/getAllLibrarian`);
  }
}
