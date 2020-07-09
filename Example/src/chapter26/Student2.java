package chapter26;

public class Student2 {
	//필드(private)
	private String number;
	private String name;
	private String dept;
	private double grade;
	Student2(String name,String dept,String number,double grade){
		this.number=number;
		this.name=name;
		this.dept=dept;
		this.grade=grade;
	}
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public double getGrade() {
		return grade;
	}
	public void find_student(String name) {
		if(name.equals(this.name)) {
			System.out.println("이름 : " +this.name);
			System.out.println("학점 평균  : " +this.grade);
			
		}
	}
	public String toString() {
		return this.name+", "+this.dept+", "+this.number+", "+this.grade;
	}
	
	}
	


