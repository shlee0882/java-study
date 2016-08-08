package chap18;

import java.io.Serializable;

public class Student implements Serializable{
	private int studentNumber;
	private String studentName;
	private transient String major;
	
	public Student(){
		
	}
	
	public Student(int studentNumber, String studentName, String major) {
		super();
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.major = major;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", major=" + major + "]";
	}
	
	
}
