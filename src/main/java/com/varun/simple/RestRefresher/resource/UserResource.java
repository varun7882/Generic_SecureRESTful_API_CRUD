package com.varun.simple.RestRefresher.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varun.simple.RestRefresher.model.Users;
import com.varun.simple.RestRefresher.repository.UsersRepository;

@RestController
@RequestMapping("/users")
public class UserResource {

	@Autowired
	UsersRepository userRepo;
	
	@GetMapping("/all")
	public List<Users> getAllUsers()
	{
		List<Users> listUsers=userRepo.findAll();
		return listUsers;
	}
	
	@GetMapping("/findid/{Id}")
	public Users  getUserById(@PathVariable(value="Id") Integer id)
	{
		return userRepo.findById(id)
				.orElseThrow(null);
		
	}
	@PostMapping("/add")
	public Users  addUser(@Valid @RequestBody Users u)
	{
		return userRepo.save(u);
	}
	@GetMapping("/del/{Id}")
	public void  deleteUserById(@PathVariable(value="Id") Integer id)
	{
		Users u=userRepo.findById(id).orElseThrow(null);
    	 userRepo.delete(u);
		
	}
	
}
