package mybatis;

public class Customer {
	
	public int id;
	public String name;
	public int age;
	public String des;


	public Customer() {
	}


	public Customer(int id, String name, int age, String des) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.des = des;
	}
	
	public Customer(String name, int age, String des) {
		this.name = name;
		this.age = age;
		this.des = des;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age
				+ ", des=" + des + "]";
	}
	
}