import java.util.*;

public class Main {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j; // pencarian untuk indeks terkecil
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]) {
        int[] rand_array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            Random random = new Random();
            int rand_number = random.nextInt(101);
            while (rand_number % 2 != 0 || rand_number == 0) {
                rand_number = random.nextInt(101);
            }
            rand_array[i] = rand_number;
        }
        for (int x = 0; x < rand_array.length; x++) {
            System.out.print(rand_array[x] + " ");
        }
        System.out.println();

        selectionSort(rand_array); // sorting array dengan menggunakan Selection Sort

        System.out.println("Hasil Setelah dilakukan Sorting dengan selection Sort : ");
        for (int i : rand_array) {
            System.out.print(i + " ");
        }
    }
}
