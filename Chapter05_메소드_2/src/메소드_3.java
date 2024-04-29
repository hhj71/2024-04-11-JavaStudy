// 매개변수 => 메소드 안에 사용이 가능 => 지역변수
// 메소드 호출시에 메모리 저장 => 메소드 종료되는 자동으로 해제가 된다

public class 메소드_3 {
    static int i=1; // 전역변수 => 프로그램 종료시에 메모리 해제면서 사라짐 
	static void increment()
	{   // 메소드 블록 안에서는 전역변수보다 지역변수가 우선순위가 더 높다 
		int i=1; //지역변수
		// 밤색 => 지역변수
		// 파란색 => 클래스 변수
		System.out.println("i="+메소드_3.i); // 클래스이름.변수 하면 전역변수가 된다.
		++메소드_3.i; // 그렇게 되면 값이 호출시마다 증가한다.
	} // 호출해도 항상 처음부터 진행되기 때문에 (호출시마다 메모리가 사라지기 때문에) 몇번을 호출해도 출력되는 값은 i=1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment(); //{} => 메소드 블록이 끝나면 선언된 모든 변수는 메모리에서 사라진다. (지역 변수) 
		increment();
		increment();
	}

}
