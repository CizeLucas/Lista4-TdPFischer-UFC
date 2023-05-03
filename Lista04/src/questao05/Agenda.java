package questao05;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Contato> contactList;
	
	public Agenda() {
		contactList = new ArrayList<Contato>();
	}
	
	public void addContact(Contato contact){
		contactList.add(contact);
	}
	
	public void printContactsInformations() {
		for (Contato contato : contactList) {
			System.out.println(contato.printContact());
		}
		
	}
	
	
}
