public class ArraySort {
    public static void main(String[] args) {
        int[] array = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int new_biggest = maxNumber(array);
        int new_smallest = minNumber(array);

        System.out.println("Минимальное число массива равно " + new_smallest);
        System.out.println("Максимальное число массива равно " + new_biggest);
    }

    static int maxNumber(int[] array) {
        int biggest = -1_000_000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }


    static int minNumber(int[] array) {
        int smallest = 1_000_000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
}
