// 알파벳 10개 난수 => 버블 정렬(DESC)
// 중복 없는 알파벳
import java.util.*;
/*
 * 잘 짠 프로그램 : 가독성 ↑ --> 최적화 ↑
 */

public class 중첩_for__13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alpha = new char[10];
		for(int i=0; i<alpha.length; i++) 
		{
			alpha[i] = (char)((Math.random()*26)+65);
			for(int j=0; j<i; j++)
			{
				if(alpha[i]==alpha[j])
				{
					i--;   // 중복이라는 조건을 충족했을 때 원상복귀 시키기 위해서
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=0;j<alpha.length-1-i;j++)
			{
				if(alpha[j]<alpha[j+1])
				{
					char temp=alpha[j];
					alpha[j]=alpha[j+1];
					alpha[j+1]=temp;
				}
				
			}
	}
		System.out.println("내림차순 정렬 후:");
		System.out.println(Arrays.toString(alpha));
	}
}
		
		
	  
		
		



