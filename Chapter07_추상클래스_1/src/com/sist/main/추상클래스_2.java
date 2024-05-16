package com.sist.main;
// 이미 처리 메소드명은 알고 있다
// 24개의 메소드를 만든다 => btn1 ... btn24

abstract class Button
{
	public abstract void click(); // 버튼이 공통으로 사용될 수 있게 해주는 기반 => 선언 => 구현내용이 다르다
	// 추상 메소드는 구현부가 없다 
}
class Login extends Button
{
	@Override // 자식클래스가 추상메소드를 오버라이딩한다면 객체 생성 가능 
	public void click() {
		System.out.println("로그인 요청...");
	}
}
class Join extends Button
{
	@Override
	public void click() {
		System.out.println("회원가입 요청...");
	}
}
// 추상클래스를 이용하면 결합성을 낮아지게 만들 수 있다.
public class 추상클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Login();
		btn.click();
		
		btn = new Join();
		btn.click();
	}

}

