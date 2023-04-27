package questao02;

public class Questao02 {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Fischer", "Ferreira", 7254.40);
		
		Empregado e2 = new Empregado("Joao", "Java", 1320);
		
		System.out.printf("e1 -> %.02f Reais por mes // e2 -> %.02f Reais por mes\n\n", e1.CalculateAnnualSalary(), e2.CalculateAnnualSalary());
		
		e1.setMonthlyWage(e1.getMonthlyWage()*1.1);
		
		e2.setMonthlyWage(e2.getMonthlyWage()*1.1);
		
		System.out.println("Apos aumento de 10%:");
		System.out.printf("e1 -> %.02f Reais por mes // e2 -> %.02f Reais por mes\n\n", e1.CalculateAnnualSalary(), e2.CalculateAnnualSalary());
		

	}

}
