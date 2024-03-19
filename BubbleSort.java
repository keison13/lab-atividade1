import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de elementos:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Digite os elementos:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        bubbleSort(array);
        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int comp = 0;
        int swap = 0;

        long startTime = System.nanoTime();

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comp++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // milliseconds

        System.out.println("Bubble Sort:");
        System.out.println("Número de trocas: " + swap);
        System.out.println("Número de comparações: " + comp);
        System.out.println("Tempo de execução: " + duration + "ms");
    }
}
