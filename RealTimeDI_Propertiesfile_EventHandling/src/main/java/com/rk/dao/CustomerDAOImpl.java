package com.rk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.rk.bo.CustomerBO;

public final class CustomerDAOImpl implements CustomerDAO {

	//create query 
	private static final String Customer_Query_InsertValue="INSERT INTO SPRING_CUSTOMER VALUES(CNO_SEQ.NEXTVAL,?,?,?,?)";
	
	private DataSource ds;
	
	//constructor injections
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAO 0-param constructor calling::: ");
		this.ds = ds;
	}

	@Override
	public int insertCustomerDetails(CustomerBO bo) throws SQLException {
		
		//properties
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//get pooled jdbc connection
		con=ds.getConnection();
		
		//create prepared connection
		ps=con.prepareStatement(Customer_Query_InsertValue);
		
		//set query param values
		ps.setString(1,bo.getCname());
		ps.setString(2,bo.getCadd());
		ps.setFloat(3,bo.getPamt());
		ps.setFloat(4,bo.getIntramt());
		
		//execute sql query
		count=ps.executeUpdate();
		
		//close jdbc obj
		ps.close();
		con.close();
		
		//return count value
		return count;
	
	}//method

}//class
