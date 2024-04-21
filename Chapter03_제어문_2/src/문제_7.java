/*
 * 7) 1~100사이의 정수 2개와 연산자(+,-,*,/)를 임의로 입력 받아 
 * 사칙 연산하는 프로그램을 만들어라 
   (다중조건문 사용) 
 */
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num1 = (int)(Math.random()*100+1); //1~100
      int num2 = (int)(Math.random()*100+1); //1~100
      int ops = (int)(Math.random()*4); //0~3
      
      char op = ' ';
      if (ops == 0)
    	   op = '+';
      else if (ops == 1)
           op = '-';
      else if (ops == 2)
    	   op = '*';
      else if (ops == 3)
    	   op = '/';
      // else 생략 가능
      
      int num3=0;
      if (op == '+')
    	  num3=num1+num2;
      else if (op=='-')
    	  num3=num1-num2;
      else if (op=='*')
    	  num3=num1*num2;
      else if (op=='/')
    	  num3=num1/num2;
      
      System.out.printf("%d %c %d = %d", num1,op,num2,num3);
	}

}
