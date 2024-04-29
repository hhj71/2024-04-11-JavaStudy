//8.학점을 구하는 메소드를 구현하시오 ==> ChoiceFormat

import java.util.Scanner;

public class 문제_8 {
	static char munje_8(int score)
	{
		char c = ' ';
		switch(score/10)
		{
		case 10: case 9:
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	}

}
