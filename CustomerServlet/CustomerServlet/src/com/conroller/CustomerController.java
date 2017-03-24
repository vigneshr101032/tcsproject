package com.conroller;
import com.customer.Customer;
import com.service.*;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		System.out.println(action);
		if(action.equals("create"))
		{
		    String nm=request.getParameter("cname");
		    String pls=request.getParameter("city");
		    System.out.println("user name="+nm);
		    CustService cs=new CustService();
		    try
		    {
		    	String cst=cs.checkADDCust(nm,pls);
		    	if(cst==null)
		    	{
		    		RequestDispatcher rd=request.getRequestDispatcher("create.jsp");
		    		request.setAttribute("msg","invalid");
		    		rd.forward(request, response);
		    	}
		    	else
		    	{
			
		    		RequestDispatcher rd=request.getRequestDispatcher("create.jsp");
		    		request.setAttribute("msg","Customer Created Successfully");
		    		rd.forward(request, response);
			
		    	}
		
		    }
		    catch(SQLException e)
		    {
		    	e.printStackTrace();
		    }
		}
		
		else if("searching".equalsIgnoreCase(action))
		{
			System.out.println("inside servlet search");
			String nm=request.getParameter("sname");
			CustService csm=new CustService();
			Customer testcase = new Customer();

			try
			{
				System.out.println("inside try");
				testcase=csm.checkSearchCust(nm);
				if(testcase.getName().equals(""))
				{
					System.out.println("inside  if search");
					request.setAttribute("msg","invalid customer");
					RequestDispatcher rd1=request.getRequestDispatcher("search.jsp");
					
					rd1.forward(request, response);
				}
				else if(testcase.getName()!=null)
				{
					System.out.println("inside servelt  else search");
					request.setAttribute("customer", testcase);
					RequestDispatcher rd2=request.getRequestDispatcher("view.jsp");
					
					rd2.forward(request, response);
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}

}
}
