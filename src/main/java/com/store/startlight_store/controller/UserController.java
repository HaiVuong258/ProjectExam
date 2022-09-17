package com.store.startlight_store.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.startlight_store.entities.User;
import com.store.startlight_store.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userSer;

	@GetMapping("/user")
	public String showUserList(@RequestParam(name = "page", required = false,defaultValue = "1") int pageNo,
			@RequestParam(name= "sortField",required = false,defaultValue = "id") String sortField,
			@RequestParam(name= "sortDir",required = false,defaultValue = "asc")String sortDir,
			
			Model model) {
		int pageSize = 3;// so luong user 1 trang
		Page<User> pageUser = userSer.findAll(pageNo, pageSize,sortField,sortDir);
		List<User> users = pageUser.getContent();
		model.addAttribute("currentPage", pageNo);// luu cai so trang hien tai
		model.addAttribute("totalPage", pageUser.getTotalPages());
//		model.addAttribute("totalItem", pageUser.getTotalElements());
		
		//sort
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");// cu phap dieu kien
		model.addAttribute("users", users);
		return "user";
	}

	@GetMapping("/signup")
	public String showSignUpForm(User user) {
		return "add-user";
	}

	@GetMapping("/edituser")
	public String editUserForm(@RequestParam(name = "userId")Long id, Model model) {
		User user =  userSer.findUserById(id);
		model.addAttribute("user", user);
		return "edit-user";
	}
	@PostMapping("edituser")
	public String updateUser(@RequestParam(name = "userId")Long id,@Valid User user, BindingResult result, Model model ){
		if(result.hasErrors()) {
			user.setId(id);
			return "edit-user";
		}
		userSer.updateUser(id, user);
		return "redirect:/user";
	}
	
	@GetMapping("/deleteuser")
	public String deleteUser(@RequestParam(name = "userId")Long id,Model model  ) {
		userSer.deleteUser(id);
		return "redirect:/user";
	}
	
	
	@PostMapping("/adduser")//@Valid dung de bao loi trong cai @notblank
	public String addUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-user";
		}
		userSer.addUser(user);
//	userSer.updateUser(user);
		return "redirect:/user";
	}
	
}
