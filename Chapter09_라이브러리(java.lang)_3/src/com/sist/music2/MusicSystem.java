package com.sist.music2;
import java.io.*;

public class MusicSystem {
	private static com.sist.music2.Music[] musics=new com.sist.music2.Music[100];
	static
	{
		FileReader fr = null;
		try
		{
			// CheckedException => 컴파일시에 예외 감사
			// => 초기화 블록은 throws 는 사용이 불가능하다
			//               ------  메소드에서만 사용이 가능 (생성자 포함)
			fr = new FileReader("c:\\javaDev\\melon.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			// 데이터 문자열 결합이 많은 경우 -> StringBuffer / StringBuilder
			//								비동기화            동기화
			//                             ArrayList          Vector
			//String data="";
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
				//data+=(char)i;
			}
			//System.out.println(data);
			//System.out.println(sb.toString());
			// String으로 제어
			String data = sb.toString();
			// 분리 => \n
		    String[] temp = data.split("\n");
		    i=0;
		    for(String s: temp)
		    {
		    	String[] m = s.split("\\|"); // | => 정규식 기호 => 일반 문자로 변경하기 위해서는 => \\|
		    	// 정규식 기호 => . , + , * , | , ? , ^ , $
		    	musics[i] = new com.sist.music2.Music();
		    	musics[i].setMno(Integer.parseInt(m[0]));
		    	musics[i].setTitle(m[1]);
		    	musics[i].setSinger(m[2]);
		    	musics[i].setAlbum(m[3]);
		    	musics[i].setPoster(m[4]);
		    	i++;
		    }
		}catch(Exception ex) 
		{
			// 에러 발생시 복구 => 확인
			ex.printStackTrace(); // FileNotFoundException / IOException => Exception
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex) {}
		}
	}
	public int musicTotalPage()
	{
		return (int)(Math.ceil(musics.length/10.0));
		// 총 페이지 구할 때 올림함수 이용한다 
		// => 10.0 -> 10 / 10.1 -> 11
	}
	public com.sist.music2.Music[] musicListData()
	{
		return musics;
	}
	//
	public com.sist.music2.Music musicDetailData(int mno)
	{
		com.sist.music2.Music m = new com.sist.music2.Music();
		for(com.sist.music2.Music mm : musics)
		{
			if(mm.getMno()==mno)
			{
				m=mm;
				break;
			}
		}
		return m;
	}
	// 검색
	public Music[] musicFindData(String fd)
	{
		int count = 0;
		for(com.sist.music2.Music m : musics)
		{
			if(m.getTitle().contains(fd)) // boolean => if문의 조건
			{
				count++;
			}
		}
		com.sist.music2.Music[] mm = new com.sist.music2.Music[count];
		int i=0;
		for(com.sist.music2.Music m : musics)
		{
			if(m.getTitle().contains(fd))
			{
				mm[i]=m;
				i++;
			}
		}
		return mm;
	}
	
}
