package chap05.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import chap05.Customer;

public class TestCustomerJunit {
	// 테스트 메서드로 실행되려면 @test를 반드시 메서드 선언부 위에다 선언해줘야함.
	@Test @Ignore
	// @Ignore는 실행하지 않겠다.
	public void custEquals(){
		Customer cust1 = new Customer("둘리");
		Customer cust2 = new Customer("둘리");
		
		System.out.println(cust1 == cust2); // 주소 비교
		System.out.println(cust1.equals(cust2)); // 값 비교
		

		assertNotSame(cust1, cust2);
//		assertSame(cust1, cust2); // 레퍼런스가 false가 나와서  테스트 실패
//		// 기존에 콘솔에 값 안찍고 jUnit은 값검증해준다.
//		
		assertEquals(cust1, cust2);
	}
	
	@Test
	public void strEquals(){
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		assertEquals(str1, str2);
		
		assertNotNull(str1);
		assertNotSame(str1, str2);
	}
}
