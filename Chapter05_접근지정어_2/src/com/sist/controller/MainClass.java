package com.sist.controller;
/*
 * 	 패키지 => 관련된 클래스를 모아서 검색이 쉽게
 *   ----- import를 사용해서 불러온다
 *   ----- 패키지가 있어야 분업이 가능 => 여러명이 동시에 작업
 *   패키지명
 *   형식)  com(org).회사명.클래스기능
 *   - 키워드는 사용할 수 없다
 *              ex) com.sist.int --> 오류 (키워드 사용)
 *   - 소문자로 사용
 *   - 공백을 사용할 수 없다
 *   - 특수문자(-,$) 쓸 수는 있지만 보통은 사용하지 않는다
 *     ----------------------
 *   => 패키지는 폴더 단위 => 다른 이름의 패키지 안에는 같은 이름의 클래스를 만들 수 있다.
 *   => 클래스를 기능별로 분리해주는 기능을 한다.
 *      controller / dao / manager / vo ...
 *                                    | 사용자 정의 데이터형을 모아준다 
 *                            | 외부에서 데이터 읽기
 *       |제어(연결)    | 데이터 관리
 *   
 * ---------------------------------------------------------------
 *    네트워크                웹
 *  ----------           ----------
 *    server                user
 *  ----------           ----------
 *    client               admin
 *  ----------           ----------
 *    commons       
 *  ----------
 * 
 *  => 패키지는 폴더와 같은 개념
 *      ex) 자바자료  
 *          오라클자료
 *          웹자료
 *  => 관련된 클래스를 모아서 관리 => 쉽게....        
 *  
 *  => private / public 
 *      |           | 클래스, 메소드, 생성자 
 *      |멤버변수에 사용 (손실, 변경을 방지하기 위해) 
 *       ------ 다른 클래스에서 사용이 불가능 => 기능을 설정(메소드)
 *       			읽기 ( get변수명() ) / 저장 ( set변수명() )
 * 		회원
 *       ** id
 *       ** pwd
 *       ** name 
 *        sex
 *       ** birthday      => 감춰야 되는 변수(**) private
 *       ** email
 *       ** tel
 *        address
 *        content
 *        동의 여부
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
