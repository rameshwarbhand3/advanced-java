package com.bharath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bharath.model.Coupon;
import com.bharath.util.ConnectionUtil;

public class CouponDao {
	
	public void save(Coupon coupon) {
		Connection connection = ConnectionUtil.getConnection();
		try {
			
			PreparedStatement pst = connection
					.prepareStatement("insert into coupon(code,discount,exp_date)values(?,?,?)");

			pst.setString(1, coupon.getCode());
			pst.setBigDecimal(2, coupon.getDiscount());
			pst.setString(3, coupon.getExp_date());

			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Coupon findCoupon(String code) {
		Coupon coupon = new Coupon();
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement("select * from coupon where id =?");
			pst.setString(1, code);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				coupon.setId(rs.getInt(1));
				coupon.setCode(rs.getString(2));
				coupon.setDiscount(rs.getBigDecimal(3));
				coupon.setExp_date(rs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return coupon;

	}

}
