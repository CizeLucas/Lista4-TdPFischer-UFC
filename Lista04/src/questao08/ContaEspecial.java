package questao08;

public class ContaEspecial extends ContaCorrente {
	
	public double withdrawLimit;

	public ContaEspecial(int id, String nameOfAccountOwner, double withdrawLimit, int password) {
		super(id, nameOfAccountOwner, password);
		this.withdrawLimit = withdrawLimit;
	}
	
	public void moneyWithdraw(double amount, int password) {
		if(this.checkPassword(password)) {
			if(amount<=withdrawLimit) {
				System.out.printf("Saque de %.2f R$ realizado com sucesso!", amount);
				this.setBalance(this.getBalance(password)-amount, password);
				//balance -= amount;
			} else {
				System.out.printf("Dinheiro insuficiente para o saque.");
			}
		} else {
			System.out.println("Senha incorreta!");
		}
	}

	

	
	
	
	
}
