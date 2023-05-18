import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int anos, meses, dias, totalDias;

        System.out.print("Informe o número de anos: ");
        anos = scan.nextInt();
        System.out.print("Informe o número de meses: ");
        meses = scan.nextInt();
        System.out.print("Informe o número de dias: ");
        dias = scan.nextInt();

        totalDias = anos*365 + meses*30 + dias;

        System.out.println("Total de dias: " + totalDias);

    }

}
