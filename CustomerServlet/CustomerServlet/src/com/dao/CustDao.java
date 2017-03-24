package com.dao;

import dbutil.DatabseUtil;
import java.sql.*;

import com.customer.Customer;
public class CustDao 
{
	Connection con=null;
	ResultSet rs = null;
	public String addCustomer(String cname,String pls) throws SQLException
	{
		String msg=null;
		con=DatabseUtil.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into CUST112233 values(?,?)");
		pst.setString(1,cname);
		pst.setString(2,pls);
		int count=pst.executeUpdate();
		if(count==1)
		{
			msg="cust added successfully";
		}
		else
		{
			msg=null;
		}
		return msg;
	}
	public Customer searchCustomer(String name) throws SQLException
	{
		int count = 0;
		Customer msg=new Customer();
		con=DatabseUtil.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from CUST112233 where name=?");
		ps.setString(1, name);
		rs= ps.executeQuery();
		while(rs.next()){
			count++;
			msg.setName(rs.getString("name"));
			msg.setPlace(rs.getString("place"));
		}
		if(count==0){
			msg.setName("");
		}

	      
		 return msg;
	 }
		

	
}
