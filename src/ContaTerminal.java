import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o seu nome completo:");
		
	     nomeCliente = sc.nextLine();
		 
	     
	     System.out.println("Por favor, digite o número da Agência!"); 
		
		 numeroConta= sc.nextInt(); 
	     
		 System.out.println("Por favor, digite a Agência!"); 
		 
		 agencia = sc.next();
		 
		 System.out.println("Por favor, digite o saldo!"); 
		 
		 saldo =  sc.nextDouble();
		 
		 
		 System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque",nomeCliente,agencia,numeroConta,saldo); 
		 
	     
		sc.close();
	}

}
