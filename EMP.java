package test;

import java.sql.Date;
import java.sql.Timestamp;

public class EMP {
	private int a_empno;
	private int a_mgr;
	private int sal;
	private int comm;
	private int deptno;
	private String a_ename;
	private String a_job;
	private Timestamp hiredate;
	
	
	public Timestamp getHiredate() {
		return hiredate;
	}
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	public int getA_empno() {
		return a_empno;
	}
	public void setA_empno(int a_empno) {
		this.a_empno = a_empno;
	}
	public int getA_mgr() {
		return a_mgr;
	}
	public void setA_mgr(int a_mgr) {
		this.a_mgr = a_mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getA_ename() {
		return a_ename;
	}
	public void setA_ename(String a_ename) {
		this.a_ename = a_ename;
	}
	public String getA_job() {
		return a_job;
	}
	public void setA_job(String a_job) {
		this.a_job = a_job;
	}
	
	
	
 
}
