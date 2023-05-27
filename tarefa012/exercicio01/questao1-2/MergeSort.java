public class MergeSort {
    public static void mergeSortIterative(int[] array) {
        if (array == null) {
            return;
        }
        int[] temp = new int[array.length];
        for (int m = 1; m <= array.length - 1; m = 2 * m) {
            for (int i = 0; i < array.length - 1; i += 2 * m) {
                int from = i;
                int mid = i + m - 1;
                int to = Math.min(i + 2 * m - 1, array.length - 1);
                merge(array, temp, from, mid, to);
            }
        }
    }

    public static void mergeSortRecursive(int[] array) {
        if (array == null) {
            return;
        }
        int[] temp = new int[array.length];
        mergeSortRecursive(array, temp, 0, array.length - 1);
    }

    private static void mergeSortRecursive(int[] array, int[] temp, int from, int to) {
        if (from >= to) {
            return;
        }
        int mid = (from + to) / 2;
        mergeSortRecursive(array, temp, from, mid);
        mergeSortRecursive(array, temp, mid + 1, to);
        merge(array, temp, from, mid, to);
    }

    private static void merge(int[] array, int[] temp, int from, int mid, int to) {
        System.arraycopy(array, from, temp, from, to - from + 1);
        int i = from;
        int j = mid + 1;
        for (int k = from; k <= to; k++) {
            if (i > mid) {
                array[k] = temp[j++];
            } else if (j > to) {
                array[k] = temp[i++];
            } else if (temp[i] < temp[j]) {
                array[k] = temp[i++];
            } else {
                array[k] = temp[j++];
            }
        }
    }
}
