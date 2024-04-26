import java.util.*;
public class 중첩_for_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		 // 6개 모두 중복 없는 난수 발생시키기
		for (int i=0; i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0; j<i; j++)
			{
				if(lotto[j]==lotto[i])
				{
					i--;
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(lotto));
		// 정렬해서 출력하기
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		System.out.println("========== 오늘의 로또 번호 ==========");
		for(int i:lotto)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(2000);
			}catch(Exception ex) {}
		}
		
	}

}
