package com.sist.io;
/*
 * 파일 쓰기 -> FileWriter
 *   ==> 크롤링한 데이터를 저장
 * 파일 읽기 -> FileReader
 *   ==> 프로그램 제어
 *   ==> 읽기 => 한줄씩 (파일에 있는 데이터를 메모리에 한번에 저장) / 한글자 (파일에 있는 데이터를 한개씩)
 * 필터 스트림
 *   => ★ BufferedReader (네트워크, 웹)   
 *   
 *   369 page
 *   
 *   FileWriter (FileOutputStream) => write() , close()
 *   FileReader (FileInputStream) -> read() , close()
 *   => 한글자씩 읽기 / 한글자씩 쓰기
 *       --------- => 여러글자 입력이 가능
 *       	FileWriter => write(String s)
 *          FileOutputStream => write(byte[])
 *          
 */
// 파일에 저장
import java.io.*;
public class 라이브러리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. FileOutputStream 을 이용한 저장
		
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("c:\\java_data\\member.txt");
			//파일이 없는 경우에는 자동 생성이 된다
			// 파일이 있는 경우에는 문자 저장이 가능
			// => FileOutputStream , FileWriter => 경로명과 파일명을 지정하면 없는 경우 자동 생성이 된다
			// 한글자 입력 -> byte(int, char)
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
			// 여러개 글자 한번에 입력 -> byte[]
			String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			fos.write(msg.getBytes()); //getBytes() -> 바이트 배열로 바꿔줌 
			System.out.println("저장 완료!!");
			
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
			}catch (Exception ex) {}
		}
		
	}

}
