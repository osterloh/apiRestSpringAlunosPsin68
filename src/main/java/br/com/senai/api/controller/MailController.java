package br.com.senai.api.controller;

import br.com.senai.domain.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MailController {

	private EmailService emailService;

	@GetMapping("/mail")
	public void sendMail(){
		emailService.mail();
	}
}
