// split
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red, blue, black, yellow, white, pink, magenta";
		String[] colors = color.split(","); //구분자가 명확하게 있어야 사용이 가능하다
		for(String c:colors)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		String name = "홍길동|심청이|춘향이|박문수|이순신|강감찬";
		String[] names = name.split("\\|"); // regex(정규식)에서 | 가 구분자라서 \\| 이렇게 해야 | 를 인식한다.
		/*
		 * 정규식에서 사용하는 기호들
		 * ?  => 둘중에 하나 (앞에거 or 뒤에거)
		 * |  => 여러개 중에 한개 선택 => A|B|C
		 * .  => 임의의 한글자
		 * +  => 한개 이상의 문자가 있는 경우
		 * *  => 0개 이상의 문자
		 * ^  => 시작
		 * $  => 끝
		 * 
		 * ===> 위와 같은 자체 문자를 사용할 때는 반드시 앞에 \\을 붙여줘야한다.
		 */
		for(String n:names)
		{
			System.out.print(n+" ");
		}
		
		
		
		
		
	}

}
