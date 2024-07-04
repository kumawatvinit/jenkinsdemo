package com.vinit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
@GetMapping("/msg")

	public String show() {
		return "%cWelcome to first project";
	}

}
