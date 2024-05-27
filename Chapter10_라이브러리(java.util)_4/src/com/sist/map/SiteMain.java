package com.sist.map;
import java.util.*;
public class SiteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1. 로그인 2. 회원가입 3.공지사항 4. 게시판, 5.맛집:");
		int menu = scan.nextInt();
		
		if (menu==1)
		{
			LoginModel model = new LoginModel();
			model.execute();
		}
	}

}
