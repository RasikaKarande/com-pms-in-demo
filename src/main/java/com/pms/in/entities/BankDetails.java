package com.pms.in.entities;
public class BankDetails
{
 private String bankName;
 private Long accno;
 private String branch;
 private String ifscCode;
 private String AccHolderName;
public BankDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public BankDetails(String bankName, Long accno, String branch, String ifscCode, String accHolderName) {
	super();
	this.bankName = bankName;
	this.accno = accno;
	this.branch = branch;
	this.ifscCode = ifscCode;
	AccHolderName = accHolderName;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Long getAccno() {
	return accno;
}
public void setAccno(Long accno) {
	this.accno = accno;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public String getAccHolderName() {
	return AccHolderName;
}
public void setAccHolderName(String accHolderName) {
	AccHolderName = accHolderName;
}
@Override
public String toString() {
	return "BankDetails [bankName=" + bankName + ", accno=" + accno + ", branch=" + branch + ", ifscCode=" + ifscCode
			+ ", AccHolderName=" + AccHolderName + "]";
}
 
 
}