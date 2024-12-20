package com.sist.io;
/*
 * 	355page
 * 	--------
 * 		1. java.io : CheckedException을 가지고 있다 => 예외처리를 반드시 한다
 *           = io : 입출력
 *           	inputStream / outputStream
 *           		|				|
 *           	   read()          write()
 *           		읽기              쓰기	
 *             => Stream : 데이터가 이동하는 통로
 *             	  FIFO => 먼저 들어간 값이 먼저 나오는 방식 => Queue
 * 		2. File
 * 		3. FileInputStream / FileOutputStream
 * 		4. FileReader / FileWriter
 * 		5. BufferedReader / BufferedWriter
 * 		6. BufferedInputStream / BufferedOutputStream
 * 		7. ObjectInputStream / ObjectOutputStream
 *     -------------------------------------------------------- 		 
 *          InputStream / OutputStream : 읽기 / 쓰기 => 1byte 씩 읽기를 한다 => 한글이 깨진다
 *                			=> 업로드/ 다운로드 =>바이트 스트림
 *           Reader / Writer : 읽기 / 쓰기 => 2byte 씩 읽기 /쓰기를 한다 => 한글이 정상적
 *           				=> 파일 읽기 / 쓰기 (한글 포함)
 *           				=> 문자 스트림
 *           => movie.txt -> FileReader          
 * 
 *    1. 메모리에 저장 => 프로그램이 종료가 되면 모든 데이터가 사라진다
 *       ---------- 속도가 빠르다
 *       	|영구적으로 저장하는 장치 
 *       	 -------------------
 *       		파일 
 *       		--- 단점) 1. 데이터 노출 / 2. 잊어버릴 가능성 / 3. 관련된 데이터를 따로 저장해서 처리하기 어렵다
 *       				 4. 구분자가 없다 => 배열에 저장 , ArrayList에 저장해서 사용
 *                     ------------------------------------------------------------------------------
 *                                                  
 *  2. 파일에 정보 => 376 page => 파일입출력
 *     --------     -------
 *                  | 377 page에 나오는 메소드
 *     File : 파일 , 폴더 정보를 가지고 있다
 *     ---------------------------------              
 *     File 생성자
 *     	=> File file = new File("경로명/파일명") => 파일에 대한 정보를 가지고 온다
 *         File dir = new File("경로명") => 폴더에 대한 정보를 가지고 온다
 *         
 *     File 정보와 관련된 메소드
 *      ★ 1) 파일명 읽기 => getName() 리턴형 : String
 *        2) 경로명 읽기 => getParent() 리턴형 : String
 *      ★ 3) 파일명+경로명 => getPath() 리턴형 : String
 *      ★ 4) 파일 크기 => length() 리턴형 : long
 *        5) 숨긴 파일 여부 => isHidden() 리턴형: boolean
 *        6) 읽기 가능 여부 => canRead() 리턴형: boolean
 *        7) 쓰기 가능 여부 => canWrite() 리턴형: boolean
 *        8) 수정일 변경 => lastModified() 리턴형 : long
 *      ★ 9) 파일 정보를 한번에 읽기 (폴더) => listFiles() 리턴형 : File[]
 *        10) 파일 여부 확인 => isFile() 리턴형: boolean
 *        11) 폴더 여부 확인 => isDirectory() 리턴형: boolean
 *    
 *    File 제어하는 메소드
 *    	★ 1) 폴더 생성 : mkdir()
 *    	★ 2) 파일 생성
 *    	★ 3) 파일 삭제
 *    	★ 4) 파일 존재 여부   
 *    
 *    	
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\javaDev\\melon.txt");
		System.out.println("파일명:" + file.getName());
		System.out.println("경로명:" + file.getParent());
		System.out.println("파일명+경로명:" + file.getPath());
		System.out.println("숨긴 파일:" + file.isHidden());
		System.out.println("읽기 전용:" + file.canRead());
		System.out.println("쓰기 전용:" + file.canWrite());
		System.out.println("파일 여부:" + file.isFile());
		System.out.println("수정일:" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		System.out.println("파일 크기:" + file.length());
	}

}
