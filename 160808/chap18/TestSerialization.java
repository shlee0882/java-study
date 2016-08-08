package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) {
		// 객체를 파일로 출력해주는 스트림 생성
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
			oos.writeObject(new Student(100, "둘리", "엄마찾기"));
			
			ois = new ObjectInputStream(new FileInputStream("student.ser"));
			Student stu =(Student)ois.readObject();
			System.out.println(stu);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
