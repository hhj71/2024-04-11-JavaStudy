package com.sist.music;

public class MelonMusic extends MusicSystem{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try
		{
		FileReader fr= new FileReader("c:\\javadev\\ ")	
				
		// buffer => 임시기억장소 => 누적
		String data = sb.toString();
		//String 은 문자의 제한이 없다
		String[] mdata=data.split("\n");
		i=0;
		for(String s:mdata)
		{
			if(i>50) break;
			
			musics[i] = new Music();
			String[] temp=s.split("\\|");
			musics[i].setMno(temp[0]);
			musics[i].setTitle(temp[1]);
			musics[i].setSinger(temp[2]);
			musics[i].setAlbum(temp[3]);
			musics[i].setPoster(temp[4]);
			i++;
		}
	}catch (Exception ex) {}

	}	
}
