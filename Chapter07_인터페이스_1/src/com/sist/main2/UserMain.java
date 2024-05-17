package com.sist.main2;
import java.util.*;
/*
 * 	관련된 클래스를 모아서 => 한번에 관리
 * 	-----------------
 * 	 모든 클래스가 인터페이스 상속이 있어야 관련된 클래스다
 */
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("게시판(1), 맛집(2), 레시피(3),여행(4),공지사항(5):");
		int menu = scan.nextInt();
		Container c = new Container();
		Model model = c.getModel(menu);
		model.execute();
		
		
	}

}
