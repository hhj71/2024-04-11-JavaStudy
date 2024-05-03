/*
 *   class ClassName
 *   { // 이 블록안에 들어와야 멤버변수
 *      --------------
 *      
 *      --------------
 *      int a;
 *      --------------
 *        void //int// display()
 *        {
 *           ------------
 *           변수 선언 => 지역 변수 => 메소드가 종료하면 사라진다 => 사용하려면 리턴형
 *           // int a = 100;
 *           -------------
 *          // return a; // 클래스에 변수 선언 안하고 지역변수로 a => void로 메소드 만들면 아래 메소드에서 a값 사용 불가함 
 *                          -> 리턴을 해줘야 사용 가능
 *        }
 *        void print(//int a) 
 *        {
 *           
 *        }   
 *   -------------------------------
 *    }
 * 
 */
import java.util.*;
class Sawon{
	String name;
	String dept;
	String loc;
	String job;
	int pay;
}
public class 멤버변수_초기화_활용 {
	// 사원 등록
	static Sawon s=new Sawon();
	static void sawonInsert()
	{
		//Sawon s=new Sawon(); //지역변수
		s.name="홍길동";
		s.dept="개발부";
		s.loc = "서울";
		s.job="대리";
		s.pay=3600;
		//return s;
	}
	// 사원 목록 출력
	static void sawonList()
	{
		System.out.println("이름:"+s.name);
	}
	
	// 사원 상세보기 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sawonInsert(); // => sawon -> s는 사라진다
		sawonList();
	}

}
