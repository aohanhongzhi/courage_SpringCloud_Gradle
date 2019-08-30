package cn.hxy.user;

import cn.hxy.user.ch.hxy.user.service.UserService;
import hxy.courage.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {


	@Autowired
	UserService userService;

	@GetMapping("/user")
	public User user(){
		return userService.login();
	}

	@GetMapping("/test")
	public String test(){
		return "运行成功";
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
