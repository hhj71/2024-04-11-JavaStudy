package com.sist.main;
/*
 * 		ArrayList       / HashSet       /  HashMap
 * 		---------        --------          -------
 *      |중복이 있는 경우    |중복이 없는 경우    | 두가지 동시에 저장 ex) (id:admin) (pwd:1234)
 * 
 *    => 자료구조 : 데이터 저장, 데이터 수정, 데이터 추가, 데이터 삭제 , 데이터 검색
 *                --------  ---------  --------  ---------   --------
 *                              |                    |          |
 *                               --------------------------------
 *                                               |
 *                                         데이터를 찾을 수 있는 구분자가 필요하다      
 *                    => 구분자
 *                        -  ArrayList : 인덱스 번호 (중복이 있기 때문)
 *                        -  Set : 데이터 자체 (중복이 없기 때문)    
 *                        -  Map : Key (중복 없음) (Value 는 중복있음) 
 *                 ---------------------------------------------------
 *                    배열 보완 => 고정이 아니라 가변형이다
 *                    			 --- 삭제, 추가기능이 불가능                    
 *                 ---------------------------------------------------
 *                    => 자바: 컬렉션 (여러개 수집 => 관리)
 *                    
 *   				Collection
 *                      |
 *      ---------------------------------
 *      |                 |              |
 *    List               Set            Map
 *      |                 |              |
 *  ArrayList           HashSet         HashMap
 *  LinkedList          TreeSet         HashTable
 *  Vector
 *  
 *   ** MyBatis, JPA는 리턴형이 상위클래스다 => List
 *  
 *     => 개발자 선호에 따라 사용하는 것이 다르다 
 *     		
 *     	 ArrayList<String> list = new ArrayList<String>(); (권장 X)
 *       
 *       List<String> list = new ArrayList<String>();    (권장 O - 수정이 쉬움)
 *       ----- 
 *       List<String> list = new LinkedList<String>();                
 *       List<String> list = new Vector<String>();    
 *       
 *       Set<String> list = new HashSet<String>(); (권장 O - 수정이 쉬움)
 *       --- 
 *       Set<String> list = new TreeSet<String>();         
 */
import java.util.*;
public class Set_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
//		list.addElement("홍길동");
//		list.addElement("박문수");
		list.add("홍길동");
     	list.add("박문수");
		
		for(int i=0; i<list.size(); i++)
		{
			String name = list.get(i);
			System.out.println(name);
			
		}
	}

}
