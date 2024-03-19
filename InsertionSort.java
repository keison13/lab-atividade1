import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de elementos:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Digite os elementos:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        scanner.close();
    }

    public static void insertionSort(int[] arr) {
        int comp = 0;
        int swap = 0;

        long startTime = System.nanoTime();

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                comp++;
                arr[j + 1] = arr[j];
                j = j - 1;
                swap++;
            }
            arr[j + 1] = key;
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // milliseconds

        System.out.println("Insertion Sort:");
        System.out.println("Número de trocas: " + swap);
        System.out.println("Número de comparações: " + comp);
        System.out.println("Tempo de execução: " + duration + "ms");
    }

}
