package com.sist.io;
import java.io.*;
// 파일 쓰기 => 문자 스트림 (2 byte)이용 -> 한글 사용이 편리하다
// FileWriter
public class 라이브러리_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try
		{
		     fw = new FileWriter("c:\\java_data\\board.txt", true); // 파일이 없으면 자동 생성	
		     //FileWriter -> 파일은 생성하지만 폴더는 생성하지 않는다
		     String msg = "ABCDEFGHIJKLMNOOOOOOOOOOOOOOOO12345566778899\r\n";
		     fw.write(msg);
		     System.out.println("저장 완료!!");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception ex) {}
		}
	}

}
