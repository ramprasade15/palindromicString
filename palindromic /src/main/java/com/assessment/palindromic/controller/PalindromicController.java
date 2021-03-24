package com.assessment.palindromic.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.palindromic.service.PalindromicService;

@RestController
public class PalindromicController {

	@Autowired
	PalindromicService palindromicService;
	
	@PostMapping("/palindrom")	
	public String retrivePalindrom(@RequestBody String str) {
		
		return palindromicService.retrivePalindrom(str);
		
	}
}
