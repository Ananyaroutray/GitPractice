package infinite.OtpApp;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Authenticator;
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

@WebServlet("/ForgotPasswordServlet")
public class ForgotPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("uname");

        
        String resetCode = generateResetCode(); 
        String userEmail = getUserEmail(username); 
        
        sendResetCodeEmail(userEmail, resetCode);

        
        response.sendRedirect("ResetPassword.html");
    }

    private String generateResetCode() {
        
        return "123456"; 
    }

    private String getUserEmail(String username) {
        return "user@example.com"; 
    }

    private void sendResetCodeEmail(String userEmail, String resetCode) {
        
        String host = "smtp.example.com"; 
        String port = "587"; 
        String username = "your_username"; 
        String password = "your_password"; 

        // Email properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        // Create a session with the SMTP server
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
            message.setSubject("Password Reset Code");
            message.setText("Your password reset code is: " + resetCode);

            // Send the message
            Transport.send(message);

            // Print a message for demonstration purposes (replace with actual logging)
            System.out.println("Reset code sent to: " + userEmail);
        } catch (MessagingException e) {
            e.printStackTrace(); // Handle exceptions appropriately in your application
        }
    }
}
