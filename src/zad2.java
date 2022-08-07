import java.util.Arrays;

public class zad2 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int minArr = 200000;
        int maxArr = 0;
        for (int i : arr) {
            if (i > maxArr) {
                maxArr = i;
            }
            if (i < minArr) {
                minArr = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составила "+minArr+" рублей");
        System.out.println("Максимальная сумма трат за день составила "+maxArr+" рублей");
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
