package com.git.model.vo;

public class Person {
       private String name;
       private int age;
       private String address;

       private String email;
       private boolean married;

       private double height;
       private double wieght;

       public Person() {
		// TODO Auto-generated constructor stub
     	   
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}
	public double getHeight() {
		return height;

	}


	public void setEmail(String email) {
		this.email = email;
	}
	public void setHeight(double height) {
		this.height = height;

	}


	public boolean isMarried() {
		return married;
	}
	public double getWieght() {
		return wieght;

	}


	public void setMarried(boolean married) {
		this.married = married;
	}
	public void setWieght(double wieght) {
		this.wieght = wieght;

	}

	
       
	}


