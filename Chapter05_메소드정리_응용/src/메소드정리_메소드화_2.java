// 메소드정리_5 메소드화
import java.util.*;
public class 메소드정리_메소드화_2 {
	static void userInput(int[] kor, int[] eng, int[] math, int[] total, double[] avg, char[] score)
	{
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
		
	}
	static void rankChange(int[] total, int[] rank)
	{
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
	}
	static void print(int[] kor, int[] eng, int[] math, int[] total, double[] avg, char[] score, int[] rank)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(kor[i]+" "+eng[i]+" "+math[i]+" "+total[i]+" "+avg[i]+" "+rank[i]+" ");
		}
	}
	static void process()
	{
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math= new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int[] rank = new int[3];
		char[] score = new char[3];
		
		userInput(kor, eng, math, total, avg, score);
		rankChange(total, rank);
		print(kor, eng, math, total, avg, score, rank);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		process();
		
	}

}
