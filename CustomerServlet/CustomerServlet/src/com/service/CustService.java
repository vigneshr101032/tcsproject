package com.service;
import java.sql.SQLException;
import java.util.*;

import com.dao.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.TestGenerator;
import com.customer.*;
public class CustService 
{
  public String checkADDCust(String cname,String place) throws SQLException
  {
	  
	  CustDao cd=new CustDao();
	  String cst=cd.addCustomer(cname,place);
	  if(cst==null)
	  {
		 return null; 
	  }
	  else
	  {
		 return cst;
	  }
  }
  public Customer checkSearchCust(String name) throws SQLException
  {
	  CustDao cd=new CustDao();
	  Customer testcase2 = new Customer();
	  testcase2=cd.searchCustomer(name);
	  return testcase2;
  }
}
