// Recipe
class Recipe3
{
	String title;
	String chef;
	int people;
	int cookingtime;
	String level;
	String basic;
	String seasoning;
}
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Recipe3 r2=new Recipe3();
      r2.title ="소세지가지볶음밥 만드는 법 가지요리 소세지요리 볶음밥요리 한그릇요리";
      r2.chef = "하이유니별";
      r2.people = 2;
      r2.cookingtime = 30;
      r2.level = "초급";
      r2.basic = "가지 1개, 후랑크소세지 2개, 감자 1개, 양파 1/4개, 빨간 파프리카 1/4개, 대파 10cm, 다진마늘 1/2스푼, 밥 3스푼";
      r2.seasoning = "진간장 4스푼, 굴소스 2스푼, 맛술 2스푼, 설탕 1/2스푼, 참기름 1스푼, 깨 1/2스푼";
      System.out.println("제목:"+r2.title);
      System.out.println("작성자:"+r2.chef);
      System.out.println(r2.people+"인분");
      System.out.println(r2.cookingtime+"분 이내");
      System.out.println("[기본재료]");
      System.out.println(r2.basic);
      System.out.println("[양념재료]");
      System.out.println(r2.seasoning);
      
	}

}
