import java.util.Scanner;

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número");
    int numero = sc.nextInt();
    System.out.println("Digite a agência");
    String agencia = sc.nextLine();
    System.out.println("Insira seu nome");
    String nomeCliente = sc.nextLine();
    System.out.println("Insira o saldo");
    double saldo = sc.nextDouble();
    System.out.println("Obrigado, " + nomeCliente + "por criar uma conta em nosso banco. Sua agência é:" + agencia
            + " seu número é: " + numero + " e seu saldo é: " + saldo);
}