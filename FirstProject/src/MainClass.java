/*
 	프로그램 : 컴퓨터에 명령을 수행하게 만든다.
 	----------------------------------------------------------------------------------------------------
 	데이터 저장 ==========================> 데이터 가공 ======================================> 가공된 데이터 출력
 	 				 					(유저의 요청에 따라)        
 	 				 																		솔루션
 	 				 						
 	 				 																		윈도우 (명령 프롬프트) => Application
 	 				 																		--------------------------------
 	 				 																		SI/SM 
 	 				 						
 	 				 																		브라우저 => Web Application
 	 				 																		핸드폰 => Mobile Application
 	 				 																		--------------------------------
 	 				 						
 	데이터 한개 : 변수              =========> 연산자 / 제어문
 	데이터 여러개 : 배열 / 클래스                 -> 반복이 많음 -> 묶어서 사용 => 메소드
 	====> 단점 (프로그램 종료시에 자동 삭제됨)
 	====> RAM에 저장돼서	
 	----------------------------------
 	영구적인 저장 장치 사용
      1) 파일
      2) RDBMS => 오라클
 	 			 						
 */
import java.io.*;
public class MainClass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		int i = 0;
		StringBuffer data=new StringBuffer(); // react
		while((i=fr.read())!=-1) // 파일이 끝일때 종료 => -1  EOF
		{
			data.append((char)i);
		}
		fr.close();
		System.out.println(data.toString());
	}

}
