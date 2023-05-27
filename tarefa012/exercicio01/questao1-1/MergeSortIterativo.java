import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortIterativo {

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return; // Se o array tiver tamanho 1 ou menos, já está ordenado
        }

        int tamanho = array.length;
        int[] auxiliar = new int[tamanho];

        // Fazer o merge de subarrays de tamanho 1, 2, 4, 8, ...
        for (int tamanhoSubarray = 1; tamanhoSubarray < tamanho; tamanhoSubarray *= 2) {
            for (int inicio = 0; inicio < tamanho - tamanhoSubarray; inicio += tamanhoSubarray * 2) {
                int meio = inicio + tamanhoSubarray - 1;
                int fim = Math.min(inicio + 2 * tamanhoSubarray - 1, tamanho - 1);

                merge(array, auxiliar, inicio, meio, fim);
            }
        }
    }

    private static void merge(int[] array, int[] auxiliar, int inicio, int meio, int fim) {
        int indiceEsquerda = inicio;
        int indiceDireita = meio + 1;
        int indiceAuxiliar = inicio;

        // Mesclar os dois subarrays em ordem
        while (indiceEsquerda <= meio && indiceDireita <= fim) {
            if (array[indiceEsquerda] <= array[indiceDireita]) {
                auxiliar[indiceAuxiliar] = array[indiceEsquerda];
                indiceEsquerda++;
            } else {
                auxiliar[indiceAuxiliar] = array[indiceDireita];
                indiceDireita++;
            }
            indiceAuxiliar++;
        }

        // Copiar os elementos restantes do subarray da esquerda para o auxiliar (se houver)
        while (indiceEsquerda <= meio) {
            auxiliar[indiceAuxiliar] = array[indiceEsquerda];
            indiceEsquerda++;
            indiceAuxiliar++;
        }

        // Copiar os elementos restantes do subarray da direita para o auxiliar (se houver)
        while (indiceDireita <= fim) {
            auxiliar[indiceAuxiliar] = array[indiceDireita];
            indiceDireita++;
            indiceAuxiliar++;
        }

        // Copiar os elementos do auxiliar de volta para o array original
        for (int i = inicio; i <= fim; i++) {
            array[i] = auxiliar[i];
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
