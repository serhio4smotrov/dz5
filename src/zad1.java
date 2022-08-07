import java.util.Arrays;

public class zad1 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила "+sumArr+" рублей");
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
