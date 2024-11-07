package com.sist.io;
import java.util.*;
import java.io.*;
// 파일의 단점 => 구분이 없다 => 한줄에 저장 => 1| 홍길동 | ....\r\n  
class Sawon
{
	//public static int sequence = 1;
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private String loc;
	private int pay;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
}
public class 라이브러리_7 {
    public void fileInput()
    {
    	FileReader fr = null;
    	try
    	{
    		fr = new FileReader("c:\\java_data\\sawon.txt");
    		int i=0;
    		String data = "";
    		while((i=fr.read())!=-1)
    		{
    			data+=(char)i;
    		}
    		String[] datas = data.split("\n");
    		for(String s: datas)
    		{
    			String[] sawon = s.split("\\|");
    			System.out.println("사번:"+sawon[0]);
    			System.out.println("이름:"+sawon[1]);
    			System.out.println("부서:"+sawon[2]);
    			System.out.println("직위:"+sawon[3]);
    			System.out.println("근무지:"+sawon[4]);
    			System.out.println("연봉:"+sawon[5]);
    			System.out.println("===========================");
    		}
    	}catch(Exception ex) 
    	{
    		ex.printStackTrace(); // 에러 확인
    	}
    	finally
    	{
    		try
    		{
    			fr.close();
    		}catch (Exception e){}
    	}
    }
    public void fileOutput()
    {
    	//파일 입력
    	FileWriter fw = null;
    	try
    	{
    		File file = new File("c:\\java_data\\sawon.txt");
    		if(file.exists())
    		{
    			file.createNewFile();
    		}
    		fw = new FileWriter(file, true); // true => 기존의 데이터를 유지하고 다음줄에 출력 => append 모드
    		// => new FileWriter(file) => 기존의 데이터를 지우고 새로운 내용을 출력한다.
    		// 파일을 생성 => 파일 쓰기를 시작한다
    		
    		Scanner scan = new Scanner(System.in);
    		// System.in => 키보드 입력값 =>자바의 표준 입출력
    		Sawon sawon = new Sawon();
    		sawon.setSabun(maxSabun()+1); // 메모리에 저장된 정보는 프로그램 종료시에 자동으로 사라진다 
    		// => 파일에서 데이터를 읽어와서 사번을 증가시킨다
    		System.out.print("이름 입력:");
    		sawon.setName(scan.next());
    		System.out.print("부서 입력:");
    		sawon.setDept(scan.next());
    		System.out.print("직위 입력:");
    		sawon.setJob(scan.next());
    		System.out.print("근무지 입력:");
    		sawon.setLoc(scan.next());
    		System.out.print("연봉 입력:");
    		sawon.setPay(scan.nextInt());
    		
    		String msg = sawon.getSabun()+"|"+sawon.getName()+"|"+sawon.getDept()+"|"+sawon.getJob()+"|"+sawon.getLoc()+"|"+sawon.getPay()+"\r\n";
    		fw.write(msg);
    		System.out.println("사원 등록 완료!!");
    		
    		
    	}catch(Exception ex)
    	{
    		ex.printStackTrace(); // 에러 확인
    	}
    	finally
    	{
    		try
    		{
    			fw.close();
    		}catch (Exception e) {}
    	}
    }
    // 사번을 자동으로 증가시킴
    public int maxSabun()
    {
    	int max = 0;
    	FileReader fr = null; // 파일 읽기
    	try
    	{
    		File file = new File("c:\\java_data\\sawon.txt");
    		fr=new FileReader(file);
    		int i=0;
    		String data = "";
    		while((i=fr.read())!=-1)
    		{
    			data+=(char)i;
    		}
    		
    		// 데이터 제어
    		String[] datas = data.split("\n");
    		for(String sa:datas)
    		{
    			String[] sawon_data=sa.split("\\|");
    			if(max<Integer.parseInt(sawon_data[0]))
    			{
    				max=Integer.parseInt(sawon_data[0]);
    			}
    		}
    	}catch(Exception ex)
    	{
    		
    	}
    	finally
    	{
    		try
    		{
    			fr.close();
    		}catch (Exception e){}
    	}
    	return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 파일 입력
		라이브러리_7 lib = new 라이브러리_7();
		lib.fileOutput();
		// 2. 파일 출력
		System.out.println("========== 사원 목록 =============");
		lib.fileInput();
	}

}
