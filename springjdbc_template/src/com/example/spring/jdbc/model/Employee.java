package com.example.spring.jdbc.model;

public class Employee {
	private Integer empNo;
	private Integer deptNo;
	private String eName;
	private String job;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer eno, String enm, String jb, Double sal, Integer dno) {
		this.empNo = eno;
		this.eName = enm;
		this.job = jb;
		this.salary = sal;
		this.deptNo = dno;
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer eno) {
		this.empNo = eno;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer dno) {
		this.deptNo = dno;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String enm) {
		this.eName = enm;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String jb) {
		this.job = jb;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(double sal) {
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Employee{" + "Emp No=" + empNo + ", deptNo=" + deptNo + ", EmpName='" + eName + '\'' + ", job='" + job
				+ '\'' + '}';
	}

}