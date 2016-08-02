package jdbc.vo;

public class UserVO {
	String userid;
	String name;
	int age;
	String birth;
	
	public UserVO(){
		
	}
// 생성자 호출하므로 setter 필요없음.
	public UserVO(String userid, String name, int age, String birth) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
		this.birth = birth;
	}

	public String getUserid() {
		return userid;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBirth() {
		return birth;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserVO other = (UserVO) obj;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}
	
	// 주소 해시코드 나오므로 toString메서드 구현해줘야함.
	@Override
	public String toString() {
		return "UserVO [userid=" + userid + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}
/*	
	@Override
	public int hashCode(){
		return userid.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		boolean isEqual = false;
		if(obj instanceof UserVO){
			UserVO user = (UserVO)obj;
			isEqual = this.userid.equals(user.userid); // this는 이 클래스안에 사용되는 userid
		}
		return isEqual;
	}*/
	

}
