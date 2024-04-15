/*
 * 단항연산자 
 *  = 증감연산자 : ++, -- => 1개 증가, 1개 감소 // 누적, 제어문(반복문), 총알(슈팅게임) 등에 사용한다.
 *       - 전치연산 : 먼저 연산후에 대입 ex) ++a, --a
 *       - 후치연산 : 대입후에 나중에 증가 ex) a++, a--
 *       
 *       예제
 *       1. int a = 10;
 *          int b = ++a + ++a + a++
 *          a => 13
 *          b => 35
 *          
 *       2. int a = 10;
 *          int b = a++ + a++ + a++;   // 10+11+12 => 33
 *       
 *       3. int a = 10;
 *          int b = ++a + ++a + ++a;   //11+12+13 => 36
 *         
 *       4. int a = 10;
 *          int b = a++ + ++a + a++;   // 10+12+12 =>34
 *           
 *                
 *  = 부정연산자
 *  = 형변환연산자 => boolean제외
 * 
 */
public class 연산자_단항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* int a=10;
		int b = ++a + ++a + a++;
		System.out.println("a="+a+", b="+b);
		*/
		int a = 10;
		a++;
		a++;
		a++;
		System.out.println("a="+a);
	
		int b =10;
	    b--; //9
		b--; //8
		b--; //7
		System.out.println("b="+b);
		
		int c = 10;
		++c; 
		++c;
		++c;
		System.out.println("c="+c);
		
		int d=10;
		--d;
		--d;
		--d;
		System.out.println("d="+d);
	}

}
