import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
        // sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível
        // para saque".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digíte o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        scanner.nextLine();
        System.out.print("Por favor, digite o numero da agência: ");
        String agencia = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        scanner.nextLine();
        System.out.print("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}