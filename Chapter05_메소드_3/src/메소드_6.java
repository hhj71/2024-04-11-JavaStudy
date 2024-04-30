/*
 *  5개 정수를 넘겨주면 정렬(ASC/DESC)
 *  
 *  =선택정렬 : 1개를 선택해서 변경
 *  =버블정렬 : 인접한 데이터끼리 변경
 * ---------------------------- sort reserve, 오라클(ORDER BY)가 있어서 나중에는 잘 안 쓰게된다.
 *   .. 지금은 로직을 익히기 위해 사용 (프로그램 -> 2차 for)
 *   
 *   1) 이차 for
 *   		for(초기값;조건식;증감식)
 *   		{
 *   			for(초기값;조건식;증감식)
 *   			 {
 *   			      반복출력문장         => 2차 for문이 false가 되면 1차 for문의 증감식으로 이동함
 *   			 }
 *   		}
 *      -----------------------------------
 *      예)
 *          for(int i=1; i<=5; i++)
 *          {
 *               for (int j=1; j<=5;j++)
 *               {
 *               	반복 출력 문장 => 총 25번 수행함
 *               }
 *          }   
 *          
 *          i=1 i<=5 ---------- j=1 j<=5 문장수행 j++
 *             false면 종료       j=2 j<=5 문장수행 j++ 
 *                              j=3 j<=5 문장수행 j++
 *                              j=4 j<=5 문장수행 j++
 *                              j=5 j<=5 문장수행 j++
 *                              ------------------- i++
 *          i=2 i<=5 ---------- j=1 j<=5 문장수행 j++
 *                              j=2 j<=5 문장수행 j++ 
 *                              j=3 j<=5 문장수행 j++
 *                              j=4 j<=5 문장수행 j++
 *                              j=5 j<=5 문장수행 j++
 *                              ------------------- i++
 *          i=3 i<=5 ---------- j=1 j<=5 문장수행 j++
 *                              j=2 j<=5 문장수행 j++ 
 *                              j=3 j<=5 문장수행 j++
 *                              j=4 j<=5 문장수행 j++
 *                              j=5 j<=5 문장수행 j++
 *                              ------------------- i++
 *          i=4 i<=5 ---------- j=1 j<=5 문장수행 j++
 *                              j=2 j<=5 문장수행 j++ 
 *                              j=3 j<=5 문장수행 j++
 *                              j=4 j<=5 문장수행 j++
 *                              j=5 j<=5 문장수행 j++
 *                              ------------------- i++ 
 *          i=5 i<=5 ---------- j=1 j<=5 문장수행 j++
 *                              j=2 j<=5 문장수행 j++ 
 *                              j=3 j<=5 문장수행 j++
 *                              j=4 j<=5 문장수행 j++
 *                              j=5 j<=5 문장수행 j++
 *                              ------------------- i++    
 *          i=6 i<=5 --> false => for 전체 종료
 *          
 *                                                                 
 *    - 선택정렬 => 앞에서부터 고정
 *      -----
 *         i  i+1
 *         30  20  40  10  50
 *         --  --
 *         20  30                                     
 *         --      --                         총 arr.length-1 바퀴
 *         20      40                         
 *         --          --                      
 *         10          20                     
 *         --             --                   
 *         10             50
 *         --------------------- 1round ==> for문 1번째바퀴
 *         10  30  40  20  50                   
 *         --  --  --
 *         고정 30  40     
 *             --      --
 *             20      30
 *             --          --         
 *             20          50        
 *        --------------------- 2round ==> for문 2번째바퀴    
 *         10  20  40  30  50  
 *        ------  --   --
 *         고정    30   40
 *                --      --
 *                30      50
 *        ---------------------- 3round => for문 3번째바퀴
 *        10  20  30  40  50 
 *        ----------  --  --
 *          고정       40  50
 *        ---------------------- 4round => for문 4번째바퀴
 *        10 20 30 40 50
 *        -----------       * 제일 마지막거는 한개만 남아서 비교할 필요 없음.
 *           고정 ------------------> 결론적으로 for문이 length-1바퀴만큼 실행된다.                                                     
 *                                                                   
 *                                                                  
 */
public class 메소드_6 {
	static int[] sort(String type, int[] arr) //"ASC"이면 오름차순, "DESC"이면 내림차순
	{   
		boolean bCheck=false;
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{     
				if(type.equals("ASC"))       // 여기서 조건을 <로 주냐(내림차순) >로 주냐(오름차순)에 따라서 정렬방향이 바뀜
					bCheck=arr[i]>arr[j];
				else if(type.equals("DESC")) 
				    bCheck=arr[i]<arr[j];
				
				if(bCheck) 
				{
				int temp=arr[i];  // 값 교환할 때 임시변수 쓰는거 까먹지 말기!!!
				arr[i]=arr[j];
				arr[j]=temp;
				}
		    }
		}
		return arr; //정렬된 배열을 전송
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[5];
		for (int i=0; i<arr.length; i++)
		{
			//초기화
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("====== 변경 전 =====");
		for(int i:arr) // for-each 구문 (출력 전용) => front-end
		{
			System.out.print(i+" ");
		}
		System.out.println("\n====== 변경 후 =====");
		arr=sort("ASC",arr);
		for(int i:arr) // for-each 구문 (출력 전용) => front-end
		{
			System.out.print(i+" ");
		}
		System.out.println();
		arr=sort("DESC",arr);
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
	}

}
