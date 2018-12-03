package com.cg.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	LoginBean bean = new LoginBean();

		protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
		{
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		bean.setFname(fname);

		String lname = request.getParameter("lname");
		bean.setLname(lname);
		
		String gender = request.getParameter("gender");
		bean.setGender(gender);
		
		String lang = request.getParameter("lang");
		bean.setLang(lang);
		
		String address = request.getParameter("address");
		bean.setAddress(address);
		
		String phno = request.getParameter("phno");
		bean.setPhno(phno);
		
		String accno = request.getParameter("accno");
		bean.setAccno(accno);
		
		String PAN = request.getParameter("PAN");
		bean.setPAN(PAN);
		
		String credit = request.getParameter("credit");
		bean.setCredit(credit);
		
		String noofyr = request.getParameter("noofyr");
		bean.setNoofyr(noofyr);
		
		String roi = request.getParameter("roi");
		bean.setRoi(roi);
		
		String amt = request.getParameter("amt");
		bean.setAmt(amt);
		
		String loantype = request.getParameter("loantype");
		bean.setLoantype(loantype);
		
		String emailid = request.getParameter("emailid");
		bean.setEmailid(emailid);
		
     	HttpSession httpSession = request.getSession();
		httpSession.setAttribute("xcgfxgf", bean);
		RequestDispatcher rd=request.getRequestDispatcher("ServletView");
		rd.forward(request, response);
	}

}
