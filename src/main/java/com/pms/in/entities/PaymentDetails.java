package com.pms.in.entities;

import java.time.LocalTime;
import java.util.Date;

public class PaymentDetails
{
 private Integer paymentId;
 private Date paymentDate;
 private LocalTime paymentTime;
 private String paymentStatus;
public PaymentDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public PaymentDetails(Integer paymentId, Date paymentDate, LocalTime paymentTime, String paymentStatus) {
	super();
	this.paymentId = paymentId;
	this.paymentDate = paymentDate;
	this.paymentTime = paymentTime;
	this.paymentStatus = paymentStatus;
}
public Integer getPaymentId() {
	return paymentId;
}
public void setPaymentId(Integer paymentId) {
	this.paymentId = paymentId;
}
public Date getPaymentDate() {
	return paymentDate;
}
public void setPaymentDate(Date paymentDate) {
	this.paymentDate = paymentDate;
}
public LocalTime getPaymentTime() {
	return paymentTime;
}
public void setPaymentTime(LocalTime paymentTime) {
	this.paymentTime = paymentTime;
}
public String getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}
@Override
public String toString() {
	return "PaymentDetails [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentTime=" + paymentTime
			+ ", paymentStatus=" + paymentStatus + "]";
}
 
 
}