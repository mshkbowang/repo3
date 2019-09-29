package test_duoxiancheng;

public class XianCheng1 {
	public static void main(String[] args) {
		SomeThread someThread=new SomeThread();
		someThread.start();
	}
}
class SomeThread extends Thread{
	public void run() {
		System.out.println("hello thread");
	}
}
