import java.util.Locale;
import java.util.Scanner;

public class ContaBanco
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();


        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldoConta = scanner.nextDouble();


        System.out.println
                ("Olá " + nomeCliente + " " + sobrenomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldoConta + " já está disponível para saque.");
    }

}
