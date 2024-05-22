import java.util.*;
public class 라이브러리_활용_2 {
// 웹 => 오라클(숫자, 문자열, 날짜)
// 변수 = 데이터
// 변수가 같거나 커야함 => 작은 경우에는 형변환	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 ArrayList list = new ArrayList(); // ★ ArrayList 
	 ArrayList<String> list = new ArrayList<String>();
//	 list = new ArrayList<String>();
		// 배열의 단점을 보완 => 가변성을 가짐
		list.add("홍길동"); //0
		list.add("심청이"); //1
		list.add(100);    //2
		list.add(10.5);   //3
		list.add(true);   //4
		
		String name = (String)list.get(0); // 데이터값을 가져올때 Object 가 더 크니까 형변환 해줘야됨..... 
		 double d = (double) list.get(3); // 언박싱 
		 
	}

}
