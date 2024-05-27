package com.sist.util;
/*
 * 		java.util
 * 		----------
 * 		 => 가장 많이 사용되는 라이브러리 
 * 		 => 난수 : Random => 정수, 지정된 범위
 * 					=> 1. 객체 생성
 * 						Random r = new Random()
 * 					=> 2. 난수 발생
 * 					    r.nextInt(100) => 100은 제외된다 => 0~99
 *                  => 웹 : 예약일, 예약 시간 크롤링 안됨 => 난수를 발생시켜서 구함
 *                  	     => 실전(배포)이 아니기 때문에 가상으로 연습함...
 *      => 날짜 -> Date 
 *      		 ---- 기능은 없음 => 오라클 / MySQL 에서 전송하는 날짜를 받는 경우 사용(데이터베이스 호환)
 *             -> Calendar 
 *             	  -------- 기능 부여(요일, 마지막 날짜....) => 달력 제작
 *             
 *      java.text
 *      ---------
 *       => 날짜 변환/ 숫자 변환
 *       => DecimalFormat
 *                  -> 숫자 변환 -> format()
 *                  -> 패턴
 *                  	new DecimalFormat("###,###,###")   * 오라클은 (9,999,999)
 *       => SimpleDateFormat
 *       			-> 날짜 변환 -> format()
 *       			-> 패턴
 *       				new SimpleDateFormat("yyyy-MM-dd") 
 *       					=> 년도 : yy/yyyy
 *       					=> 월 : MM/M
 *       					=> 일 : dd/d
 *       					=> 시 : hh/h
 *       					=> 분 : mm/m
 *       					=> 초 : ss/s
 *       
 *     * 데이터 관리 : 컬렉션 => 자료구조
 *     		=> 데이터를 쉽고 효율적으로 관리할 수 있게 표준화된 라이브러리 : 컬렉션 프레임워크
 *          => 단점)
 *          
 *          => 단점 보완 : 형변환이 없이 사용, 가독성이 좋게 만든다
 *          			 => 소스가 간결하다
 *          			 => 제네릭
 *          			 => 데이터형 통일화 시킨다
 *                       => <클래스형> => 기본형은 사용할 수 없다
 *                       
 *    * 컬렉션 클래스 종류
 *    				  Collection (: interface)
 *    						 |
 *      ------------------------------------------------
 *      |                      |                       |                                  
 *    List                    Set                     Map
 *    
 *    컬렉션 : 데이터 관리 (메모리)
 *    		 ------------------
 *    		  1. 읽기 (데이터를 가지고 온다)
 *    		  2. 추가 
 *           ------------------
 *            3. 수정
 *            4. 삭제
 *            5. 검색
 *           ------------------ 데이터가 구분되어야 함 
 *           					----------------- 
 *           					=> List : 인덱스
 *           					=> set(int index, 추가할 데이터)
 *           					   remove (int index)
 *           					=> 
 *    
 *    
 *    1) List
 *    	1. 순서를 가지고 있다 (인덱스 -> 자동처리) => 순차적으로 저장
 *    	2. 중복 데이터 저장을 허용
 *    	3. 주로 사용처 => 데이터베이스 (오라클)  **** 웹은 데이터베이스가 핵심이다
 *    	4. 구현된 클래스
 *    		ArrayList : 비동기화 처리 => 데이터 베이스 (오라클) 에 저장된 데이터를 읽어서 브라우저에 전송
 *    		
 *    2) Set
 *    	 = 순서가 없다
 *    	 = 데이터 중복을 허용하지 않는다
 *    	 = 구현한 클래스 	
 *    		HashSet : 중복없는 데이터를 저장
 *    				  웹에서 채팅을 할 때 => 접속자 관리
 *    				  add(), remove(), clear(), isEmpty()
 *    		TreeSet : 검색 속도가 빠르다 => 애플리케이션
 *   3) Map => 349 page
 *   		특징) 
 *   			key , value => 동시에 저장
 *   			----------- 우편번호 (우편번호, 실제 주소)
 *   			key : 중복이 불가능
 *   			value : 중복이 가능
 *   			Map<K,V>
 *   				= K = key
 *   				= V = value
 *   				= T = type
 *   				= E = element
 *   			ArrayList<E>
 *   			Vector<E>
 *   			Set<E>
 *   			
 *   			1. 사용처 
 *   				= Spring => 클래스 저장 (사용자)
 *   				  ------ 클래스 관리 (생성~소멸)
 *   				= 웹 : 전송 / 응답/ 저장 (클라이언트, 서버) => Cookie / Session
 *    				= ?id = admin 
 *   				= MyBatis => 키 : id, 값 : sql
 *   
 *   			2. 주요 기능
 *   				= put() : 저장 => put(키, 값)
 *   				= get() : 읽기 => get(키)
 *   				= clear() : 전체 삭제
 *   
 *    			3. 순서가 없다
 *    				=> 키 => 구분자로 사용
 *    				=> 값 => 모든 값을 설정할 수 있다
 *    
 *   --------------------------------------------------------------------------------------------
 *        * ArrayList가 여러개 있는 경우
 *        		= 차집합 => removeAll() => MIUNS
 *        		= 교집합 => retainAll() => INTERSECT
 *              = 
 *          
 *   4) Properties 
 *   	=> 파일 => .properties => 파일 읽기
 *   	=> 데이터베이스 정보
 *   	=> map 형식
 *   		변수(key) = 값 => 보안 유지
 *   	
 */
import java.util.*;
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		// key: String, value: String => key 보통 String 으로 많이 씀 (구분)
		map.put("id", "admin");
		map.put("password","1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", String.valueOf(20));
		map.put("password","4567");
		// key가 중복되면 값을 덮어쓴다 => 중복을 허용하지 않는다 ex) Cookie
		// 값을 읽어온다
//		System.out.println("아이디:"+map.get("id"));
//		System.out.println("비밀번호:"+map.get("password"));
//		System.out.println("이름:"+map.get("name"));
//		System.out.println("성별:"+map.get("sex"));
//		System.out.println("나이:"+map.get("age"));
		Set<String> s = map.keySet(); // 키만 저장 => 중복을 허용하면 안된다
		for(String ss:s)
		{
			System.out.println(ss+":"+map.get(ss));
		}
		// Set : 순서가 없다 => 가급적이면 출력시에 List 를 이용한다 (순차적이다)  
		// Map은 클래스 관리
	}

}
