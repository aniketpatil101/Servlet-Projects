package com.ap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCapitalsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //get PrintWrtier object
		 PrintWriter pw=resp.getWriter();
		 //set response content type
		 resp.setContentType("text/html");
		 //read form data
		  int countryCode=Integer.parseInt(req.getParameter("country"));
		  //write  b.logic
		   String  capitals[]=new String[] {"New delhi","Bejing","Islmabad","WashingtonDC","London","Berlin","Tokyo","Kathmandu","Moscow"};
		   //display the capital city
		  pw.println("<h1 style='color:red;text-align:center'>Capital city is  ::"+capitals[countryCode]+"</h1>");
		  
		  // add home hyperlink
		  pw.println("<br> <a href='input.html'>home </a>");
		  
		  //close the stream
		  pw.close();
	}

}
