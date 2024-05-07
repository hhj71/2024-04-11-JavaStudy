//Food
class FoodHouse2
{
	String name;
	double score;
	String loc;
	String number;
	String type;
	String price;
	String parking;
	String time;
	String menu;
	
}

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodHouse2 f2 = new FoodHouse2();
		f2.name ="조점례남문피순대";
		f2.score= 4.3;
		f2.loc="전라북도 전주시 완산구 풍남문2길 39 남부시장";
		f2.number="063-232-5006";
		f2.type="탕/찌개/전골";
		f2.price="만원미만";
		f2.parking="무료주차 가능";
		f2.time="06:00 - 24:00";
		f2.menu="순대국밥 (7000원), 피순대(소)(12000원), 잡채순대 (10000원), 모듬고기(소)(12000원), 머리눌림(소)(12000원)";
		String[] menus = f2.menu.split(",");
		System.out.println("업체명 :"+ f2.name);
		System.out.println("평점 :"+f2.score);
		System.out.println("지역 :"+f2.loc);
		System.out.println("전화번호 :"+f2.number);
		System.out.println("음식종류 :"+f2.type);
		System.out.println("가격대 :"+f2.price);
		System.out.println("주차 :"+f2.parking);
		System.out.println("영업시간 :" +f2.time);
		System.out.println("=== 메뉴 ===");
		for(String m:menus)
		{
			System.out.println(" "+m.trim());
		}
	}

}
