package com.cg.capbook.beans;


public class Date {
	private Date date;
	private Date month;
	private Date year;

	public Date() {}
	//	String pattern = "dd-MM-yyyy";
	//	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	public Date(Date date, Date month, Date year) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
}
