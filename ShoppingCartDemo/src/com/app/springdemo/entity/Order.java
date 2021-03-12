package com.app.springdemo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="order_details")
public class Order implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8214571384347278113L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int order_id;
	@Column(name="cust_name")
	private String cust_name;
	@Column(name="phone_no")
	private String phone_no;
	@Column(name="address")
	private String address;
	@Column(name="order_date")
	private Date order_date=new Date();
	@Column(name="quantity")
	private int quantity;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="book_id")
	private Book book;
	
	public Book getBook() {
		return book;
	}
	

	public void setBook(Book book) {
		this.book = book;
	}
	public Order() {
		super();
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
