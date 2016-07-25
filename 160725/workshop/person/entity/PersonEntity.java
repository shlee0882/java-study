package workshop.person.entity;

public class PersonEntity {
   private String name;
   private char gender;
   private String ssn;
   private String address;
   private String phone;
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public char getGender() {
      return gender;
   }
   public void setGender(char gender) {
      this.gender = gender;
   }
   public String getSsn() {
      return ssn;
   }
   public void setSsn(String ssn) {
      this.ssn = ssn;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   
   public PersonEntity(String name,String ssn,String address,String phone) {
      // TODO Auto-generated constructor stub
      setName(name);
      setSsn(ssn);
      setAddress(address);
      setPhone(phone);
      if((int)getSsn().charAt(6)%2==0){
         setGender('¿©');
      }else{
         setGender('³²');
      }
   }
   public PersonEntity(){
      
   }
}
   