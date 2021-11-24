package com.pms.in.entities;
public class PensionDetails
{
 private Double amount;
 private Double charges;
 private String bankType;
 private int statusCode;
public PensionDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public PensionDetails(Double amount, Double charges, String bankType, int statusCode) {
	super();
	this.amount = amount;
	this.charges = charges;
	this.bankType = bankType;
	this.statusCode = statusCode;
}
public Double getAmount() {
	return amount;
}
public void setAmount(Double amount) {
	this.amount = amount;
}
public Double getCharges() {
	return charges;
}
public void setCharges(Double charges) {
	this.charges = charges;
}
public String getBankType() {
	return bankType;
}
public void setBankType(String bankType) {
	this.bankType = bankType;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
@Override
public String toString() {
	return "PensionDetails [amount=" + amount + ", charges=" + charges + ", bankType=" + bankType + ", statusCode="
			+ statusCode + "]";
}
 
 
}