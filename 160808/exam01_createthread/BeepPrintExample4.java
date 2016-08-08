package chap12.sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		
		System.out.println("현재 스레드의 이름"+Thread.currentThread().getName());
		Runnable job = new MyThreadJob2();
		Thread worker2 = new Thread(job);
		worker2.setName("띵띵띵띵띵");
		worker2.start();
		
/*		System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
		//thread 생성 및 시작
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		//Thread worker = new MyThread();
		Runnable job = new MyThreadJob();
		Thread worker = new Thread(job);
		worker.setName("띵띵 스레드");
		worker.start();*/

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
} // BeepPrintExample1이 닫힘.

class MyThread2 extends Thread{
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

class MyThreadJob2 implements Runnable{
	@Override
	public void run() {
		System.out.println("현재 스레드의 이름 "+Thread.currentThread().getName());
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
} // 쓰레드 두번째 방법

