package com.sist.util;
import java.util.*; // package 바로 아래 import 써야 된다
// 사용자 정의
class Student
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	// 읽기/ 쓰기 기능 추가 => 다른 클래스에서 사용이 가능하게 만들어줌
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	// 사용자 입력값을 받아서 초기화
	public Student(int hakbun, String name, int kor, int eng, int math) {
		
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 생성자를 생성했기 때문에 자동으로 디폴트 생성자가 생성되지 않는다
	// 매개변수가 있는 생성자가 있는 경우에는 디폴트 생성자를 만들어 놓고 시작하는 것이 제어에 편리하다
	public Student()
	{
		// 여기서 초기화 => 모든 학생 정보가 같은 값을 가지고 저장이 된다.
	}
	
	// 데이터 추가
}
class A
{
	int a,b;
	public A()
	{	
		a=10;
		b=20;
	}	

   public A(int a, int b)
    {
	this.a=10;
	this.b=20;
    }
}
public class 컬렉션_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "홍길동", 90,80,70));
		list.add(new Student(2, "박문수", 78,83,75));
		list.add(new Student(3, "이순신", 90,80,70));
		list.add(new Student(4, "이산", 90,80,70));
		list.add(new Student(5, "심청이", 90,80,70));
		
		System.out.println("======= 데이터 추가 1 ======");
		
		Student s = new Student();
		
		list.add(s);
		for(Student std:list)
		{
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n", std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getEng(),std.getMath());
			//웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
		System.out.println("===== 데이터 출력 =====");
		for(int i=0; i<list.size(); i++)
		{
			Student std = list.get(i); // 형변환 없이 사용 가능
		}
				
//		for(Student std:list)
//		{
//			System.out.println(std);// 주소값 출력
//		}
		System.out.println("===== 학생 삭제 =====");
		list.remove(3);
		for(Student std:list)
		{
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n", std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getEng(),std.getMath());
			//웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
		System.out.println("===== 학생 수정 =====");
		list.set(1, new Student(2,"수정",90,90,90));
		for(Student std:list)
		{
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n", std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getEng(),std.getMath());
			//웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
		System.out.println("===== 학생 졸업 =====");
		list.clear();
		for(Student std:list)
		{
			// 서식이 있는 출력 => 출력 형식을 만들어서 처리
			System.out.printf("%-3d%-5s%-5d%-5d%-5d\n", std.getHakbun(),std.getName(),std.getKor(),std.getEng(),std.getEng(),std.getMath());
			//웹 => String.format("%-3d%-5s%-5d%-5d%-5d\n")
		}
		System.out.println("현재 인원:"+list.size());
	}

}
