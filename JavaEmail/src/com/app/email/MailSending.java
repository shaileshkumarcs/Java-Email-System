package com.app.email;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MailSending
 */
@WebServlet("/send")
public class MailSending extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MailSending() {
        super();
        // TODO Auto-generated constructor stub
    }
    // Servlet Post Method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set content type
		response.setContentType("text/html");
		
		// Printwrier method for write output on browser
		//PrintWriter out = response.getWriter();
		
		//get Value form index page
		String emailid = request.getParameter("email");
		String subject = request.getParameter("subject");
		String messages = request.getParameter("comments");
		
		// Add Your email where you want to send
		String to = emailid;

		// Sender's email ID needs to be mentioned
		final String from = "XXXXXXX@gmail.com";// change
														// accordingly
		final String password = "XXXXXXX";// change
												// accordingly
		// Assuming you are sending email through xxx@gmail.com
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "587");

		// Get the Session object.
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

			// Set Subject: header field
			message.setSubject(subject);

			// Now set the actual message
			message.setText(messages);
			// Send message
			Transport.send(message);
			response.sendRedirect("index.jsp?v=0");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}
