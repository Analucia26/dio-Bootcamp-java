import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        System.out.println("CONTA BANCO\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numeroConta+ " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
