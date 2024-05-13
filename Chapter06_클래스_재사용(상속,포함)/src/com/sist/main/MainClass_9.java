package com.sist.main;
class Movie
{
	void display() {}
}
class MegaBox extends Movie
{
	//int display() {} // 오류발생 => 리턴형이 동일해야 오버라이딩이 가능하다
	// void display() {} // 상속받은 거 
	int display(int a) {
		return 10;
	} // 오버로딩 -> 같은 메소드 이름 다른 형태 => 상속받은 메소드와 별개의 메소드
	//(default) void display() {} // 오버라이딩 (왼쪽에 초록색 화살표로 오버라이딩 적용된거 확인 가능)
	// protected void display() {} // 오버라이딩
	public void display() {}
	/*
	 *  오버라이딩
	 *   1. 상속 => 재정의 (메소드 내용을 변경해서 사용)
	 *   2. 메소드 명이 동일해야 함
	 *   3. 매개변수가 동일해야 함 (매개변수가 다른 경우 => 메소드가 다른 것을 정의 => 오버로딩)
	 *   4. 리턴형이 동일해야 함
	 *   5. 접근지정어가 동일하거나, 확대가 되어야 한다. // 나머지는 다 동일해야 하는데 접근지정어만 다르게 설정가능(크거나 같기만 한다면)
	 *   ** 접근 지정어 비교
	 *     private < default < protected < public
	 *   ** 라이브러리 파트 에서 상속을 받아 오버라이딩 하는게 많이 등장함 
	 *      => 한국 IT 개발에 잘 맞지 않아서,,,
	 *      => 상속 여러개 있는 경우에는 가장 큰 클래스를 상속을 받는다. (단일상속이기 때문에)
	 *         ex) JButton , JTextField, JFrame 이 있다고 하면
	 *              ---> JFrame 을 상속 받아야 한다. 
	 */
	
}

public class MainClass_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
