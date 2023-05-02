package questao05;

public class Contato {

	//	A, B, C, D, E, G, 
	
	int id;
	String name;
	private String email;
	String phoneNumber;
	String adress;
	String observationNotes;
	
	public Contato(int id, String name, String email, String phoneNumber, String adress, String observationNotes) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.observationNotes = observationNotes;
	}

	public Contato(int id) {
		if(id>=1000 && id<=9999) {
			this.id = id;
		} else {
			System.out.println("Contato nao cadastrado! Revise o campo ID para esse contato.");
		}
		
	}
	
	public Contato(int id, String name) {
		if((id>=1000 && id<=9999)) {
			this.id = id;
			this.name = name;
		} else {
			System.out.println("Contato nao cadastrado! Revise o campo ID para esse contato.");
		}
	}

	public Contato(int id, String name, String email) {
		if((id>=1000 && id<=9999)) {
			this.id = id;
			this.name = name;
			this.email = email;
		} else {
			System.out.println("Contato nao cadastrado! Revise o campo ID para esse contato.");
		}
		
	}
	
	public Contato(String phoneNumber) {
		if(phoneNumber.length()==8) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Numero de telefone nao cadastrado! O numero deve ter estritamente 8 digitos");
		}
		
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public boolean checkContact() {
		if(id!=0 && !(name==null) && !(email==null) && !(adress==null) && !(phoneNumber==null) && !(observationNotes==null)) {
			return true;	
		} else {
			return false;	
		}
	}
	
	public Contato duplicateContact() {
		return new Contato(this.id, this.name, this.email, this.phoneNumber, this.adress, this.observationNotes);
	}
	
	public String printContact() {
		return String.format("Codigo ID: "+ id +"\nNome: "+ name +"\nEndereco: "+ adress +"\ne-mail: "+ email +"\ntelefone: "+phoneNumber+"\nObservacoes: "+ observationNotes+"\n");
	}
	
	
}
