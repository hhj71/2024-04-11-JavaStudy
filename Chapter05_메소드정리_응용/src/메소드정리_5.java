// 3명의 학생 => 국어 /영어/수학 점수를 입력받아서 총점/평균/학점/등수 구하기
import java.util.*;
public class 메소드정리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math= new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int[] rank = new int[3];
		char[] score = new char[3];
		
		// 1. 입력, 총점, 평균, 학점
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<kor.length; i++)
		{
			System.out.print((i+1)+"번째 국어:");
			kor[i] = scan.nextInt();
			
			System.out.print((i+1)+"번째 영어:");
			eng[i] = scan.nextInt();
			
			System.out.print((i+1)+"번째 수학:");
			math[i] = scan.nextInt();
			 
			total[i]=kor[i]+eng[i]+math[i];
			
			avg[i]=total[i]/3.0;
			
			switch(total[i]/30)
			{
			case 10: 
			case 9:
				score[i]='A';
				break;
			case 8:
				score[i]='B';
				break;
			case 7:
				score[i]='C';
				break;
			case 6:
				score[i]='D';
				break;
			default:
				score[i]='F';
			}		
		}
		//2. 등수
		for(int i=0; i<total.length;i++)
		{
			rank[i]=1;
			for(int j=0; j<total.length;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		// 3. 출력
		for(int i=0;i<3;i++)
		{
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+rank[i]+" ");
		}
		//4. 조립 => process
	}

}
