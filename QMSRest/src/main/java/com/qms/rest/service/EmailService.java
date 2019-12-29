package com.qms.rest.service;

import com.qms.rest.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service("emailService")
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(Mail mail) {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);
            helper.setTo(mail.getTo());
            helper.setSubject(mail.getSubject());
            helper.setFrom(mail.getFrom());
            helper.setText(mail.getText(), true);
            emailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}