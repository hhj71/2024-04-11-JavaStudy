/*
 * 대입연산자 => 메모리에 저장 
 *             └변수
 *
 * 
 * '=' -> int a=10; 10을 a라는 메모리에 저장 (대입)해라
 *   -> 형변환
 *       int a='A' // int는 4바이트 char는 2바이트라서 작은 값은 대입이 가능하다.
 *                    A는 65로 변경후에 저장된다.
 *       long l = 20; // 작은 값이라서 대입가능
 *                       long 형이기 때문에 20L로 변경되서 저장됨.
 *       double d=20; // 20.0으로 바뀜    
 *-------------------------------------------------------------------------       
 * 복합대입연산자                                 
 *   += (누적시에 주로 사용)
 *   	int a=10;
 *  	 a+=1; => a = a+1; // 더하기 먼저 하고 대입해라
 *    	=> a=11
 *   -=
 *   /=                                
 * --------------------------------------------------------------------====
 *      한개 증가    한개 감소
 *        ++         --                  
 *     여러개 증가    여러게 감소           41 page             
 *        +=          -=                                              
 */ 
public class 연산자_대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long l = 20; // 20L로 바뀌었음
		double d =20; // 20.0으로 바뀌었음
		System.out.println(d);
		
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		
		int b=10;
		b+=5;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		int score1=10;
		int score2=5;
		score1+=score2;
		System.out.println("score1="+score1); //15
		
		score1-=score2;
		System.out.println("score1="+score1);//10
		
		//변수값이 변경되는 연산자 --> ++,--,+=,-=
		// 나머지 연산자는 변수값 변경이 안된다.
		int m=10;
		m++; //11
		m+=10; //21
		int n=20;
		System.out.println(m+n);
		System.out.println(n=m+n);
		System.out.println("n="+n);
		
		
	}

}
