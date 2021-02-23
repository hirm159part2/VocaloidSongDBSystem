package vocaloid.songdb.system.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

	@GetMapping("/")
	public String loadIndex() {
		return "index";
	}


}
