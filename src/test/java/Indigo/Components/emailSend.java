package Indigo.Components;
import org.testng.annotations.Test;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;


public class emailSend {
    @Test
    public void emailSender (){
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Session session = Session.getDefaultInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("qa3.budget.outbound.us@gmail.com", "gmysfxoxrcovvyiv");
                        }
                    });

            try {
                Message message = new MimeMessage(session);
                message.setFrom(new
                        InternetAddress("qa3.budget.outbound.us@gmail.com"));
                message.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse("qa3.budget.outbound.us@gmail.com"));
                message.setSubject("Indigo Sanity Report");

                BodyPart messageBodyPart1 = new MimeBodyPart();

                messageBodyPart1.setText("Please find the attached report of sanity suite");

                MimeBodyPart messageBodyPart2 = new MimeBodyPart();

                String filename = System.getProperty("user.dir") +
                        "/Reports/Spark.html";

                DataSource source = new FileDataSource(filename);

                messageBodyPart2.setDataHandler(new DataHandler(source));

                // set the file
                messageBodyPart2.setFileName(filename);

                Multipart multipart = new MimeMultipart();
                multipart.addBodyPart(messageBodyPart2);
                multipart.addBodyPart(messageBodyPart1);
                message.setContent(multipart);
                Transport.send(message);

                System.out.println("=====Email Sent=====");

            } catch (MessagingException e) {

                throw new RuntimeException(e);

            }
        }
}