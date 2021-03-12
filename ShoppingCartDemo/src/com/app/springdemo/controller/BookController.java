package com.app.springdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.springdemo.entity.Book;
import com.app.springdemo.entity.Order;
import com.app.springdemo.entity.User;
import com.app.springdemo.service.BookService;
import com.app.springdemo.service.UserService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	
	//To display all books in store
	
	@RequestMapping(path="/list",method=RequestMethod.GET)
	public String listBooks(Model theModel)
	{
		
		List<Book> theBook = bookService.getBooks();
		theModel.addAttribute("books", theBook);
		return "display-books";
	}
	
	//To display home page
	@GetMapping(path="/home")
	public String showFormForHome(Model theModel)
	{
		
		return "home-page";
		
	}
	
	//To display form for purchase
	@GetMapping("/showFormForPurchase")
	public String showFormForPurchase(@RequestParam("bookId") String theId, Model theModel) {
		Book theBook = bookService.getBook(theId);
		theModel.addAttribute("book", theBook);
		Order theOrder = new Order();
		theModel.addAttribute("order", theOrder);
		return "purchase-book";

	}
	//To display form of order details.To confirm purchase
	@PostMapping("/purchaseDetails")
	public String purchaseBook(@ModelAttribute("order") Order theOrder,@RequestParam("bookId") String theId,Model theModel)
	{
		Book theBook = bookService.getBook(theId);
		theModel.addAttribute("book", theBook);
		return "order-details";
		
	}
	
	//To save purchase order into database
	@PostMapping("/saveOrder")
	public String saveOrder(@ModelAttribute("order") Order theOrder,@RequestParam("bookId") String theId,Model theModel)
	{
		
		Book theBook = bookService.getBook(theId);
		theOrder.setBook(theBook);
		bookService.saveOrder(theOrder);
		return "successOrder";
		
	}
	
	//To cancel user
		@GetMapping("/deleteOrder")
		public String deleteOrder( @RequestParam("orderId") int theId) {
			bookService.deleteOrder(theId);
			return "cancel-success";
		}
	
	//To display form for login for users
	@GetMapping("/showFormForLogin")
	public String showFormForLogin(Model theModel){
			return "login-form";
	}
		
	//To check whether username and password matches username and password in database
	@GetMapping("/loginUser")
	public String loginUser(HttpServletRequest request,HttpServletResponse response,Model theModel){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		List<User> user=userService.loginUser(username,password);
		if(user != null &&user.size()>0) {
			theModel.addAttribute("user", user);
			return "success";
		}
		else 
			return "error";
	}
		
	//To show form for user registration
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel){
		//create a model attribute to bind form data
		User theUser = new User();
		theModel.addAttribute("user", theUser);
		return "user-form";
	}
		
	//To save user
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User theUser)
	{
		 
		userService.saveUser(theUser);
		return "login-form";
	}
	//To display form for updating user details
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("userId") int theId, Model theModel) {
		User theUser = userService.getUser(theId);
		theModel.addAttribute("user", theUser);
		return "user-form";
	}
	//To delete user
	@GetMapping("/delete")
	public String delete( @RequestParam("userId") int theId) {
		userService.deleteUser(theId);
		return "redirect:/user/showFormForAdd";
	}
	
}

