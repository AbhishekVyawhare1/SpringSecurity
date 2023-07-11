package com.jwt.example.Controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.service.FakeService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private FakeService fakeService;

	@GetMapping("/users")
	public List<User> User() {
		return fakeService.getAllUsers();

	}

	@GetMapping("/current")
	public String GetUserName(Principal principal) {
		return principal.getName();
	}
}
