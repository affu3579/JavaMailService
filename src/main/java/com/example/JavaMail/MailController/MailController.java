package com.example.JavaMail.MailController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.JavaMail.MailService.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	
	private MailService mailService;
	
	public  MailController(MailService mailService) {
		this.mailService=mailService;
	}
	
	@PostMapping("/send")
	public String sendMail(@RequestParam(value = "file",required = false)MultipartFile [] file,String to,String cc,String subject,String body ) {
		//TODO: process POST request
		
		return mailService.sendMail(file,to,cc,subject,body);
	}
	

}
