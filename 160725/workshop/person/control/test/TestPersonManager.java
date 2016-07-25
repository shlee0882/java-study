package workshop.person.control.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import workshop.person.control.PersonManager;
import workshop.person.entity.PersonEntity;

public class TestPersonManager {
	PersonManager mgr;
	PersonEntity[] persons;
	
	// Before 어노테이션을 붙이면 테스트 메서드 불려지기전에 변수 값 초기화 함.
	@Before
	public void init() {
		System.out.println("init 호출");
		mgr = new PersonManager();
		persons = new PersonEntity[10];
		mgr.fillPersons(persons);
	}

	@Test
	public void fillPerson() {
		System.out.println("fillPerson 호출");
		assertEquals("이성호", persons[0].getName()); // 첫번째 사람
		assertEquals("최철수", persons[9].getName()); // 마지막 사람
	}

	@Test
	public void findByGender() {
		System.out.println("find 호출");
		int count = mgr.findByGender(persons, '남');
		assertThat(count,CoreMatchers.is(7));
	}

}
