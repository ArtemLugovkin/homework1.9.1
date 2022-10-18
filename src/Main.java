import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));

        System.out.println(" Задание 1.");
        int summa = 0;
        for (int i = 0; i < expenses.length; i++) {
            int expense = expenses[i];
            summa += expense;
        }
        System.out.println("Сумма тратза месяц составила " + summa + " Рублей");

        System.out.println("Задание 2.");
        int max = 0;
        int min = 200_000;

        for(int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составляет " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составляет " + max + " рублей");

        System.out.println("Задание 3");
        double average = (double) summa / expenses.length;
        System.out.println("Средняя сумма трат за месяц " + average + " рублей");

        System.out.println("Задание 4");
        char [] reverseFullName = {'n', 'a', 'v', 'i', ' ', 'v', 'o', 'n', 'a', 'v', 'i'};
        for (int i = reverseFullName.length -1; i>= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }


    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}