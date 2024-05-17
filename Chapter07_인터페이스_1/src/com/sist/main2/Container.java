package com.sist.main2;
import java.util.*;
public class Container {
	// => 상속을 받으면 모든 데이터형이 상위클래스의 데이터 타입을 가지고 있다
	/*
	 * 
	 * 관련
	 * => 웹 : 요청받아서 => 처리후에 => 결과값을 브라우저로 전송
	 * => 인터페이스로 모아서 한번에 처리
	 * 
	 */
	Model[] models = {new BoardModel(), 
					  new FoodModel(),
					  new RecipeModel(),
					  new SeoulModel(),
					  new NoticeModel()};
	
	public Model getModel(int no)
	{
		return models[no-1];
	}
}
