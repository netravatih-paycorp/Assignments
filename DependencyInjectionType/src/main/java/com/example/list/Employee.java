package com.example.list;

import java.util.List;

public class Employee 
{
 private int id;
 private String ename;
 private List<String> projects;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public List<String> getProjects() {
	return projects;
}
public void setProjects(List<String> projects) {
	this.projects = projects;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", projects=" + projects + "]";
}
 
 
}
