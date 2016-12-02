package com.liuke.tuboo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException,IOException{
		
		res.setContentType("Text/html");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = res.getWriter();
		out.println("<HTML>");
	    out.println("<HEAD><TITLE>Hello World</TITLE></HEAD>");
	    out.println("<BODY>");
	    out.println("<BIG>Hello World</BIG>");
	    out.println("</BODY></HTML>");
		
	}

}
