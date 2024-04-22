
public class 자바제어문_반복문_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i;
		for(i=1; i<=10; i++)
        {
        	System.out.print(i+" ");
        } // 블록 밖에 i 변수설정 안해주면 메모리에서 삭제됨
		  // 변수 위치 확인 필수!!!
         // i=11일때 조건에 false라서 종료됨  
	    
		System.out.println("i="+i);
	}
	

}
