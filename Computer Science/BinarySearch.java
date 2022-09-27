import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] EpamArray = {19, 20, 26, 48, 55, 64, 75, 89, 91};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input a number: ");
        int userNumber = sc.nextInt();

        int userNumberIndex = findNumberIndex(EpamArray, userNumber);
        if (userNumberIndex == -1) {
            System.out.println("User's number is not in array");
        } else {
            System.out.println("User number's " + userNumber + " index is " + userNumberIndex);
        }
    }

    public static int findNumberIndex(int[] array, int number) {
        // input array is already sorted
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (array[middle] == number) {
                return middle;
            } else if (array[middle] > number) {
                last = middle - 1;
            } else {  // (array[middle] < number) {
                first = middle + 1;
            }
        }

        return -1;
    }
}
