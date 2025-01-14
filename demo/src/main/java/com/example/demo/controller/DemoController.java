package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@PostMapping("/ocean/test")
	public ResponseEntity<Map<String, Object>> clientSessionInfo(@RequestBody Map<String,Object> param) throws Exception {
		
		return ResponseEntity.status(HttpStatus.OK).body(new HashMap<>());
	} 
}
