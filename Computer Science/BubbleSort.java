public class BubbleSort {

    public static void main(String[] args) {
        int[] Array = {20, 91, 64, 75, 19, 26, 48, 55, 89};
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
                    int t;
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            }
        }

        return array;
    }

}
