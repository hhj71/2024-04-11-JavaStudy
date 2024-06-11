package com.sist.temp;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.*;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Image
{
	String poster;
}
class WikiImage
{
	static Image[] images = new Image[711];
	{
		try
		{
			Document doc = Jsoup.connect("https://wikibook.co.kr/list/").get();
			Elements poster = doc.select("div.col-md-1 a img");
			for (int j=0; j<poster.size(); j++)
			{
				System.out.println(poster.get(j).attr("src"));
				FileWriter fw =
						new FileWriter("c:\\javaDev\\wiki.txt",true);
				String data = poster.get(j).attr("src") +"," +"\r\n";
				fw.write(data);
				fw.close();
			}
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
}
public class ImageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WikiImage();
	}

}
