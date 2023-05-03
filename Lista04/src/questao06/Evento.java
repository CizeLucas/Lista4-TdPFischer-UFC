package questao06;

public class Evento {
	
	Ingresso ingresso;
	int qttIngressos;
	int qttSoldIngressos=0;
	IngressoVip ingressoVip;
	int qttIngressosVip;
	int qttSoldIngressosVip=0;
	
	public Evento(Ingresso ingresso, int qttIngressos, IngressoVip ingressoVip, int qttIngressosVip) {
		this.ingresso = ingresso;
		this.qttIngressos = qttIngressos;
		this.ingressoVip = ingressoVip;
		this.qttIngressosVip = qttIngressosVip;
	}
	
	public void sellIngresso(int qtt, boolean isVip) {
		if(isVip) {
			if(qttIngressosVip>=(qttSoldIngressosVip+qtt))
				qttSoldIngressosVip += qtt;
			else
				System.out.println("Nao temos essa quantidade de ingressos VIP no momento... :( ");
		}else {
			if(qttIngressos>=(qttSoldIngressos+qtt))
				qttSoldIngressos += qtt;
			else
				System.out.println("Nao temos essa quantidade de Ingressos no momento... :( ");	
		}
	}
	
	public void seeRemainingIngressos() {
		System.out.printf("Ainda existem %d Ingressos normais e %d Ingressos VIP a venda!!!", qttIngressos-qttSoldIngressos, qttIngressosVip-qttSoldIngressosVip);
	}
	
	public void computeValueOfSoldIngressos() {
		System.out.printf("Vendidos um total de %.2f Reais",(qttSoldIngressos*ingresso.cost + qttSoldIngressosVip*ingressoVip.getTotalCost()));
	}
	
}
