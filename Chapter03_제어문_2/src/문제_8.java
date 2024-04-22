/* 8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
 */

public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i=2, re=0;
		for(int j=1; j<=50; j++) {
			re+=i; 
			i+=2;    
		}
		System.out.println(re);
	}

}
