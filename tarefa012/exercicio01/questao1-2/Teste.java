import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random rand = new Random();

        // Test with arrays of size 100
        int[] arr1a = new int[100];
        for (int i=0; i<arr1a.length; i++) arr1a[i] = rand.nextInt(1000);

        int[] arr1b = arr1a.clone();

        long startTime1a = System.nanoTime();
        MergeSort.mergeSortIterative(arr1a);
        long endTime1a = System.nanoTime();

        long startTime1b = System.nanoTime();
        MergeSort.mergeSortRecursive(arr1b);
        long endTime1b = System.nanoTime();

        System.out.println("Quantidade de elementos: " + arr1a.length);
        System.out.println("Tempo MergeSort Iterativo: " + (endTime1a - startTime1a));
        System.out.println("Tempo MergeSort Recursivo: " + (endTime1b - startTime1b));

        // Test with arrays of size 1000
        int[] arr2a = new int[1000];
        for (int i=0; i<arr2a.length; i++) arr2a[i] = rand.nextInt(10000);

        int[] arr2b = arr2a.clone();

        long startTime2a = System.nanoTime();
        MergeSort.mergeSortIterative(arr2a);
        long endTime2a = System.nanoTime();

        long startTime2b = System.nanoTime();
        MergeSort.mergeSortRecursive(arr2b);
        long endTime2b = System.nanoTime();

        System.out.println("Quantidade de elementos: "+ arr2a.length);
        System.out.println("Tempo MergeSort Iterativo: " + (endTime2a - startTime2a));
        System.out.println("Tempo MergeSort Recursivo: " + (endTime2b - startTime2b));

        // Test with arrays of size 10000
        int[] arr3a = new int[10000];
        for (int i=0; i<arr3a.length; i++) arr3a[i] = rand.nextInt(100000);

        int[] arr3b = arr3a.clone();

        long startTime3a = System.nanoTime();
        MergeSort.mergeSortIterative(arr3a);
        long endTime3a = System.nanoTime();

        long startTime3b = System.nanoTime();
        MergeSort.mergeSortRecursive(arr3b);
        long endTime3b = System.nanoTime();

        System.out.println("Quantidade de elementos: " + arr3a.length);
        System.out.println("Tempo MergeSort Iterativo: " + (endTime3a - startTime3a));
        System.out.println("Tempo MergeSort Recursivo: " + (endTime3b - startTime3b));
    }
}