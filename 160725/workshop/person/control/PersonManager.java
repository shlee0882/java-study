package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   PersonManager pManger=new PersonManager();
      pManger.printTitle("@@@ 인물 정보 조회 시스템 @@@");
      pManger.printTitleLine();
      PersonEntity[ ] persons = new PersonEntity[10];
      pManger.fillPersons(persons);
      pManger.showPerson(persons);
      pManger.findByGender(persons, '여');
      pManger.showPerson(persons, "유성미");
      pManger.printTitleLine();
   }
   public void printTitle(String Title){
      System.out.println("\t"+Title+"\t");
   }
   public void fillPersons(PersonEntity[] persons){
      persons[0]=new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
      persons[1]=new PersonEntity("김하늘","7302132363217", "서울 강동구", "02-362-1932");
      persons[2]=new PersonEntity("박영수","7503111233201", "서울 성북구", "02-887-1542");
      persons[3]=new PersonEntity("나인수","7312041038988", "대전 유성구", "032-384-2223");
      persons[4]=new PersonEntity("홍정수","7606221021341", "서울 양천구", "02-158-7333");
      persons[5]=new PersonEntity("이미숙","7502142021321", "서울 강서구", "02-323-1934");
      persons[6]=new PersonEntity("박성구","7402061023101", "서울 종로구", "02-308-0932");
      persons[7]=new PersonEntity("유성미","7103282025101", "서울 은평구", "02-452-0939");
      persons[8]=new PersonEntity("황재현","7806231031101", "인천 중구", "032-327-2202");
      persons[9]=new PersonEntity("최철수","7601211025101", "인천 계양구", "032-122-7832");
   }
   public void showPerson(PersonEntity[] persons){
      for (PersonEntity temp : persons) {
         System.out.println("[이름]"+temp.getName()+"\t[성별]"+temp.getGender()+"\t[전화번호]"+temp.getPhone());
         printItemLine();
      }
   }
   public int findByGender(PersonEntity[] persons,char gender){
      int count=0;
      for (PersonEntity temp : persons) {
         if(temp.getGender()==gender){
            count++;
         }
      }
      System.out.println("성별 : '"+gender+"' (은)는 "+count+"명입니다.");
	return count;
   }
   public void showPerson(PersonEntity[] persons,String name){
      for (PersonEntity temp : persons) {
         if(temp.getName()==name){
            System.out.println("[이름]"+temp.getName()+"\n[성별]"+temp.getGender()+"\n[전화번호]"+temp.getPhone()+"\n[주소]"+temp.getAddress());
            break;
         }
         
         
      }
   }
   public void printTitleLine(){
      for (int i = 0; i <60; i++) {
         System.out.print("=");
      }
      System.out.println();
   }
   public void printItemLine(){
      for (int i = 0; i <60; i++) {
         System.out.print("-");
      }
      System.out.println();
   }
}