package learn.hibernate3.Hibernate_4crud;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop1 {
	@Id
	int modelnumber;
	String brand;
	int cost;
	public Laptop1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop1(int modelnumber, String brand, int cost) {
		super();
		this.modelnumber = modelnumber;
		this.brand = brand;
		this.cost = cost;
	}
	public int getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop1 [modelnumber=" + modelnumber + ", brand=" + brand + ", cost=" + cost + "]";
	}

}
