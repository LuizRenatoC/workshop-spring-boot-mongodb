package com.luizrenato.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizrenato.workshopmongo.domain.User;
import com.luizrenato.workshopmongo.dto.UserDTO;
import com.luizrenato.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		return this.repo.findById(id).orElse(null);
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
}