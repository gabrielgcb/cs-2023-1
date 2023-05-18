public class Questao02 {
    public static void main(String[] args) {

        double media1 = (8+9+7)/3;
        System.out.println("Media aritmética dos números 8, 9 e 7 = " + media1);

        double media2 = (4+5+6)/3;
        System.out.println("Media aritmética dos números 4, 5 e 6 = " + media2);

        double somaMedias = media1 + media2;
        System.out.println("Soma das duas médias = " + somaMedias);

        double mediaMedias = (media1 + media2) / 2;
        System.out.println("Media das medias = " + mediaMedias);

    }
}
