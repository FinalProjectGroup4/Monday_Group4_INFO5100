package Model.EmailUtil;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailUtil {

    // Method to send an email
    public static void sendEmail(String recipientEmail, String subject, String body) {
        final String smtpHost = "smtp.gmail.com";
        final int smtpPort = 587;
        final String senderEmail = "unitedhealthcaresystem@gmail.com";
        final String senderPassword = "ygft kbil zfab jmdh";

        // Force Java to use TLS 1.2
        System.setProperty("https.protocols", "TLSv1.2");
        System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");

        // SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        // Create session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            System.out.println("Email sent successfully to " + recipientEmail);
        } catch (MessagingException e) {
            e.printStackTrace();
            System.err.println("Failed to send email: " + e.getMessage());
        }
}


    // Example usage
    public static void main(String[] args) {
        String recipient = "recipient-email@example.com";
        String subject = "Test Email";
        String body = "Hello, this is a test email sent from Java.";

        sendEmail(recipient, subject, body);
    }
}
