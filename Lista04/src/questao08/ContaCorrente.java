package questao08;

public class ContaCorrente {

	public int id;
	public String nameOfAccountOwner;
	public double balance;
	public int password;
	
	public ContaCorrente(int id, String nameOfAccountOwner, int password) {
		this.id = id;
		this.nameOfAccountOwner = nameOfAccountOwner;
		this.password = password;
		this.balance=0;
	}
	
	
	
	
	public boolean checkPassword(int password) {
		if(this.password == password) 
			return true;
		 else
			return false;
	}

	
	
	
	
	public double getBalance(int password) {
		if(this.checkPassword(password))
			return balance;
		else 
			return 0; //tem tudo pra dar erro esse return 0; mas enfim...
	}




	public void setBalance(double balance, int password) {
		if(this.checkPassword(password))
			this.balance = balance;
	}




	public void moneyWithdraw(double amount, int password) {
		if(this.checkPassword(password)) {
			if(amount<=balance) {
				System.out.printf("Saque de %.2f R$ realizado com sucesso!", amount);
			} else {
				System.out.printf("Dinheiro insuficiente para o saque.");
			}
		} else {
			System.out.println("Senha incorreta!");
		}
	}
	
	public void moneyDeposit(double amount, int password) {
		if(this.password == password) {
			balance += amount;
		} else {
			System.out.println("Senha errada");
		}
	}
	
}
