import java.util.*;
import java.io.*;
public class 문자열배열_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\java_data\\seoul_location.txt");
		String data= "";
		int i=0;
		//fr => 한글자씩 => ASC => 정수 => char로 변경
		while((i=fr.read())!=-1) //-1 -> 파일 끝 (EOF)
		{
			data+=(char)i;
			
		}
		fr.close();
		//System.out.println(data);
		String[] location=data.split("\n");
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("========== 메뉴 ==========");
		    System.out.println("1. 목록");
		    System.out.println("2. 명소 검색");
		    System.out.println("3. 주소 검색");
		    System.out.println("4. 종료");
		    System.out.println("=========================");
		    System.out.print("메뉴 선택:");
		    int menu=scan.nextInt();
		    if(menu==4)
		    {
		    	System.out.println("프로그램 종료!");
		    	break; //while 종료
		    }
		    else if(menu==1)
		    {
		    	for(String loc:location)
		    	{
		    		String[] locData=loc.split("\\|");
		    		System.out.println("명소명:"+locData[1]);
		    		System.out.println("명소 소개:"+locData[2]);
		    		System.out.println("위치:"+locData[3]);
		    		System.out.println("=========================");
		    	}
		    }
		    else if(menu==2) {
		    	System.out.print("검색어 입력:");
		    	String fd=scan.next();
		    	for(String loc:location)
		    	{
		    		if(loc.contains(fd))
		    		{
		    			String[] locData=loc.split("\\|");
			    		System.out.println("명소명:"+locData[1]);
			    		System.out.println("명소 소개:"+locData[2]);
			    		System.out.println("위치:"+locData[3]);
			    		System.out.println("=========================");
		    		}
		    	}
		   
		    }
		    // 메소드로 처리 => 중복을 제거할 수 있고 재사용을 할 수 있다는 장점이 있다. <- 명령문의 모음
		    else if(menu==3) {
		    	System.out.print("주소 입력:");
		    	String address=scan.next();
		    	for(String loc:location)
		    	{
		    		if(loc.contains(address)) //contains() => 메소드
		    		{
		    			String[] locData=loc.split("\\|");
			    		System.out.println("명소명:"+locData[1]);
			    		System.out.println("명소 소개:"+locData[2]);
			    		System.out.println("위치:"+locData[3]);
			    		System.out.println("=========================");
		    		}
		    	}
		}
		
		
	}
	}
}

