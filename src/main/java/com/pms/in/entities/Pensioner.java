package com.pms.in.entities;
public class Pensioner extends AbstractUser
{
	private Integer pensionerId;

	public Pensioner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pensioner(String username, String password, String email, String mobile) {
		super(username, password, email, mobile);
		// TODO Auto-generated constructor stub
	}

	public Integer getPensionerId() {
		return pensionerId;
	}

	public void setPensionerId(Integer pensionerId) {
		this.pensionerId = pensionerId;
	}

	@Override
	public String toString() {
		return "Pensioner [pensionerId=" + pensionerId + "]";
	}

}