import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {  // This method output sorted array
        int[] unSortedArray = arrayBuilder();
        int[] sortedArray = Sorter(unSortedArray);

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    static int[] arrayBuilder() {  // This method creates array

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to store: ");
        int elements = sc.nextInt();

        int[] Array = new int[elements];  // creates array with elements
        for (int i = 0; i < elements; i++) {
            System.out.print("Enter the value of the array element ");
            Array[i] = sc.nextInt();  // fills array with elements
        }
        return Array;
    }

    static int[] Sorter(int[] array) {  // This method sort array
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
