import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMin = scan.nextDouble();

        System.out.print("Informe o valor do salário que o usuário ganha: ");
        double salarioUsuario = scan.nextDouble();

        double qtdSalarioMin = salarioUsuario / salarioMin;
        System.out.println("O usuário ganha " + qtdSalarioMin + " salários mínimos.");
    }
}
