package com.example.map;

import java.util.Map;

public class Company 
{
	private String cname;
	private Map<Integer,String> empidandempname;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Map<Integer, String> getEmpidandempname() {
		return empidandempname;
	}
	public void setEmpidandempname(Map<Integer, String> empidandempname) {
		this.empidandempname = empidandempname;
	}
	@Override
	public String toString() {
		return "Company [cname=" + cname + ", empidandempname=" + empidandempname + "]";
	}


}
