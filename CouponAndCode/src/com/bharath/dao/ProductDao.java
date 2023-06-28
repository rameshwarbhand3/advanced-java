package com.bharath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bharath.model.Product;
import com.bharath.util.ConnectionUtil;

public class ProductDao {
public void save(Product product) {
	Connection connection = ConnectionUtil.getConnection();
	try {
		
		PreparedStatement pst = connection.prepareStatement("insert into product(name,description,price)values(?,?,?)");
		
		pst.setString(1, product.getName());
		pst.setString(2,product.getDescription());
		pst.setBigDecimal(3, product.getPrice());
		
		pst.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
