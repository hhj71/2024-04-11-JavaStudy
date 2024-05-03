// Human 이라는 데이터형을 제작했다 -> 한개의 정보만 담고 있음 -> 따로 저장시에는 new 이용
class Human
{
	//static String name;
	 String name;
	//static String sex;  // static => 공통으로 사용하는 메모리가 생성
	 String sex;         // new 사용시마다 다른 메모리 생성
}
public class 멤버변수_활용4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human();
		hong.name="홍길동";
		hong.sex="남자";
		
		Human shim = new Human();
		shim.name="심청이";
		shim.sex="여자";
		System.out.println(hong.name);
	}
}
