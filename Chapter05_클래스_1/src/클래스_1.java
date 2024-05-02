/*
 *  클래스
 *  
 *  ** 클래스는 한개에 대한 정보
 *    class 사원
 *    {
 *       이름
 *       부서
 *       근무지
 *       입사일
 *       직위
 *       연봉 
 *       성과급
 *       ....
 *     }
 *     
 *      class 학생
 *      {
 *         이름 
 *         학년 int
 *         학점 char
 *         주소 String...
 *         전화
 *         나이
 *      }   
 * 
 */
// 데이터형 -> 형변환
// 클래스를 만드는 데이터는 개발자마다 다르게 사용한다 (프로그램에 맞게만 개발하면 된다)
// 데이터 범위에 따라 인스턴스와 static이 달라질 수 있다. 
class Student
{
	String name;
	int age;
	// 인스턴스 변수 : 메모리 공간을 따로 생성해준다. 
	// 각각 저장하고 싶을 때
	String school_name;
	// static String school_name; 
	// 공통으로 사용하고 싶을 때 -> 공유변수 -> static
	// 공유변수는 한개의 공간에서 사용한다.
	// static 함부로 사용하면 안됨...
}
// 클래스는 재사용 가능
// => 저장 <- "new" 이용함.
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student hong = new Student();
		     //     ---- -> 객체 (사용자 정의 데이터형에 대한 변수명)
			// name, age, school_name 를 저장하는 공간을 만들어주는 연산자 => new
			hong.name="홍길동";
			hong.age=25;
			hong.school_name="쌍용";
			
			Student shim = new Student();
			// name, age, school_name
			shim.name="심청이";
			shim.age=20;
			shim.school_name="SIST";
			
			Student park = new Student();
			// name, age, school_name
			// 데이터 주소에 접근하는 연산자 => 주소접근 연산자 => .
			park.name="박문수";
			park.age=30;
			park.school_name="SIST강북";
			
			System.out.println("========= hong 영역 =========");
			System.out.println("이름:"+hong.name);
			System.out.println("나이:"+hong.age);
			System.out.println("학교명:"+hong.school_name);
			System.out.println("========= shim 영역 =========");
			System.out.println("이름:"+shim.name);
			System.out.println("나이:"+shim.age);
			System.out.println("학교명:"+shim.school_name);
			System.out.println("========= park 영역 =========");
			System.out.println("이름:"+park.name);
			System.out.println("나이:"+park.age);
			System.out.println("학교명:"+park.school_name);
	}

}
