package com.web;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("fName");
		System.out.println(firstName);
		String midddleName = request.getParameter("mName");
		System.out.println(midddleName);
		String lastName = request.getParameter("lName");
		System.out.println(lastName);
		String userid = request.getParameter("username");
		System.out.println(userid);
		String password = request.getParameter("password");
		System.out.println(password);
		String date = request.getParameter("dob");
		
		try {
			Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(date);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
