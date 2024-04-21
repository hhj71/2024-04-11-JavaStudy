
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int com=(int)(Math.random()*3); //0,1,2
 
   switch(com)
   {
   case 0:
	   System.out.println("가위");
	   break;
   case 1:
	   System.out.println("바위");
	   break;
	
   case 2: 
	   System.out.println("보");
	  //아래에 case가 없으니까 break 쓸 필요 없음...
	  
	   //default  생략 가능
   }
	}

}
