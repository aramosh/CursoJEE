package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSuma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

		pw.append("<html><head>");
		pw.append("<title>ServletSuma</title>");
		pw.append("</head><body>");

		 
		String sNumero1 = request.getParameter("numero1");
		int iNumero1 = Integer.parseInt(sNumero1);
		
		String sNumero2 = request.getParameter("numero2");
		int iNumero2 = Integer.parseInt(sNumero2);
		int suma = iNumero1 + iNumero2;
		
		pw.append("<div style=\"text-align: center;\">");
	    pw.append("<h1> Esta es tu suma</h1>");
	    pw.append("</b>");
	    pw.append("<h2> La suma de " + sNumero1 + " + " + sNumero2 + " es: " + 
	    		"<b style=\"color: green;\">" + suma);
	    pw.append("</b>");
	    pw.append("</div></body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
