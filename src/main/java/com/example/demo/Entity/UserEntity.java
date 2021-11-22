package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="user")
@Data
public class UserEntity {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=50)
	private String name;
	@Column(length=70,nullable=false,unique=true)
	private String email;
    @Column(length=70)
    private String password;
    @Column(length=70)
    private String confirmpassword;
	public static List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
