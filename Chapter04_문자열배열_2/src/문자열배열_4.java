
public class 문자열배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] lotto = {
				 15,16,17,25,30,31,7,12,23,32,34,36
				 ,10,16,19,32,33,38
				 ,11,13,20,21,32,44
				 ,16,20,26,36,42,44
				 ,3,13,30,33,43,45
				 ,3,7,11,20,22,41
				 ,10,12,13,19,33,40
				 ,7,19,26,37,39,44
				 ,6,14,30,31,40,41
				 ,1,3,4,29,42,45
				 ,6,16,34,37,39,40
				 ,1,7,21,30,35,38
				 ,10,12,29,31,40,44
				 ,13,14,22,26,37,38
				 ,6,7,13,28,36,42
				 ,17,26,29,30,31,43
				 ,3,20,28,38,40,43
				 ,12,16,21,24,41,43
				 ,14,33,34,35,37,40
				 ,1,12,16,19,23,43
				 ,8,14,28,29,34,40
				 ,6,7,15,22,26,40
				 ,10,17,22,30,35,43
				 ,7,18,19,26,33,45
				 ,6,20,23,24,28,30
				 ,12,19,21,29,40,45
				 ,4,18,31,37,42,43
				 ,11,21,22,30,39,44
				 ,13,14,18,21,34,44
				 ,11,16,25,27,35,36
				 ,4,7,17,18,38,44
				 ,8,12,13,29,33,42
				 ,3,7,14,15,22,38
				 ,21,26,27,32,34,42
				 ,1,9,16,23,24,38
				 ,13,16,23,31,36,44
				 ,4,8,18,24,37,45
				 ,6,10,11,14,36,38
				 ,4,8,17,30,40,43
				 ,3,7,9,33,36,37
				 ,1,23,24,35,44,45
				 ,1,6,20,27,28,41
				 ,6,18,28,30,32,38
				 ,16,18,20,23,32,43
				 ,1,2,11,21,30,35
				 ,3,6,14,22,30,41
				 ,1,10,18,22,28,31
				 ,4,7,19,26,33,35
				 ,7,10,19,23,28,33
				 ,6,11,16,19,21,32
				 ,3,18,19,23,32,45
				 ,3,6,9,18,22,35
				 ,3,6,22,23,24,38
				 ,20,31,32,40,41,45
				 ,4,24,27,35,37,45
				 ,3,10,24,33,38,45
				 ,7,10,22,25,34,40
				 ,11,23,25,30,32,40
				 ,8,13,19,27,40,45
				 ,13,20,24,32,36,45
				 ,4,7,12,14,22,33
				 ,14,19,27,28,30,45
				 ,22,26,29,30,34,45
				 ,5,17,26,27,35,38
				 ,21,26,30,32,33,35
				 ,6,12,31,35,38,43
				 ,3,5,13,20,21,37
				 ,6,12,17,21,32,39
				 ,2,20,33,40,42,44
				 ,7,16,25,29,35,36
				 ,6,14,15,19,21,41
				 ,12,17,20,26,28,36
				 ,3,5,12,22,26,31
				 ,5,14,15,23,34,43
				 ,6,7,9,11,17,18
				 ,8,16,26,29,31,36
				 ,2,3,6,19,36,39
				 ,7,16,24,27,37,44
				 ,2,14,15,22,27,33
				 ,2,5,22,32,34,45
				 ,9,14,34,35,41,42
				 ,26,31,32,33,38,40
				 ,3,11,15,20,35,44
				 ,1,6,12,19,36,42
				 ,6,7,22,32,35,36
				 ,2,5,11,17,24,29
				 ,12,30,32,37,39,41
				 ,5,7,12,13,18,35
				 ,14,16,27,35,39,45
				 ,5,12,13,31,32,41
				 ,8,9,20,25,29,33
				 ,9,18,20,22,38,44
				 ,10,14,16,18,29,35
				 ,5,6,11,29,42,45
				 ,12,15,17,24,29,45
				 ,12,27,29,38,41,45
				 ,1,4,13,17,34,39
				 ,3,19,21,25,37,45
				 ,12,18,22,23,30,34
				 ,15,26,28,34,41,42
				 ,14,23,31,33,37,40
				 ,3,11,14,18,26,27
				 ,21,22,26,34,36,41
				 ,5,11,18,20,35,45
				 ,1,9,12,26,35,38
				 ,9,12,15,25,34,36
				 ,15,23,29,34,40,44
				 ,9,11,30,31,41,44
				 ,8,11,16,19,21,25
				 ,8,11,15,16,17,37
				 ,8,13,18,24,27,29
				 ,7,15,30,37,39,44
				 ,1,4,29,39,43,45
				 ,17,25,33,35,38,45
				 ,6,10,12,14,20,42
				 ,2,8,19,22,32,42
				 ,1,3,9,14,18,28
				 ,13,17,18,20,42,45
				 ,4,7,14,16,24,44
				 ,6,11,15,24,32,39
				 ,1,4,13,29,38,39
				 ,1,3,8,24,27,35
				 ,6,14,16,18,24,42
				 ,12,20,26,33,44,45
				 ,13,18,25,31,33,44
				 ,2,4,25,26,36,37
				 ,17,18,21,27,29,33
				 ,2,13,20,30,31,41
				 ,2,4,15,23,29,38
				 ,7,10,16,28,41,42
				 ,17,21,23,30,34,44
				 ,3,10,23,35,36,37
				 ,13,23,26,31,35,43
				 ,5,7,13,20,21,44
				 ,27,36,37,41,43,45
				 ,3,13,16,23,24,35
				 ,7,11,16,21,27,33
				 ,1,7,15,32,34,42
				 ,2,9,10,14,22,44
				 ,4,12,14,25,35,37
				 ,7,8,9,17,22,24
				 ,1,2,11,16,39,44
				 ,22,26,31,37,41,42
				 ,3,6,17,23,37,39
				 ,2,6,17,18,21,26
				 ,9,11,16,21,28,36
				 ,3,9,10,29,40,45
				 ,2,5,12,14,24,39
				 ,1,6,13,37,38,40
				 ,1,21,25,29,34,37
				 ,2,13,25,28,29,36
				 ,6,21,36,38,39,43
				 ,6,12,19,23,34,42
				 ,1,18,28,31,34,43
				 ,11,20,29,31,33,42
				 ,2,18,24,30,32,45
				 ,1,14,15,24,40,41
				 ,2,9,10,16,35,37
				 ,4,15,24,35,36,40
				 ,10,11,20,21,25,41
				 ,4,9,23,26,29,33
				 ,1,9,26,28,30,41
				 ,7,9,22,27,37,42
				 ,4,12,22,24,33,41
				 ,2,12,30,31,39,43
				 ,3,4,15,22,28,40
				 ,14,21,35,36,40,44
				 ,13,18,30,31,38,41
				 ,3,8,17,20,27,35
				 ,9,18,19,30,34,40
				 ,9,10,15,30,33,37
				 ,2,13,16,19,32,33
				 ,1,8,13,36,44,45
				 ,10,12,18,35,42,43
				 ,12,14,25,27,39,40
				 ,3,15,20,22,24,41
				 ,4,11,28,39,42,45
				 ,4,8,10,16,31,36
				 ,2,10,13,22,29,40
				 ,7,11,13,17,18,29
				 ,4,10,20,32,38,44
				 ,1,3,30,33,36,39
				 ,23,27,29,31,36,45
				 ,1,6,15,36,37,38
				 ,14,15,23,25,35,43
				 ,8,21,25,38,39,44
				 ,7,9,12,15,19,23
				 ,3,4,10,20,28,44
				 ,4,15,22,38,41,43
				 ,10,16,18,20,25,31
				 ,13,24,32,34,39,42
				 ,3,11,34,42,43,44
				 ,3,17,18,23,36,41
				 ,2,6,13,17,27,43
				 ,5,7,12,22,28,41
				 ,2,3,26,33,34,43
				 ,9,14,17,18,42,44
				 ,7,11,12,31,33,38
				 ,1,3,23,24,27,43
				 ,6,21,22,32,35,36
				 ,2,6,11,13,22,37
				 ,16,19,24,33,42,44
				 ,6,14,16,21,27,37
				 ,5,8,18,21,22,38
				 ,4,5,12,14,32,42
				 ,1,11,17,27,35,39
				 ,7,24,29,30,34,35
				 ,3,16,21,22,23,44
				 ,21,27,29,38,40,44
				 ,2,5,14,28,31,32
				 ,3,4,16,27,38,40
				 ,2,6,8,26,43,45
				 ,2,15,16,21,22,28
				 ,7,19,23,24,36,39
				 ,5,18,20,23,30,34
				 ,7,13,16,18,35,38
				 ,8,19,20,21,33,39
				 ,18,21,28,35,37,42
				 ,6,7,12,22,26,36
				 ,5,12,25,26,38,45
				 ,16,26,31,38,39,41
				 ,19,32,37,40,41,43
				 ,1,15,17,23,25,41
				 ,4,9,17,18,26,42
				 ,9,13,28,31,39,41
				 ,1,4,14,18,29,37
				 ,3,13,29,38,39,42
				 ,3,7,12,31,34,38
				 ,8,14,17,27,36,45
				 ,19,23,28,37,42,45
				 ,1,3,24,27,39,45
				 ,4,14,23,28,37,45
				 ,9,18,32,33,37,44
				 ,18,34,39,43,44,45
				 ,4,18,20,26,27,32
				 ,7,17,19,23,24,45
				 ,1,4,10,14,15,35
				 ,2,6,11,16,25,31
				 ,5,17,18,22,23,43
				 ,5,16,21,26,34,42
				 ,19,22,30,34,39,44
				 ,1,15,19,23,28,42
				 ,3,5,12,13,33,39
				 ,2,4,30,32,33,43
				 ,2,6,12,26,30,34
				 ,21,25,30,32,40,42
				 ,2,6,20,27,37,39
				 ,12,17,28,41,43,44
				 ,14,17,19,22,24,40
				 ,9,15,29,34,37,39
				 ,3,15,22,32,33,45
				 ,3,7,10,13,25,36
				 ,16,21,28,35,39,43
				 ,10,34,38,40,42,43
				 ,11,17,19,21,22,25
				 ,4,8,18,25,27,32
				 ,8,22,35,38,39,41
				 ,9,13,32,38,39,43
				 ,6,10,16,28,34,38
				 ,10,24,40,41,43,44
				 ,8,15,17,19,43,44
				 ,20,25,31,32,36,43
				 ,2,8,23,26,27,44
				 ,11,17,28,30,33,35
				 ,14,18,22,26,31,44
				 ,16,20,24,28,36,39
				 ,5,13,17,29,34,39
				 ,1,2,16,22,38,39
				 ,12,16,26,28,30,42
				 ,5,18,30,41,43,45
				 ,1,16,29,33,40,45
				 ,7,8,13,15,33,45
				 ,19,21,30,33,34,42
				 ,14,26,32,36,39,42
				 ,5,11,14,30,33,38
				 ,2,4,11,28,29,43
				 ,3,9,11,12,13,19
				 ,9,14,17,33,36,38
				 ,2,25,28,30,33,45
				 ,1,9,11,14,26,28
				 ,9,10,13,28,38,45
				 ,6,8,18,35,42,43
				 ,12,18,30,39,41,42
				 ,13,14,19,26,40,43
				 ,3,10,16,19,31,39
				 ,5,6,16,18,37,38
				 ,4,5,31,35,43,45
				 ,4,7,13,29,31,39
				 ,5,11,12,29,33,44
				 ,13,16,24,25,33,36
				 ,8,15,21,31,33,38
				 ,7,9,24,29,34,38
				 ,12,18,24,26,39,40
				 ,9,18,20,24,27,36
				 ,1,12,13,24,29,44
				 ,10,21,22,30,35,42
				 ,16,25,33,38,40,45
				 ,14,15,25,28,29,30
				 ,3,9,12,13,25,43
				 ,12,18,19,29,31,39
				 ,17,21,25,26,27,36
				 ,2,21,28,38,42,45
				 ,11,30,34,35,42,44
				 ,1,3,12,14,16,43
				 ,8,11,19,21,36,45
				 ,5,10,13,21,39,43
				 ,6,11,15,17,23,40
				 ,15,21,31,32,41,43
				 ,6,10,18,25,34,35
				 ,14,20,23,31,37,38
				 ,3,12,13,18,31,32
				 ,1,10,13,26,32,36
				 ,5,9,14,26,30,43
				 ,10,11,12,18,24,42
				 ,17,25,28,37,43,44
				 ,1,4,10,12,28,45
		 	};
		 int[] result=new int[46]; 
		 // 배열에 0~45까지 넣어야 인덱스번호랑 실제 번호랑 일치함. 그래서 배열의 크기는 46.
		 // 그래야 빈도수 비교 쉽게 가능함.
		 for(int i=0; i<lotto.length;i++)
		 {
			 result[lotto[i]]++;
		 }
		 for(int i=1; i<result.length;i++) //1~45 의 빈도수를 알고싶은 거니까 i=1부터 시작
		 { 		
			 
			 System.out.println(i+":"+result[i]);
		 }
		
	}

}
