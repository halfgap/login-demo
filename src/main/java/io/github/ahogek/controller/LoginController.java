package io.github.ahogek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登入demo小项目Controller
 * 
 * @author AhogeK
 *
 */
@RestController
@RequestMapping("/login")
public class LoginController {
	
	/**
	 * 接口测试
	 * 
	 * @return Hello World
	 */
	@GetMapping("/test")
	public String test() {
		return "Hello Wold!";
	}
	
	
}
