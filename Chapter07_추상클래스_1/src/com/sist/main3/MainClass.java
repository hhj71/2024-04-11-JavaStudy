package com.sist.main3;
abstract class A
{
	public abstract void aaa();
	public abstract void bbb(); // 모든 하위 클래스가 구현해야 함
	// B, D만 구현하려 함 => C / E 는 구현 안해도 됨
	public void ccc()
	{
		
	} // 블록 열고 닫으면 구현 됨
	public void ddd() {} // 나중에 추가하는 건 구현된 모든 클래스의 에러를 막기 위해서 이런 형식으로 추가하는게 좋다
	// 프로젝트 구현이 끝난 다음에 추가하는 기능이 있는 경우 => 구현된 메소드를 만들어서 처리
	// 필요한 클래스에서만 오버라이딩이 가능
	/*
	 *  추상 클래스를 보완
	 *  --------------- 인터페이스 
	 *  	1. 다중 상속이 가능
	 *  	2. 모든 메소드가 추상 메소드
	 *  	3. 모든 변수는 상수
	 *  	----------------------- 1.8에서 변경됨 => 구현이 된 메소드가 존재...
	 */
}
class B extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
class C extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
class D extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
class E extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
