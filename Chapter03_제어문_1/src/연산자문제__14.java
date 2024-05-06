/*
 * 1부터 100사이의 임의의 두 개의 정수가 있다. 
 * 첫째 수를 둘째 수로 나눈 나머지를 
 * 출력하는 프로그램을 작성해 보자.
 */
public class 연산자문제__14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num1=(int)(Math.random()*100)+1;//1~100
          int num2=(int)(Math.random()*100)+1;
          
          System.out.println("===== 결과값 =====");
    	  System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
          
	}

}
