// contains() - 포함된 문자를 가져올 때 사용하는 것 
/* 
 *  JDBC => DBCP => MyBatis => (JPA)
 *  Ajax => Vue => React => Redux => React-Query => Next
 *   1차     2차     3차 ============================ 4차
 *  
 *  MSA
 *  
 */
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Jsoup 셀레니즘
		 Scanner scan=new Scanner(System.in);
		System.out.print("1. 노래명 검색  2. 가수명 검색:");
		int menu=scan.nextInt();
		int k=1;
		if(menu==1)
		{	System.out.println("노래명 입력:");
			String fd=scan.next();
			for(int i=1; i<=4; i++)
			{
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.artist");
				for(int j=0; j<title.size();j++)
				{	// 입력한 노래제목의 포함여부 -> contains
					if(title.get(j).text().contains(fd)) 
					{
					System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text()+")");
					k++;
					}
				}
			}
			
		}
		else if(menu==2)
		{
			System.out.println("가수명 입력:");
			String fd=scan.next();
			for(int i=1; i<=4; i++)
			{
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20240423&hh=15&rtm=Y&pg="+i).get();
				Elements title=doc.select("table.list-wrap a.title");
				Elements singer=doc.select("table.list-wrap a.artist");
				for(int j=0; j<title.size();j++)
				{	// 입력한 노래제목의 포함여부 -> contains
					if(singer.get(j).text().contains(fd)) 
					{
					System.out.println(k+"."+title.get(j).text()+"("+singer.get(j).text()+")");
					k++;
					}
				}
			} //원하는 부분 선택해서 페이지 소스 자료 찾을 때는 firefox가 더 편함
			
		}
		
	}

}
