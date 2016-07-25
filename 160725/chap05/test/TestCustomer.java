package chap05.test;

import chap05.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer();
		cust1.setName("홍길동");
		
		Customer cust2 = new Customer("홍길동");
		
		System.out.println(cust1.equals(cust2));
		// object 에 equal(SC)주소 비교
		// cust1은 reference 타입 초기값은 null로 초기화 되어있음. 주소값을 할당해라 cust1에
		// heap에 Customer라는 객체 생성, name null
		
	}
	
}
