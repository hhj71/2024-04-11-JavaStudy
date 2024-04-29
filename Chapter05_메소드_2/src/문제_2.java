// 1~10까지 합을 구하는 메소드를 구현하시오
// 리턴형 o , 매개변수 x (1~10 이라는 숫자가 지정되어 있기 때문에)
public class 문제_2 {
static int add()
{	int sum=0;
	for(int i=1; i<=10; i++)
	{
		sum+=i;
	}
	return sum; // 리턴값 = 리턴형에 사용되는 데이터형이 동일
	// 특별한 경우에는 return 값이 리턴형보다 작거나 같을 수 있다.
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=add();
        //리턴형이 있는 경우는 결과값을 받아야 한다. 
		System.out.println("sum:"+sum); 
	}
           
}
