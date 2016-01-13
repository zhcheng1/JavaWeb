package zhilian.app;

import java.io.*;
import javax.servlet.*;

public class FirstServlet extends GenericServlet{
	
	public void service(ServletRequest req, ServletResponse res) 
	throws ServletException, java.io.IOException {
		OutputStream out = res.getOutputStream();
		out.write("Hello World!".getBytes());
	}
}