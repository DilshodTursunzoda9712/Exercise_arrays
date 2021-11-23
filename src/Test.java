import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        sumArrays();
        averageArithmetic();
        arrayLength();

    }

    public static void sumArrays() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Введите число:");
        for (int i = 0; i < 5; i++) {
            // считываем введенный пользователем элемент в массив
            array[i] = scanner.nextInt();
        }
        // проходим по всем элементов массива и суммируем каждое число
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }

    public static void averageArithmetic() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7};
        int result = 0;

        for (int i : nums) {
            result += i;
        }
        System.out.println("\nСреднее арифметическое число: " + result / nums.length);
    }

    public static void arrayLength() {
        int[] array1 = {1, 2, 3, 4};
        int[][] array2 = {{1, 1, 1}, {2, 2, 2, 4}};
        System.out.println("Размер массива array1 = " + array1.length);
        System.out.println("Размер массива array2 = " + array2.length);
        System.out.println("Размер 1-строки массива array2 = "
                + array2[0].length);
    }
}