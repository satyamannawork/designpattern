package com.satya.dp.creational.prototype;

public class Student implements Cloneable{ 
  private String studentId;
  private String studentName;
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
  
  
  @Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
  
}
