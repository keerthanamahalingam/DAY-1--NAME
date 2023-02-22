package com.example.name;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controllers{
	private String StudentName="Malavika";
	@GetMapping("/")
	public String getName() {
		return "Welcome "+StudentName;
	}

}