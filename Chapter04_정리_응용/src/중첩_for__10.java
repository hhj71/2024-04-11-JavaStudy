// 알파벳 10개를 임의로 추출한 후에 정렬해서 출력 => ASC/DESC

import java.util.*;

public class 중첩_for__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10];
		for(int i=0; i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);	
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(alpha));
		// 정렬해서 출력하기 (ASC)
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]>alpha[j])  // 오름차순일때
				{
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("오름차순 정렬 후:");
		System.out.println(Arrays.toString(alpha));
		// 정렬해서 출력하기 (DESC)
		for(int i=0;i<alpha.length-1;i++)
		{
			for(int j=i+1;j<alpha.length;j++)
			{
				if(alpha[i]<alpha[j])  // 내림차순일때
				{
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("내림차순 정렬 후:");
		System.out.println(Arrays.toString(alpha));
		
		
		
		
		
		
		
	}

}
