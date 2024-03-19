package com.jwt.example.Controllers;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.service.FakeService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private FakeService fakeService;

//get All UserS
	@GetMapping
	public List<User> User() {
		return fakeService.getAllUsers();

	}

	// get Current
	@GetMapping("/current")
	public String GetUserName(Principal principal) {
		return principal.getName();
	}

//get By Id
	@GetMapping("/{id}")
	public User getByID(@PathVariable String id) {
		return fakeService.getUserById(id);

	}
}
