package Questao13;

public class Questao13 {

	public static void main(String[] args) {
		
		ControleRemoto cr = new ControleRemoto(new TV());
		
		cr.turnOff(); //(A)
		
		cr.turnOn(); //(A)
		
		cr.status(); //(D)
		
		cr.volumeUp(); //(B)
		cr.volumeUp(); //(B)
		
		cr.volumeDown(); //(B)
		
		cr.status(); //(D)
		
		cr.mute(); //(F)
		
		cr.goToChannel(20); //(E)
		
		cr.mute(); //(F)
		
		cr.channelDown(); //(C)
		
		cr.channelUp(); //(C)
		
		
	}

}
