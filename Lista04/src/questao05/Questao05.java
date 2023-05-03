package questao05;

public class Questao05 {

	public static void main(String[] args) {
		
		Contato ctt1 = new Contato(1005, "Notch Lima", "gamestop@gmail.com");
		System.out.println(ctt1.checkContact());
		System.out.println(ctt1.printContact());
		System.out.println("\n");
		
		
		Contato ctt2 = new Contato(1010, "Junin", "juningames@java.com", "96669777", "Rua: ****quepareo / Num.: 945", "junin eh doido maluco");
		System.out.println(ctt2.checkContact());
		System.out.println(ctt2.printContact());
		System.out.println("\n");
		
		Contato ctt3 = ctt1.duplicateContact();
		System.out.println(ctt3.printContact());
		System.out.println("\n");
		
		Agenda agenda = new Agenda();
		agenda.addContact(ctt1);
		agenda.addContact(ctt2);
		
		Cliente cliente = new Cliente(agenda);
		cliente.printAgendaContacts();
		System.out.println("\n");
	}
	
	

}
