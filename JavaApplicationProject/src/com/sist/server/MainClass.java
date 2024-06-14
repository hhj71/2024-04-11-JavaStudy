package com.sist.server;
class MyThread extends Thread
{
	// Thread를 사용시에는 run()에서 어떻게 동작을 구현할 지
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i+":"+getName());
				Thread.sleep(200);
			}
		}catch(Exception ex) {}
	}
}
public class MainClass {
	public static void main(String[] args) {
		MyThread m1 = new MyThread(); // Thread-0
		MyThread m2 = new MyThread();// Thread-1
		MyThread m3 = new MyThread();// Thread-2
		
		m1.start();
		m2.start();
		m3.start();
		
	}
}
