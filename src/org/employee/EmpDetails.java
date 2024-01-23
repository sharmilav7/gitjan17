package org.employee;

public class EmpDetails {
	public void empName()
	{
		System.out.println("Sharmila V");
	}
	public void empId()
	{
		System.out.println("121");
	}
	public void empMobile()
	{
		System.out.println("959743214");
	}
	public void empLocation()
	{
		System.out.println("chennai");
	}
	public void empDesig()
	{
		System.out.println("QA");
	}
	public static void main(String[] args) {
		EmpDetails e=new EmpDetails();
		e.empId();
		e.empName();
		e.empMobile();
	}
}
