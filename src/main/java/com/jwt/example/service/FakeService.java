package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class FakeService {

	private List<User> list = new ArrayList<>();

	public FakeService() {
		list.add(new User(UUID.randomUUID().toString(), "Abhishek", "abhi@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Avneet", "Avneet@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Priyanka", "Priyanka@gmail.com"));
		list.add(new User(UUID.randomUUID().toString(), "Virat", "Virat@gmail.com"));
	}

	// get All
	public List<User> getAllUsers() {
		return this.list;
	}

	// get By Id

	public User getUserById(String id) {
		return list.stream().filter(e -> e.getUserId().equals(id)).findFirst().get();
	}
}
