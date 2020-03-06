package com.example.docker.dockerizeSPA;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
@RequestMapping("/hello")
@ResponseBody
public String sayHello() {
return "Hello World Welcome to Capgemini DevOps Developer share point!!!";
}
}
