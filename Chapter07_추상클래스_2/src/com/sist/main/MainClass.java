package com.sist.main;
class A
{
	void aaa() {}
	private void bbb() {} // ==> private 는 오버라이딩 불가능 
	protected void ccc() {}
	public void ddd() {}
}
class B extends A
{
	// 변경해서 사용 ==> 오버라이딩
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		super.aaa();
	}

	@Override
	protected void ccc() {
		// TODO Auto-generated method stub
		super.ccc();
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		super.ddd();
	}
	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
