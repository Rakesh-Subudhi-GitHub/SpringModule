package com.rk.dao;

import com.rk.bo.CustomerBO;

public interface CustomerDAO {

	public int insertCustomerDetails(CustomerBO bo)throws Exception;
}
