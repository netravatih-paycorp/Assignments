package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phno;
	private String email;
	@OneToOne
	private PanCard card;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phno=" + phno + ", email=" + email + ", card=" + card + "]";
	}
	
}
