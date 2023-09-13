package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+33}")
	private int x;
	
	@Value("#{2+3+87+1+6}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")  // to invoke static method using spring expression language T(class).method(para)
	private double z;
	
	@Value("#{T(java.lang.Math).E}") // to invoke variable using spring expression language T(class).variable
	private double e;
	
	@Value("#{ new java.lang.String('Prashant Jaiswal')}") //to create object new Object(value)
	private String name;
	
	@Value("#{ 10-2 > 6}")
	private boolean isActive; //by default it will consider as false and to invoke boolean by spel;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
	
	
	

}
