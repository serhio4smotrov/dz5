import java.util.Arrays;

public class zad3 {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;
        }
        float meanArr = sumArr / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("Средняя сумма трат за месяц составила "+meanArr+" рублей");
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
