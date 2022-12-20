package com.unab.adopcion.Controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

@SpringBootApplication
public class AdminController {

	public static void main(String[] args) {
		SpringApplication.run(AdminController.class, args);
	}
	Admin admin= new Admin ();
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	

}