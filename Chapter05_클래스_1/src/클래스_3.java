/*
 * int a=1, b=3, c=2, d=4, e=6, f=5;
 * int max=a;
 * if(max<a)
 * 	max = a;
 * if(max<b)
 * 	max = b;
 * if(max<c)
 * 	max = c;
 * if(max<d)
 * 	max = d;
 * if(max<e)
 * 	max = e;
 * if(max<f)
 * 	max = f;
 * => 비효율적임
 * => 데이터를 묶어서 처리하는 게 훨씬 나음
 * --------------------------------------
 * int[] arr = new int[6]
 * int max = arr[0]
 * for(int i: arr)
 * {
 *     if(max<i)
 *     max=i
 *  }
 *  ==========================================================================
 *  String[] name
 *  int[] kor
 *  int[] math
 *  int[] eng
 *  int[] total
 *  double[] avg
 *  int[] rank
 *  char[] score
 *  ------------------------------------ 사용자 정의 데이터형
 *  class Student
 *  {
 *    String name;
 *    int kor,eng,math,total,rank;
 *    char score;
 *    double avg
 *  }
 *  
 *  Student[] std = new Student[10]
 */
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
