package com.example.demo.Service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.UserEntity;
import com.example.demo.Repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
	
	private UserRepository userrepository;
	
	public UserEntity addUserToBD(UserEntity userEntity ) {
		return userrepository.save(userEntity);
		
	}
	public List<UserEntity>getAllUser(){
		return UserEntity.findAll(); 
	}

}
