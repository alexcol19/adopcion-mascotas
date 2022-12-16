package com.unab.adopcion.Controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.unab.adopcion.Models.Admin;

@SpringBootApplication
public class AdminController {

	public static void main(String[] args) {
		SpringApplication.run(AdminController.class, args);
	}
	Admin admin= new Admin ();
	

}