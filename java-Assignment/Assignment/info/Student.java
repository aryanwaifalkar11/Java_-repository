package com.info;

import java.util.*;
public class Student implements Comparable<Student> {

	String Name;
	int Rollno;
	double marks;
	
	
	public Student(String name, int rollno, double marks) {
		super();
		this.Name = name;
		this.Rollno = rollno;
		this.marks = marks;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name= name;
	}
	public int getRollno () {
		return Rollno;
	}

	public void setRollno(int rollno) {
		rollno= Rollno;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double Marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Std [Name=" + Name + ", Rollno=" + Rollno + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return this.Rollno - o.Rollno;
}




	

}
