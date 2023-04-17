package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String emailpara, String assunto, String msg) throws EmailException {
	Email email = new SimpleEmail();
	email.setHostName("smtp.office365.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("mariana_furtuoso@hotmail.com", "XXXXX"));
	email.setFrom("mariana_furtuoso@hotmail.com");
	email.setSubject(assunto);
	email.setMsg(msg);
	email.addTo(emailpara);
	email.setStartTLSEnabled(true);
	email.setDebug(true);
	email.send();
	}

}
