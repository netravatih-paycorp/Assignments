package com.example.setterinjection;

public class Company 
{
  private int cid;
  private String cname;
  private String location;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Company [cid=" + cid + ", cname=" + cname + ", location=" + location + "]";
}
  
  
}
