package questao08;

public class Questao08 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(0, "Xze", 1953);
		
		ContaEspecial ce = new ContaEspecial(1, "Xze", 5000, 1850);
		
		cc.moneyDeposit(10000, 1953);
		
		cc.moneyWithdraw(500, 1954);
		cc.moneyWithdraw(500, 1953);
		
		ce.moneyWithdraw(6000, 1850);
	}
}
