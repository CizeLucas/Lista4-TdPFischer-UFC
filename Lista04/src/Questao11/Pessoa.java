package Questao11;

public class Pessoa {

	private String name;
	private String identityNumber;
	private int age;
	
	public Pessoa(String name, String identityNumber, int age) {
		this.name = name;
		this.identityNumber = identityNumber;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}
	
}
