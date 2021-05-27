
public class Conta {
	
	public Conta(double saldoInicial){
		if (saldoInicial < 0) {
			System.out.println("Saldo inicial invalida pois e menor que 0");
			saldo=0;
		} else {
			saldo=saldoInicial;
		}
	}
	
	public void Credito(double valor) {
		saldo+=valor;
	}
	
	public void Debito (double valor) {
		
		if (valor>saldo) {
			System.out.println("Saldo menor que o valor solicitado");
		} else {
			saldo-=valor;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	private double saldo;
	
}
