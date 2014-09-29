import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mambocoto
 */
public class eMail {
    private final String receptor;
    private String mensaje;
    final String emailemisor = "carc1903@gmail.com";//change accordingly carc1903@gmail.com
    final String contraseña = "CA19rc0391";//change accordingly
    final String host = "smtp.gmail.com";
    Date now = new Date(System.currentTimeMillis());
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
    

    public eMail(String nombre,int prioridad,String mailreceptor) {
        this.receptor=mailreceptor;
        this.mensaje="Estimado(a) "+nombre+"\nSe ha registrado para ser atendido, "
            + "su información es la siguiente:\nNombre: "+nombre+"\nTipo de cliente:"+prioridad
            +"\nFecha: "+date.format(now)+"\nHora: "+hour.format(now);
    }
    
    public void send(boolean y,String logo){
       if (y){
           this.mensaje="Ya tenemos un representante para que sea atendido";
       }
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      BodyPart texto = new MimeBodyPart();
      BodyPart adjunto = new MimeBodyPart();
      MimeMultipart multiParte = new MimeMultipart();
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         @Override
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(emailemisor,contraseña);
         }});
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailemisor));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(receptor));

            // Set Subject: header field
            message.setSubject("Correo de servicio al cliente");
            texto.setText(mensaje);
            adjunto.setDataHandler(new DataHandler(new FileDataSource(logo)));
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);
            message.setContent(multiParte);
            Transport.send(message);
            } catch (MessagingException E) {
            throw new RuntimeException(E);
        }
    }
}
