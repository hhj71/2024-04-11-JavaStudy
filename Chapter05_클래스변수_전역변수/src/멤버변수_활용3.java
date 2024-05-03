/*
 * 	static 메소드
 *  ------------
 *    => static 변수만 사용이 가능
 *    => 멤버변수를 사용하려면 => new를 이용해 객체 생성 후 사용해야함
 *    
 *  ★멤버 메소드★   (=> 5장 시작)
 *  -----------
 *  => static 변수, 멤버변수를 사용할 수 있다.
 *  
 */
public class 멤버변수_활용3 {
	int a = 10;
	static int b=10; // 변경하면 한번에 동시에 변경된다.
	// 공통으로 사용되는 메소드 (static 메소드)
	static void display()
	{
		멤버변수_활용3 ss=new 멤버변수_활용3();
		System.out.println("a="+ss.a);
	}
	void print() //(클래스 멤버 메소드)
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
