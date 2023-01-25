package com.example.FirstMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstMongoDbApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(FirstMongoDbApplication.class, args);
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
