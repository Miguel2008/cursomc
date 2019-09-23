package com.miguelfaria.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.miguelfaria.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
