//startsWith / endsWith => cookie
// 자동 완성기
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] books= {
				"자바와 오라클",
				"자바로 시작하는 웹프로그램",
				"자바와 JSP",
				"JSP와 오라클",
				"JSP와 Ajax",
				"혼자 배우는 자바",
				"자바 프로그래밍",
				"오라클 AND 자바",
				"최신 자바"
		};
		// 데이터 모음
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		for(String book:books)
		{
			//if(book.startsWith(fd)) // 시작하는 문자열이 같은 경우 찾아줌
			//if(book.endsWith(fd)) // 끝나는 문자열이 같은 경우 찾아줌
			if(book.startsWith(fd) || book.endsWith(fd)) // 시작할때, 끝날때 문자열이 같은지 찾아줌 -> 그런데 이럴때는 contains 를 사용하는 것이 더 나음   
			{
				System.out.println(book);
				try
				{
					Thread.sleep(1000); // 잠시 멈출때 쓰임 // 찾는 것 같은 효과를 준다
				}catch(Exception ex) {}
			}
		}
	}

}
