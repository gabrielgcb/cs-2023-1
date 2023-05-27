import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortRecursivo {

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Se o array tiver tamanho 1 ou menos, já está ordenado
        }

        // Dividir o array em duas metades
        int meio = array.length / 2;
        int[] metadeEsquerda = Arrays.copyOfRange(array, 0, meio);
        int[] metadeDireita = Arrays.copyOfRange(array, meio, array.length);

        // Chamar recursivamente o mergesort para as duas metades
        mergeSort(metadeEsquerda);
        mergeSort(metadeDireita);

        // Juntar as duas metades ordenadas
        merge(array, metadeEsquerda, metadeDireita);
    }

    private static void merge(int[] array, int[] metadeEsquerda, int[] metadeDireita) {
        int indiceEsquerda = 0;
        int indiceDireita = 0;
        int indiceArray = 0;

        // Comparar os elementos das duas metades e colocá-los no array em ordem
        while (indiceEsquerda < metadeEsquerda.length && indiceDireita < metadeDireita.length) {
            if (metadeEsquerda[indiceEsquerda] <= metadeDireita[indiceDireita]) {
                array[indiceArray] = metadeEsquerda[indiceEsquerda];
                indiceEsquerda++;
            } else {
                array[indiceArray] = metadeDireita[indiceDireita];
                indiceDireita++;
            }
            indiceArray++;
        }

        // Colocar os elementos restantes da metade esquerda no array (se houver)
        while (indiceEsquerda < metadeEsquerda.length) {
            array[indiceArray] = metadeEsquerda[indiceEsquerda];
            indiceEsquerda++;
            indiceArray++;
        }

        // Colocar os elementos restantes da metade direita no array (se houver)
        while (indiceDireita < metadeDireita.length) {
            array[indiceArray] = metadeDireita[indiceDireita];
            indiceDireita++;
            indiceArray++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem ordenados: ");
        int quantidadeNumeros = scanner.nextInt();

        // Gerar números aleatórios
        Random random = new Random();
        int[] numeros = new int[quantidadeNumeros];
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = random.nextInt(100); // Números entre 0 e 99
        }

        System.out.println("Array original: " + Arrays.toString(numeros));

        // Ordenar o array usando mergesort
        mergeSort(numeros);

        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}

