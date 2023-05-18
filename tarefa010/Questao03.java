import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do saldo: ");
        double valorSaldo = scan.nextFloat();

        double valorReajustado = valorSaldo * 1.15;
        System.out.print("Valor do saldo reajustado em 15%: " + valorSaldo*1.15);
    }
}
