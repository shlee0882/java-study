package chap12.sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExampleAnonymousNested {
	public static void main(String[] args) {
		System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
		
		//thread 생성
		Thread worker = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});
		worker.start();
		

		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}// main
	
/*	// static inner class
	static class MyThread extends Thread{
		@Override
		public void run(){
			System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		}
	}// MyThread 쓰레드 첫번째 방법
	
	// Instance Inner class
	class MyThreadJob implements Runnable{
		@Override
		public void run() {
			System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		}
	} //MyThreadJob 쓰레드 두번째 방법
*/	
} // BeepPrintExample1이 닫힘.

// inner class 형태로 해보자. main안에 넣음. nestedclass 형태로 만드니깐 동등한 클래스 선언가능. 



