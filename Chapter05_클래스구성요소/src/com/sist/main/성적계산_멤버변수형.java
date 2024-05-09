package com.sist.main;
import java.util.Scanner;
class Student2
{
	private int kor,eng,math,total;
	private double avg;
    private char score;
    // => Student2에 선언되는 모든 메소드에서 사용이 가능
    // 입력
    public int input(String msg)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(msg+" 입력:");
    	return scan.nextInt();
    }
    // total
    public void totalData()
    {
    	total=kor+eng+math;
    }
    // avg
    public void avgData()
    {
    	avg=total/3.0;
    }
    public void scoreData()
    {
    	char c = 'A';
    	switch(total/30)
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
}
public class 성적계산_멤버변수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
