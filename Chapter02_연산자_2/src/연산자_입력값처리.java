import java.util.Scanner; //java.util 폴더에 있는 것을 불러오기
// 기존에 만든 클래스를 불러온다. 라이브러리 읽기
// c 에서는 include 
// c# 에서는 using
// python, javascript 에서는 import
// 같은 폴더에 있는 경우는 생략가능 => 다른 폴더에 있는 경우에만 사용


// 국어,영어,수학 점수를 입력을 받아서 => 총점, 평균
public class 연산자_입력값처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 저장할 메모리 공간
	   int kor, eng, math, total;
	   double avg;
	   
	   //사용자로부터 입력값을 받아서 변수에 초기화
	   //키보드 입력값 읽기
	  Scanner scan = new Scanner(System.in); //Scanner의 기능은 키보드로 입력된 값 읽어들이기
	  System.out.print("국어,영어,수학 입력:(60 70 80):"); //한번에 다 입력할 때/ 공백으로 구분해주기/(60 70 80)은 숫자 공백 숫자 공백 숫자 공백 이라는 형식에 대한 예시
	 
	  //System.out.println("국어 점수:");  //점수 한개씩 입력 할 때
	  kor=scan.nextInt();
	  
	  //System.out.println("영어 점수:"); //점수 한개씩 입력 할 때
	  eng=scan.nextInt();
	  
	  //System.out.println("수학 점수:"); //점수 한개씩 입력 할 때
	  math=scan.nextInt();
	  
	  //처리
	  // 사용자 요청이 있으면 프로그램에서 요청처리결과를 보여준다. => 연산자
	  total = kor+eng+math;
	  avg = total/3.0;
	  
	  System.out.println("===== 결과 =====");
	  System.out.println("총점:"+total);
	  System.out.printf("평균:%.2f",avg);
	  
	 
	  
	}

}
