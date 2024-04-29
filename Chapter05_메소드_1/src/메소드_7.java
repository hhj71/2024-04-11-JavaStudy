// char 리턴 ==>알파벳을 전송 ==>대문자를 소문자로 / 소문자를 대문자로
public class 메소드_7 {
  static char upper(char c)
  {
	  return (char)(c-32); // 'a' => 'A' 
                         //    97     65   => 32
  }
  static char lower(char c)
  {
	  return (char)(c+32);
  }
  
  static char upperLower(char c)
  {
  	char res=' ';// 결과값이 여러개인 경우 => 변수 => 경우 수 
  	if(c>='A' && c<='Z')
  		res=(char)(c+32);
  	else 
  		res=(char)(c-32);
  	return res;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*char c=upper('m');
        System.out.println(c);
        c=lower('M');
        System.out.println(c);*/
			char c=upperLower('A');
			System.out.println(c);
			c=upperLower('a');
			System.out.println(c);
			
	   /* 암기!! 메소드명이 뭔지 어떤 기능을 하는지 
	           매개변수를 어떤걸 사용해야하는지 
	           리턴형을 어떤걸 사용해야하는지 
	           70% 암기, 30% 조립
	    */
	}

}
