package com.ustglobal.lms.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.bean.AdminBean;
import com.ustglobal.lms.bean.LibrarianBean;
import com.ustglobal.lms.bean.LibraryResponse;
import com.ustglobal.lms.bean.StudentBean;
import com.ustglobal.lms.bean.UserBean;
import com.ustglobal.lms.service.AdminService;

@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
@RestController
public class AdminController {

	private final int successCode=201;
	
	private final int failCode=401;
	
	@Autowired
	private AdminService service;
	
	@PostMapping(path = "/userlogin/{email}/{password}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse userLogin(@PathVariable("email") String email,
			@PathVariable("password") String password,
			HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();
		
		UserBean bean=service.userLogin(email, password);
		if(bean!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("admin", bean);
			response.setUserBeans(bean);
			response.setStatusCode(successCode);
			response.setMessage("Succes");
			response.setDescription("Login Success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage("Failure");
			response.setDescription("User not found");
			return response;
		}
	}
	
	
	
	@GetMapping(path = "/adminlogin/{id}/{password}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse login(@PathVariable("id") int id,
			@PathVariable("password") String password,
			HttpServletRequest request) {
		LibraryResponse response=new LibraryResponse();
		
		AdminBean bean=service.login(id, password);
		if(bean!=null) {
			HttpSession session=request.getSession();
			session.setAttribute("admin", bean);
			response.setAdminBeans(Arrays.asList(bean));
			response.setStatusCode(successCode);
			response.setMessage("Succes");
			response.setDescription("Login Success");
			return response;
		}else {
			response.setStatusCode(successCode);
			response.setMessage("Failure");
			response.setDescription("User not found");
			return response;
		}
	}
	@PostMapping(path = "/registerStudent",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse register(@RequestBody StudentBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(service.registerStudent(bean)) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setDescription("Student data add to DB");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Student data not add to DB");
			return response;
		}
	}

	@PostMapping(path = "/registerLibrarian",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse registerLibrarian(@RequestBody LibrarianBean bean) {
		LibraryResponse response=new LibraryResponse();
		if(service.registerLibrarian(bean)) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setDescription("Librarian data add to DB");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Librarian data not add to DB");
			return response;
		}
	}
	@DeleteMapping(path = "/deleteStudent/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteStudent(@PathVariable("id") int id) {
		LibraryResponse response=new LibraryResponse();
		
		if(service.deleteStudent(id)) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setDescription("Student data removed from DB");
			return response;
		}else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Student data Not Exist");
			return response;
		}
	}
	
	@DeleteMapping(path = "/deleteLibrarian/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse deleteLibrarian(@PathVariable("id") int id) {
		LibraryResponse response=new LibraryResponse();
		
		if(service.deleteLibrarian(id)) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setDescription("Librarian data removed from DB");
			return response;
		} else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Librarian Not Exist");
			return response;
		}
	}
	
	@GetMapping(path = "/getAllLibrarian",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllLibrarian() {
		LibraryResponse response=new LibraryResponse();
		List<LibrarianBean> beans=service.getAllLibrarians();
		if(beans!=null) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setLibrarianBeans(beans);
			response.setDescription("Librarian data removed from DB");
			return response;
		} else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Librarian Not Exist");
			return response;
		}
	}
	
	@GetMapping(path = "/getAllStudents",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getAllStudents() {
		LibraryResponse response=new LibraryResponse();
		List<StudentBean> beans=service.getAllStudents();
		if(beans!=null) {
			response.setStatusCode(successCode);
			response.setMessage("Success");
			response.setStudentBeans(beans);
			response.setDescription("Librarian data removed from DB");
			return response;
		} else {
			response.setStatusCode(failCode);
			response.setMessage("Failure");
			response.setDescription("Librarian Not Exist");
			return response;
		}
	}
}