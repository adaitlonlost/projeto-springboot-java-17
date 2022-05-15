package br.com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.educandoweb.course.entities.User;
import br.com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService  {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findaAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
