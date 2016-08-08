package chap18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		String inputFile = args[0];
		String outputFile = args[1];
		FileCopy job1 = new FileCopy();
		// 시작시간
		long start = System.currentTimeMillis();
		
		// Thread 생성
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				// job1.nodeStream(inputFile, outputFile); 
				job1.processingStream(inputFile, outputFile);
			}
		});
		thread.start();
		
		// 스레드 종료될때까지 일시정지 상태됨.  join() 사용안하면 사용자정의 스레드 끝날때까지 메인스레드가 기다려주지않는다.
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// job1.nodeStream(inputFile, outputFile); // 120ms
		// job1.processingStream(inputFile, outputFile); // 12ms 1000ms 1초
		// 종료시간
		long end = System.currentTimeMillis();
		System.out.println("File Copy하는데 걸린시간" + (end - start) + "ms");

		
	}

	public void nodeStream(String inFile, String outFile) {
		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(inFile);
			output = new FileOutputStream(outFile);
			int data;
			// -1이면 eof end of file이다. 파일내용의 끝을 리턴해주는 숫자
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			output.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {

		} finally{
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void processingStream(String inFile, String outFile) {
		BufferedInputStream input = null;
		BufferedOutputStream output = null;
		try {
			// 기존에 노드스트림 생성했는데 바로 넣어준다.
			input = new BufferedInputStream(new FileInputStream(inFile));
			output = new BufferedOutputStream(new FileOutputStream(outFile));
			int data;
			// -1이면 eof end of file이다. 파일내용의 끝을 리턴해주는 숫자
			while ((data = input.read()) != -1) {
				output.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ie) {

		} finally{
			try {
				input.close();
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
