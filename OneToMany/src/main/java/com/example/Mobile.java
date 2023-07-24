package com.example;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Mobile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double cost;
	
	@OneToMany
	private List<SIM>sims;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<SIM> getSims() {
		return sims;
	}
	public void setSims(List<SIM> sims) {
		this.sims = sims;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", cost=" + cost + ", sims=" + sims + "]";
	}
	

}
