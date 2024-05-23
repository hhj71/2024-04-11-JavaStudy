import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;

public class Melon_C {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList SL = new ArrayList();

		//크롤링 하는 메서드

		Crawling(SL);

		}

		static void Crawling(ArrayList SL) throws IOException {

		String url = "https://www.melon.com/chart/index.htm";

		Document melon = null;

		try {

		melon = Jsoup.connect(url).get();

		} catch (IOException e) {

		// TODO Auto-generated catch block

		e.printStackTrace();

		}

		// 1~50위

		Elements title = melon.select("td>div>div>div.ellipsis.rank01>span>a");

		Elements singer = melon.select("div>table>tbody>tr>td>div>div>div.ellipsis.rank02>a");

		Elements album = melon.select("td>div>div>div.ellipsis.rank03 > a");
		Elements poster= melon.select("div.wrap a.image_typeAll img");
		//곡명

		// for(Element e : titles) {

		// String song = e.text();

		// System.out.println("제목: "+song);

		// System.out.println("===========");

		// }

		//가수명

		// for(Element e : artist) {

		// String artistName = e.text();

		// System.out.println("가수명: "+artistName);

		// System.out.println("===========");

		// }

		//앨범명

		// for(Element e : album) {

		// String albumName = e.text();

		// System.out.println("앨범명: "+albumName);

		// System.out.println("===========");

		// }
		int k=1;
		for(int i=0; i<=100;i++) {

		Element e1 = title.get(i);

		Element e2 = singer.get(i);

		Element e3 = album.get(i);

		String song = e1.text();

		String artistName = e2.text();

		String albumName = e3.text();
		for(int j=0;j<=100;j++)
		  {
			  System.out.println("순위:"+(k));
			  System.out.println("노래명:"+title.get(j).text());
			  System.out.println("가수명:"+singer.get(j).text());
			  System.out.println("앨범:"+album.get(j).text());
			  System.out.println("이미지:"+poster.get(j).attr("src"));
			  //System.out.println("동영상 키:"+youtubeData(title.get(j).text()));
			  System.out.println("===================================================");
			  FileWriter fw=
					  new FileWriter("c:\\javaDev\\melon.txt",true);//append
			  String data=(j+1)+"|"
					     +title.get(j).text()+"|"
					     +singer.get(j).text()+"|"
					     +album.get(j).text()+"|"
					     +poster.get(j).attr("src")+"\r\n";
			  fw.write(data);
			  fw.close();
			  k++;
		  }
		}
		
	}

}
