/*
 * ------------------------
 *  class Sawon => 한명의 사원에 대한 정보를 모아둔다
 *  {
 *     String name;
 *     String dept;
 *  }
 *  ----------------------- 변수가 아니라 데이터형 (Sawon 데이터형) => 사용자 데이터형
 *  public class MainClass
 *   {   
 *      Sawon s = new Sawon(); => 모든 메소드에서 사용이 가능 => 멤버변수(전역변수) // 훨씬 편하다...
 *      static void aaa()
 *      {
 *          Sawon s = new Sawon(); --------
 *      }                                  |
 *      static void bbb()                  |
 *      {                                  |
 *          Sawon s = new Sawon(); --------   => 메소드 안에 있는 변수는 호출후에 사라진다
 *      }                                  |  => 이름은 같아도 각각 다 다른 변수 
 *      static void ccc()                  |
 *      {                                  |
 *          Sawon s = new Sawon(); --------
 *      }
 *     
 *      public static void main(String[] args)
 * 
 * 
 */
/*
 *  메소드 안에서만 사용 => 지역변수
 *  
 *  ex) for(int i=1; i<=10; i++)
 *         {
 *         } 
 *    => 여기서 i
 *         
 *  전체 메소드에서 사용 => 멤버변수
 *  
 * 
 */
public class 멤버변수_활용 {
	static int a = 100;
	static void aaa()
	{
		//int a=100; // aaa() 끝나면 => a 사라진다.
		System.out.println("aaa():a="+a); 
		System.out.println("aaa():a는 사라진다");
		// {} => 블록 안에서만 사용하는 변수 => 지역변수
		
	}
	static void bbb()
	{
		
		System.out.println("bbb():a="+a);
		System.out.println("bbb():a는 사라진다");
		
	}
	static void ccc()
	{
		
		System.out.println("ccc():a="+a);
		System.out.println("ccc():a는 사라진다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aaa();
		bbb();
		ccc();
	}

}
