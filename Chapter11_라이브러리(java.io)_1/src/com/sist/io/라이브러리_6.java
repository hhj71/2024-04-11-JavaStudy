package com.sist.io;
/*
 * 	=> inputStream / outputStream => 도스 창
 *  => HTML/Window => 입력할 수 있는 창을 만든다
 *  파일 입출력, 객체 단위 입출력
 *  FileInputStream / FileOutputStream
 *  ->파일 복사 / 파일 다운노드
 *  
 */
import java.io.*;
/*
 * 	파일
 *   => 모드 
 *   	 r -> 읽기 => FileReader
 *  	 w -> 쓰기 => 
 *    -----------------  -> 파일 Create
 *  	 a -> append -> 파일에 연속해서 출력																																																					
 * 
 * 
 */
public class 라이브러리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// 파일 업로드/ 다운로드 / 파일 복사
		// 파일 제어 => 읽기 쓰기. 
		try
		{
			fis = new FileInputStream("c:\\javaDev\\back.jpg");
			fos = new FileOutputStream("c:\\java_data\\back.jpg");
			int i=0;
			byte[] buffer = new byte[1024];
		 while ()
		{
			
		}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			
		}
	}

}
