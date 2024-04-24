// 5개의 난수 발생 => 출력 / 평균 출력 한다.
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		int a1=(int)(Math.random()*100)+1;
		int a2=(int)(Math.random()*100)+1;
		int a3=(int)(Math.random()*100)+1;
		int a4=(int)(Math.random()*100)+1;
		int a5=(int)(Math.random()*100)+1;
		
		System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
		System.out.printf("평균:%.2f\n", a1+a2+a3+a4+a5/5.0);
		*/
		// 배열
		int[] arr = new int [5]; // new를 이용하면 자동으로 0값으로 초기화
		for(int i=0; i<5; i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		// 출력 => 향상된 for문 => for-each => 데이터 출력 => 배열, 컬렉션에서만 사용이 가능
		// 값 추가, 수정... 불가능 => 출력만 담당 => 데이터가 모아져 있어야 사용이 가능 
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		/*
		 * new를 이용해 메모리 할당
		 * => 자동 초기화
		 * int => 0
		 * double => 0.0
		 * long => 0L
		 * float => 0.0F
		 * boolean => false
		 * char => '\0'
		 * String => null
		 * 
		 * 배열, 클래스 
		 * ---------
		 * 메모리 구조
		 * ---------------------------
		 * Method Area/ static
		 *  main ================> 5장
		 * ---------------------------
		 * Stack -> 지역변수 => 관리 (메모리 자체 관리)
		 *        => {}이 종료되면 자동으로 사라진다. 
		 * --------------------------------
		 * Heap => 배열의 실제값, 클래스 실제값 => 관리(프로그래머)
		 * 		=> 프로그래머가 관리를 소홀히한다
		 *         ---------------------- 자동 메모리 회수 (가비지 컬렉션)
		 *                          | 바로 회복되지 않고 프로그램 종료시에 회수
		 *                          | 메모리 누수 현상
		 * ---------------------
		 *  int[] arr=new int [5]
		 *  new => 요청한 메모리를 생성 => 생성된 위치와 주소값을 배열변수에 넘겨주다
		 *        스택     |      힙
		 *                   100 104 108 112 116
		 *  arr = 0x100              ---------------------------------------
		 *    └주소 참조 변수               0    |   0   |   0   |   0  |   0  |               
		 *                           |--------------------------------------        
		 *                        0x100  |       |       |       |      |
		 *                               0       1      2        3      4  
		 *                       실제값: arr[0]  arr[1]  arr[2]  arr[3]   arr[4]  => 일반 변수 취급
		 *                            arr+0*4  arr+1*4 arr+2*4  arr+3*4 arr+4*4
		 *                  => 연속적인 메모리 구조    
		 *                  	| arr의 첫번째 값 요청 => arr[0] => 일반 변수와 동일
		 *                      | arr의 두번째 값 요청 => arr[1]
		 *                      | arr의 세번째 값 요청 => arr[2]
		 *                      | ...
		 *                        ...
		 *
		 *                          
		 *                          
		 *                          
		 *                          
		 *                          
		 *                          
		 *                          
		 *                          
		 */
		/*
		 *  for-each
		 *  --------
		 *  int[] arr
		 *  double[] arr
		 *  char[] arr
		 *  for(데이터형 변수: 배열명)
		 *      --------
		 *       int
		 *       double
		 *       char
		 *  배열에 저장된 실제 데이터값을 읽어온다
		 *  =============== 배열의 모든 값을 읽으면 자동 종료
		 *  예) int[] arr={10,20,30,40,50}
		 *     ------- 데이터형 일치 => 배열명
		 *     for (int i:arr) 
		 *        i=10
		 *        i=20
		 *        i=30
		 *        i=40
		 *        i=50  => for 종료
		 *   char[] arr={'A','B','C'}
		 *    for(char c: arr)
		 *     c='A'
		 *     c='B'
		 *     c='C' ===> 종료     
		 *   ==> 사용 ==> 출력과 관련 (브라우저에서 목록)    
		 *  ***
		 *  char[] arr={'A','B','C'}
		 *  for (int i:arr)   
		 *    => 데이터형이 크면 값에 대한 형변환은 가능함
		 *  byte < char < int < long < float < double
		 *   => 형변환은 사용할 수 없다    
		 *   
		 *   (double)int a; -> 불가능 
		 *   int a = (int)10.5    
		 */
		
		
	}

}
