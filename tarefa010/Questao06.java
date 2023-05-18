import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int valor = scan.nextInt();
        System.out.println("Antecessor = " + (valor-1) + "\nSucessor = " + (valor+1));
    }
}
