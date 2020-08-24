package com.tunisietelecom.HelloTunisia;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TnRestController {


	@GetMapping("/blacklist")
	public String getHello() {
		//return "error";
			return "{{ name:Yusuf, age:30, ID:34564332 },{ name:Hamza, age:22, ID:6434253 }}";

	}
	@GetMapping("/time")
	public String getLocalTime() {
		return "Time in tunisia is " + LocalDateTime.now();
	}
}
