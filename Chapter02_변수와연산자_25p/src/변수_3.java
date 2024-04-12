
/*
 *  국어 영어 수학 => 총점 / 평균 / 학점(ABCDF)
 *  
 *  
 */


public class 변수_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 90;
		int eng = 80;
		int math = 75;
		int total = kor+eng+math;
		double avg = total/3.0; // 정수/정수 = 정수이기 때문에 오류가 난다. 따라서 3.0(실수형)으로 나눠야 한다. 
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.printf("평균 점수 : %.2f ",avg); // 소수점 이하 2번째 자리까지 출력하라 -> System.out.printf("%.2f",___) -> 반올림해서 출력됨.
		System.out.println();
		
		
	}

}

