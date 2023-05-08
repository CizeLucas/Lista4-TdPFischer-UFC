package Questao13;

public class ControleRemoto {
		TV tv;
		
		public ControleRemoto(TV tv) {
			this.tv = tv;
		}
		
		public void turnOn() {
			if(!tv.isOn) {
				tv.isOn = true;
				System.out.println("TV ligada!");
			} else {
				System.out.println("TV ja esta ligada");
			}		
		}
		
		public void turnOff() {
			if(tv.isOn) {
				tv.isOn = false;
				System.out.println("TV desligada!");
			} else {
				System.out.println("TV ja esta desligada");
			}	
		}
		
		public void mute() {
			if(tv.isMuted) {
				tv.isMuted = false;
				System.out.println("TV desmutada!");
			} else {
				tv.isMuted = true;
				System.out.println("TV mutada!");
			}
				
		}

		public void channelUp() {
			tv.channel++;
			System.out.printf("Canal da TV setado no %d\n", tv.channel);
		}
		
		public void channelDown() {
			tv.channel--;
			System.out.printf("Canal da TV setado no %d\n", tv.channel);
		}
		
		public void goToChannel(int channel) {
			tv.channel = channel;
			System.out.printf("Canal da TV trocado para o %d\n", channel);
		}

		public void volumeUp() {
			tv.volumeLevel++;
			System.out.println("Volume da TV aumentado em 1 nivel");
		}
		
		public void volumeDown() {
			tv.volumeLevel--;
			System.out.println("Volume da TV reduzido em 1 nivel");
		}
		
		public void status() {
			if(tv.isOn) {
				if(tv.isMuted) {
					System.out.printf("A tv esta no canal %d e esta mutada\n", tv.channel);
				} else {
					System.out.printf("A tv esta no canal %d e esta no volume %d\n", tv.channel, tv.volumeLevel);
				}
			} else {
				System.out.println("A tv esta desligada");
			}
		}

}
