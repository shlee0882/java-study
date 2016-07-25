package chap05;

public class Customer {
	String name;

	public Customer(){
		
	}
	
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		
		if(obj instanceof Customer){
		// obj를 Customer 타입으로 형변환해준다.
			Customer cust = (Customer)obj;
			isSame = this.name.equals(cust.name);
		}
		return isSame;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + "]";
	}
	
}
