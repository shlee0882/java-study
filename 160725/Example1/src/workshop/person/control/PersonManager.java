package workshop.person.control;
import workshop.person.entity.PersonEntity;

public class PersonManager {
	public static void main(String[] args) {
		PersonManager pManager = new PersonManager();
		PersonManager.printTitle("@@@ 인물 정보 조회 시스템 @@@ ");
		PersonManager.printTitleLine("====================");
		PersonEntity[ ] persons = new PersonEntity[10];
		PersonManager.fillPersons(persons);
		PersonManager.showPerson(persons);
		PersonManager.findByGender(persons, '여');
		PersonManager.printTitleLine("====================");
		PersonManager.showPerson(persons, "김하늘");
	}

	private static void showPerson(PersonEntity[] persons, String string) {
		// TODO Auto-generated method stub
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getName()=="김하늘") {
				System.out.println("이름\t"+persons[i].getName()+"\n성별\t"+persons[i].getGender()+"\n번호\t"+persons[i].getPhone()+"\n주소\t"+persons[i].getAddress());
			}
		}
	}

	private static int findByGender(PersonEntity[] persons, char c) {
		int count = 0;
		for (int i = 0; i < persons.length; i++) {
			if(persons[i].getGender()=='여'){
				count++;
			}
		}
		System.out.println("성별 : '여 '(은)는 "+count+"명 입니다.");
		return count;
		// TODO Auto-generated method stub
	}

	private static void showPerson(PersonEntity[] persons) {
		// TODO Auto-generated method stub
		for (int i = 0; i < persons.length; i++) {
			System.out.println("이름"+"\t"+persons[i].getName()+"\t"+"성별"+"\t"+persons[i].getGender()+"\t"+"전화번호"+"\t"+persons[i].getPhone());
			System.out.println("----------------------------------------------------");
		}
	}

	private static void fillPersons(PersonEntity[] persons) {
		// TODO Auto-generated method stub
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932"); 
		persons[1] = new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932"); 
		persons[2] = new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542"); 
		persons[3] = new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223"); 
		persons[4] = new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333"); 
		persons[5] = new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934"); 
		persons[6] = new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932"); 
		persons[7] = new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939"); 
		persons[8] = new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202"); 
		persons[9] = new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832");
	}         

	private static void printTitleLine(String string) {
		// TODO Auto-generated method stub
		System.out.println("\n"+string+"\n");
	}

	private static void printTitle(String string) {
		// TODO Auto-generated method stub
		System.out.println("\n"+string+"\n");
	}
}
