import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(600);
		Conta c2 = new Conta(-100);

		
		c1.Credito(400);
		System.out.println("o Saldo do cliente 1 é de " + c1.getSaldo());
		c1.Debito(100);
		System.out.println("o Saldo do cliente 1 é de " + c1.getSaldo());
		
		c2.Credito(100);
		System.out.println("o Saldo do cliente 2 é de " + c2.getSaldo());
		c2.Debito(300);
		System.out.println("o Saldo do cliente 2 é de " + c2.getSaldo());
		
		System.exit(0);

	}

}
