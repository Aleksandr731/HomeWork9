public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[32];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        for (int mouth = 1; mouth <= 12; mouth++) {
            System.out.println("Сумма трат за " + mouth + " месяц " + arr[mouth] + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minExpenses = 100_000;
        int maxExpenses = 100_000;
        for (int day = 1; day <= 31; day++) {
            if (arr[day] > maxExpenses) {
                maxExpenses = arr[day];
            }
            if (arr[day] < minExpenses) {
                minExpenses = arr[day];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        for (int day = 1; day <= 30; day++) {

        }
    }
}

