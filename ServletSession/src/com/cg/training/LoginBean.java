package com.cg.training;

public class LoginBean 
{
	private String fname;
	private String lname;
	private String gender;
	private String lang;
	private String city;
	private String address;
	private String phno;
	private String accno;
	private String PAN;
	private String credit;
	private String noofyr;
	private String roi;
	private String amt;
	private String loantype;
	private String emailid;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getNoofyr() {
		return noofyr;
	}
	public void setNoofyr(String noofyr) {
		this.noofyr = noofyr;
	}
	public String getRoi() {
		return roi;
	}
	public void setRoi(String roi) {
		this.roi = roi;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "LoginBean [fname=" + fname + ", lname=" + lname + ", gender="
				+ gender + ", lang=" + lang + ", city=" + city + ", address="
				+ address + ", phno=" + phno + ", accno=" + accno + ", PAN="
				+ PAN + ", credit=" + credit + ", noofyr=" + noofyr + ", roi="
				+ roi + ", amt=" + amt + ", loantype=" + loantype
				+ ", emailid=" + emailid + "]";
	}
	
	

}
