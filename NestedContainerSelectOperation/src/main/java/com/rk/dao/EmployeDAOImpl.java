package com.rk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.rk.bo.EmployeBO;

public class EmployeDAOImpl implements EmployeDAO {
	
	//sql
	private  static final String EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
	
	//properties
	private DataSource ds;

	public EmployeDAOImpl(DataSource ds) {
		System.out.println("0-param constructor in EmployeDAO ");
		this.ds = ds;
	}

	@Override
	public List<EmployeBO> getEmpDetails(String desg1, String desg2, String desg3) throws Exception {
		
		//properties
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<EmployeBO> listBo=null;
		EmployeBO bo=null;
		
try {
			
		//get pooled connection
		con=ds.getConnection();
		
		//create prepared statement
		ps=con.prepareStatement(EMP_DETAILS);
		
		//set querry param values
		ps.setString(1,desg1);
		ps.setString(2,desg2);
		ps.setString(3,desg3);
		
		//execute query
		rs=ps.executeQuery();
		
		//convert result set  TO ListBO
		listBo= new ArrayList();
		
		while(rs.next())
		{
			bo= new EmployeBO();
			
			//copy each record rs to listBO
			bo.setEmpNo(rs.getInt(1));
			bo.setName(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
		
			//add each record in list
			listBo.add(bo);
			
		}//while
		
}//try
	
	catch (Exception e) {
	e.printStackTrace();
	System.out.println("internal problem");
	
	}
	
finally {
	
	try {
	if(con!=null)
	{
		con.close();
	}
	}//try
	catch (Exception e) {
	e.printStackTrace();	
	}
	
	try {
		if(ps!=null)
		{
			ps.close();
		}
		}//try
		catch (Exception e) {
		e.printStackTrace();	
		}
	
	try {
		if(rs!=null)
		{
			rs.close();
		}
		}//try
		catch (Exception e) {
		e.printStackTrace();	
		}
	
}//finally
	
	
//returning the the value 
return listBo;

	}//method

}//class
