package com.example;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {
    public static void main(String[] args) {
        String host = "smtp.office365.com";
        int port = 587;
        final String user = "teste@dominio.com.br";
        final String pass = "senha_do_email";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);
        
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse("teste@novodominio.com.br")
            );
            message.setSubject("Teste de e-mail");
            message.setText("Teste de envio de e-mail.");

            Transport.send(message);

            System.out.println("E-mail enviado com sucesso!");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Erro ao enviar e-mail: " + e.getMessage());
        }
    }
}
