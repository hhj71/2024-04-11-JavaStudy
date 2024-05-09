package com.sist.main;
// 국어,영어,수학 점수를 입력을 받아서 -> 메소드 1개
// 총점, 평균, 학점을 구하고 출력하라 -> 메소드 4개
import java.util.*;
class Student 
{   //국어,영어,수학 점수 입력받기
	// 반복 제거 ==> 메소드의 첫번째 목적 => 반복적인 소스를 제거
	public int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	// 총점 
	public int totalData(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	// 평균
    public double avgData(int total)
    {
    	return total/3.0;
    }
    // 학점
    public char scoreData(int avg)
    {
    	char c = 'A';
    	switch(avg/10)
    	{
    	case 10:
    	case 9:
    		c='A';
    		break;
    	case 8:
    		c='B';
    		break;
    	case 7:
    		c='C';
    		break;
    	case 6:
    		c='D';
    		break;
    	default:
    		c='F';
    	}
    	return c;
    }
    // 출력 => return total, avg, score
    // total, avg,score = 메소드()
}
public class 성적계산_메소드형 {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
