public class ArraySort {
    public static void main(String[] args) {
        int[] array = {20, 91, 64, 75, 19, 26, 48, 55, 89};
        int biggest = -1_000_000;
        int lowest = 1_000_000;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
            if (array[i] < lowest) {
                lowest = array[i];
            }
        }

        System.out.println("Минимальное число массива равно " + lowest);
        System.out.println("Максимальное число массива равно " + biggest);
    }
}
