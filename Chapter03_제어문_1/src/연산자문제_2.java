import java.util.Scanner;
public class 연산자문제_2 { 

	public static void main(String[] args) {
		 int money=369;
	        
	        int won100=money/100; // 100 => 몇개 
	      
	        int won10=(money%100)/10; // 10  => 몇개
	        
	        int won1=money%10; // 1   => 몇개 
	        // => %은 윤년 구하기 => 배수 
	        System.out.println("100원 동전:"+won100);//3
	        System.out.println("10원 동전:"+ won10);//6
	        System.out.println("1원 동전:"+won1);//9
	        
	        Scanner scan=new Scanner(System.in);
	        System.out.print("년도 입력:");
	        int year=scan.nextInt();
	        
	        if((year%4==0 && year%100!=0)||(year%400==0))
	        {
	        	System.out.println(year+"년도는 윤년입니다");
	        }
	        if(!((year%4==0 && year%100!=0)||(year%400==0)))
	        {
	        	System.out.println(year+"년도는 윤년아닙니다");
	        } 
		
		
		
		
		
		
		
		
		
		/* int a, b;  
		    a = 6;  
		    b = 2;   
		    System.out.printf("덧셈 연산 결과: %d \n", a+b);  
		    System.out.printf("뺄셈 연산 결과: %d \n", a-b);  
		    System.out.printf("곱셈 연산 결과: %d \n", a*b);  
		    System.out.printf("나누기 연산 결과: %d \n", a/b);
		    System.out.printf("나머지 연산 결과: %d \n", a%b);
		    */
	}
      /* 결과값은
       * 덧셈 연산 결과: 8
       * 뺄셈 연산 결과: 4
       * 곱셈 연산 결과: 12
       * 나누기 연산 결과: 3
       * 나머지 연산 결과: 0
       */
}
