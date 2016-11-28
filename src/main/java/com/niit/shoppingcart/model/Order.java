package com.niit.shoppingcart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component

public class Order implements Serializable {
	private  static final long serialVersionUID=1L;
	private String userID;
	private String orderID;
	private ShippingAddress shippingAddress;
	private BillingAddress billingAddress;
	private Cart cart;
	private long totalAmount;
	private PaymentMethod paymentMethod;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	/*public void setPaymentMethod(PaymentMethod paymentMethod2) {
		this.paymentMethod = paymentMethod2;
	}*/
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setPaymentMethod(PaymentMethod paymentMethod2) {
		// TODO Auto-generated method stub
		
	}
	
	

	
}
	
	