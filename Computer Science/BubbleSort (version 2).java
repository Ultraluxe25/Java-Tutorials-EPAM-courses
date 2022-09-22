import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        int elements = sc.nextInt();

        int[] Array = new int[elements];
        for (int i = 0; i < elements; i++) {
            System.out.print("Enter the value of the array element ");
            Array[i] = sc.nextInt();
        }

        int[] sortedArray = Sorter(Array);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    static int[] Sorter(int[] array) {
        int n = array.length;  // 9 elements
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int t;  // switcher
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        return array;
    }

}
