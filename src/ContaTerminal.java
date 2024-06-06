import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o nome do cliente.");
    String NomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o número da Conta.");
    int Numero = scanner.nextInt();

    System.out.println("Por favor, digite o número da Agência.");
    String Agencia = scanner.next();

    System.out.println("Por favor, digite o seu saldo.");
    Double Saldo = scanner.nextDouble();

    System.out.println(String.format(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.",
        NomeCliente, Agencia, Numero, Saldo));
  }
}
