/*
 * 7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
    A C D H J
    J H D C A
 */
import java.util.*;
public class 문제_7 {

   public static void main(String[] args) {
      char[] alpha=new char[5];
      for(int i=0;i<alpha.length;i++)
      {
         alpha[i]=(char)((Math.random()*26)+65); // 정수를 char로 변환해야하기때문에 괄호 
      }
      System.out.println("변경전:");
      System.out.println(Arrays.toString(alpha));
      System.out.println("변경후");
      Arrays.sort(alpha);// 오름차순만 가능 (ASC)
      System.out.println(Arrays.toString(alpha));
      /* for(char c:alpha)
      {
         System.out.print(c+" ");
      }
      Arrays.sort(alpha);
      System.out.println("\n"+Arrays.toString(alpha));
      */
      
      System.out.println("\n---------반대로 출력(인덱스 번호 이용)");
      for(int i=alpha.length-1;i>=0;i--) // 내림차순 (DESC)
      {
         System.out.print(alpha[i]+" ");
      }
   
   }

}