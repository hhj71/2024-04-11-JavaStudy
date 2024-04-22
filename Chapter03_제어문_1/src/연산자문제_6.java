

public class 연산자문제_6 {

	public static void main(String[] args) {
		
		int num1=10, num2=10;   
	       int a, b;   
	       a = ++num1;
	       b = num2++; 

	       System.out.printf("%d, %d \n", b, num2);

	}
              /* 결과값은
               * 10, 11
               */
}
/*
 *     int num1=10, num2=10;   
       int a, b;   
       a = ++num1;
           --
           => 전치 연산자 => 먼저 증가
         -- 증가된 값을 대입 
       a=11 num1=11
       b = num2++;
       --------
         1 => 후치연산자 => 대입
           ------
             2 => 증가 

       System.out.printf("%d, %d \n", b, num2);
                                         =====  11
                                     === 10 

 */
