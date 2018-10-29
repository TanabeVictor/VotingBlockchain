package Model;

import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

public class SendHTMLEmail {

    public void sendEmail(String eleitorEmail, String[] messageText) throws MessagingException {
        String host = "smtp.gmail.com";
        String user = "votingblockchainunifei@gmail.com";
        String pass = "#Bl0ckch4in";
        String to = eleitorEmail;
        String from = "votingblockchain@outlook.com";
        String subject = "Contato VotingBlockchain - Confirmação de Voto";
        boolean sessionDebug = false;

        Properties props = System.getProperties();

        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.required", "true");

        Session mailSession = Session.getDefaultInstance(props, null);
        mailSession.setDebug(true);

        MimeMessage message = new MimeMessage(mailSession);
        mailSession.setDebug(sessionDebug);
        message.setSubject(subject);
        message.setFrom(new InternetAddress(from));
        InternetAddress[] address = {new InternetAddress(to)};
        message.setRecipients(Message.RecipientType.TO, address);

        //
        // Este email HTML tem 2 partes, BODY e imagem embutida
        //
        MimeMultipart multipart = new MimeMultipart("related");
        // 1a parte- html
        String corrigida1 = messageText[18].replace(",", "");
        String corrigida2 = messageText[12].replace(",", "");

        BodyPart messageBodyPart = new MimeBodyPart();
        String htmlText = "<H1>Dados do Voto</H1><br>Olá, eleitor <b>" + corrigida1
                + "</b>, tudo bem?<br><br>Estamos te enviando esse email para confirmar o seu voto!<br>No dia de hoje, você votou em: <b>" + messageText[3]
                + "</b>.<br>No aparelho de identificação: <b>" + messageText[7] + "</b>.<br>E seu voto foi no candidato: <b>"
                + corrigida2 + "</b>.<br><br>Algum dado não confere? Envie um email para votingblockchainunifei@gmail.com<br><br>Obrigado!<br><br><img src=\"cid:image\">";

        messageBodyPart.setContent(htmlText, "text/html");
        // Adiciona
        multipart.addBodyPart(messageBodyPart);
        // Segunda parte - a imagem
        messageBodyPart = new MimeBodyPart();
        DataSource fds = new FileDataSource("src/Img/Assinatura/assinatura.jpg");
        messageBodyPart.setDataHandler(new DataHandler(fds));
        messageBodyPart.setHeader("Content-ID", "<image>");
        //Adiciona
        multipart.addBodyPart(messageBodyPart);
        // coloca tudo junto
        message.setContent(multipart);
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(host, user, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
