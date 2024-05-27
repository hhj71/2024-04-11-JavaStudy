package com.sist.map;
import java.util.*;
public class Container {
	private Map<String, Model> map = new HashMap<String, Model>();
	public Container()
	{
		map.put("board", new BoardModel());
		map.put("join", new JoinModel());
		map.put("board", new FoodModel());
		map.put("board", new BoardModel());
		map.put("board", new BoardModel());
		
	}
}
