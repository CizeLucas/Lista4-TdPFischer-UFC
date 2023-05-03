package questao05;

public class Cliente {

	public int id;
	public String name;
	public Agenda agenda;
	
	public Cliente(Agenda agenda) {
		this.agenda = agenda;	
	}
	
	public void printAgendaContacts() {
		agenda.printContactsInformations();
	}
	
	public void addContact(Contato contact) {
		agenda.addContact(contact);
	}
	
	
}
