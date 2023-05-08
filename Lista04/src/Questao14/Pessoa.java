package Questao14;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Pessoa {
	
	private String name;
	private int age;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	LocalDate currentDate;
	LocalDate birthDate;
	
	public Pessoa(String name, int birthDay, int birthMonth, int birthYear) {
		this.name = name;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		currentDate = LocalDate.now();
	}
	
	
	public void calculaIdade() {
		currentDate = LocalDate.now();
		birthDate = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay);
	}
	
	public int informaIdade() {
		Period period = Period.between(birthDate, currentDate);
		age = period.getYears();
		return age;
	}
	
	public String informaNome() {
		return name;
	}
	
	public void ajustaDataDeNascimento(int birthDay, int birthMonth, int birthYear) {
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		birthDate = LocalDate.of(birthYear, Month.of(birthMonth), birthDay);
	}
	
	
	
	
	
	
	
}
