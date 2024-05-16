package com.sist.main2;
class A
{
	int c;
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}

	public void plus(int a, int b)
	{
		c=a+b;
	}
}	
public class MainClass {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
//		a.add(10, 20); // c 변수 회수
		int c = a.add(10, 20); // 리턴형
		System.out.println(c);
		a.plus(10, 20);
		System.out.println(a.c); // 프로그램 종료시까지 
		
	}

}
