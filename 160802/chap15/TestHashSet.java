package chap15;

import java.util.HashSet;
import java.util.Set;

import jdbc.vo.UserVO;

public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("hello");
		set.add("hello2");
		set.add("hello");
		set.add("hello");
		
		
		
		for (String string : set) {
			System.out.println(string); // String은 중복 제거됨.
		}
		
		Set<UserVO> users = new HashSet<>();
		users.add(new UserVO("dooly", "둘리", 20, "2000-01-01"));
		users.add(new UserVO("gildong", "길동", 30, "1990-01-01"));
		users.add(new UserVO("dooly", "둘리", 20, "2000-01-01"));
		
		for (UserVO userVO : users) {
			System.out.println(userVO); // 중복 제거가 안됨.
			System.out.println(userVO.hashCode());
		}
		
		// 중복 제거 되려면 UserVO 클래스 안에다 equals 메소드
		
		
	}
}
