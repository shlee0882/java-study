package example2.book.control;

import example2.book.entity.*;
public class ManageBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication[] books = new Publication[5];
		books[0] = new Magazine( "마이크로소프트", "2007-10-01", 328 , 9900, "매월" );
		books[1] = new Magazine( "경영과 컴퓨터", "2007-10-03", 316, 9000, "매월" );
		books[2] = new Novel( "파피용", "2007-07-01", 396, 9800, "베르나르 베르베르", "프랑스 현대소설" );
		books[3] = new Novel( "남한산성", "2007-04-14", 383, 11000, "김훈", "대하소설" );
		books[4] = new ReferenceBook( "실용주의 프로그래머", "2006-01-20", 496, 25000, "소프트웨어 개발" );
		
		for (Publication publication : books) { // 타입 변수 : 배열
			System.out.println(publication.toString());
		}
		System.out.println(books[2].getTitle()+""+books[2].getPrice());
		modifyPrice(books[2]);
		System.out.println(books[2].getTitle()+""+books[2].getPrice());

	}

	private static void modifyPrice(Publication papa) {
		// TODO Auto-generated method stub
		if(papa instanceof Magazine){
			papa.setPrice((int)(papa.getPrice()*0.6));
		}
		else if(papa instanceof Novel){
			papa.setPrice((int)(papa.getPrice()*0.8));
		}
		else if(papa instanceof ReferenceBook){
			papa.setPrice((int)(papa.getPrice()*0.9));
		}
	}

}
