package com.custom.classes;

public class MainSingleton  extends A{

	public static void main(String[] args) {

		
//		MainSingleton m = new MainSingleton();
//		Thread t = new Thread(m);
//		t.start();
//		
//		MainSingleton m1 = new MainSingleton();
//		Thread t1 = new Thread(m1);
//		t1.start();

		A m = new MainSingleton();
		System.out.println(m.first(2, 4));
		System.out.println(m.second(2, 4));
		
	}

	private long second(int x, long y) {
		// TODO Auto-generated method stub
		x = 3;
		return x;
	}

	  public long first(int x, long y) {
		// TODO Auto-generated method stub
		x+=y;
		return x;
	}
}

	class A {
	
	public  long first(int x, long y) {
		// TODO Auto-generated method stu
	return 0;
	}
}

//	public void run() {
//
//		Singleton s = Singleton.getInstance();
//		System.out.println(s.hashCode());
//	}
//
//}
//
//class Singleton{
//	
//	private static Singleton instance;
//	
//	private Singleton(){
//		
//	}
//	
//	public synchronized static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
//	
//}