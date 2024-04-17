/*
 * 공부방식
 * 1. 형식을 익히는데 주력하라 ==> 어떤 곳에서 사용을 해야하는지 파악
 * 2. 흐름을 파악하라 (동작 순서)
 * 3. 응용을 해라
 * --------------------------------------------------기본
 * 1) 제어문 : 프로그램 제어
 *      └ 요청한 내용만 출력,                 반복 수행,              선택된 내용만 출력 
 *         └> 필요시에 건너뛸 수도 있다 (if문)    └반복문                    └선택문
 *                                          └ 중단-> break
 *                                            다시 시작-> continue 
 *                                            
 *  - 조건문: 오류처리, 건너뛴다... 사용자 요청에 맞는 내용만 출력
 *       - 단일 조건문: 독립적인 문장(조건에 맞는 모든 문장을 수행)
 *     				형식)  if(조건문)
 *           				{
 *               					true에 수행이 되는 영역 => false면 건너뛴다
 *            				}   
 *       - 선택 조건문: true/false를 나눠서 처리
 *                 형식) if(조건문)
 *                 {    true에 수행이 되는 문장
 *                 } 
 *                 else
 *                 {    false에 수행이 되는 문장
 *                 }
 *       - 다중 조건문: 여러개의 조건 중에 1개만 출력을 할 수 있게 함. => 58page
 *            형식)
 *                 if(조건문)
 *                 { 조건문 -> true 문장 수행 -> 종료
 *                        false 
 *                 }        ↓
 *                 else if(조건문)
 *                 { 조건문 -> true 문장 수행 -> 종료
 *                         false
 *                 }         ↓
 *                 else if(조건문)
 *                 { 조건문 -> true 문장 수행 -> 종료
 *                         false
 *                 }         ↓
 *                 else 
 *                 { 해당 조건이 없는 경우에 수행 문장 => 필요시에만 처리(생략이 가능)
 *                 }                                      
 */   
public class 제어문_조건문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
