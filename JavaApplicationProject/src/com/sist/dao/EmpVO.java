package com.sist.dao;
import java.util.*; // 오라클 데이터형이 DATE로 되어있으면 => java.util.date 

import lombok.Data;

@Data
public class EmpVO {
	private int empno;
	private String ename, job;
	private Date hiredate;
	private int sal, mgr, comm, deptno;
	// 부서정보 => JOIN
	private DeptVo dvo = new DeptVo(); // 포함 클래스를 만든다
}
