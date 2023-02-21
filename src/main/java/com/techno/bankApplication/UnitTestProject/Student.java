package com.techno.bankApplication.UnitTestProject;

public class Student {
int rollno;
String name;
double per;
String grade;
public Student(int rollno, String name, double per) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.per = per;
}

public String cal_grade()
{
	if(per>=85)
		grade="Distinction";
	else if(per>=60)
		grade="FirstClass";
	else if(per>=50)
		grade="SecondClass";
	else if(per>=40)
		grade="Pass";
	else 
		grade="Fail";
	return grade;
}

public void dispInfo()
{
	System.out.println(this);
}

@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + ", grade=" + grade + "]";
}







}
