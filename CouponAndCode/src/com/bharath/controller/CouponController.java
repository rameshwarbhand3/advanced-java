package com.bharath.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bharath.model.Coupon;
import com.bharath.dao.*;

/**
 * Servlet implementation class CouponController
 * 
 * @param <CouponDao>
 */
@WebServlet("/couponController")
public class CouponController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 CouponDao dao = new CouponDao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("create")) {
			createCoupon(request, response);	
		}else if(action.equals("find")) {
			findCoupon(request,response);
		}
	}

	private void createCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("couponCode");
		String discount = request.getParameter("discount");
		String expiryDate = request.getParameter("expiryDate");

		Coupon coupon = new Coupon();
		coupon.setCode(couponCode);
		coupon.setDiscount(new BigDecimal(discount));
		coupon.setExp_date(expiryDate);

		
		dao.save(coupon);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b>product created</b>");
		out.print("<br><a href='dao'>Home</a>");
	}

	private void findCoupon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String couponCode = request.getParameter("couponCode");
		Coupon coupon = dao.findCoupon("couponCode");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(coupon);
		out.print("<br><a href='dao'>Home</a>");
	}

}
