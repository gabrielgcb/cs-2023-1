import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a porcentagem do IPI a ser acrescido: ");
        double valorIpi = scan.nextFloat();
        System.out.print("Informe o código da peça 1: ");
        int codigoPeca1 = scan.nextInt();
        System.out.print("Informe o valor unitário da peça 1: ");
        double valorUnitPeca1 = scan.nextFloat();
        System.out.print("Informe a quantidade de peças 1:");
        int qtdPeca1 = scan.nextInt();
        System.out.print("Informe o código da peça 2: ");
        int codigoPeca2 = scan.nextInt();
        System.out.print("Informe o valor unitário da peça 2: ");
        double valorUnitPeca2 = scan.nextFloat();
        System.out.print("Informe a quantidade de peças 2: ");
        int qtdPeca2 = scan.nextInt();

        double valorTotal = (valorUnitPeca1*qtdPeca1 + valorUnitPeca2*qtdPeca2) * (valorIpi/100 +1);
        System.out.println("Valor total: R$" + valorTotal);

    }
}
