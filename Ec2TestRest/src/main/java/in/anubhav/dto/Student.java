package in.anubhav.dto;

import lombok.Data;

@Data
public class Student {

	private int rollNumber;
	private String name;
	
	public Student(int rollNumber,String name) {
		this.rollNumber=rollNumber;
		this.name= name;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}
	
	
}
