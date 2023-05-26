public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        int allSalary = 0;
        for (int day = 1; day <= 30; day++) {
            allSalary += arr[day];
        }
        System.out.println("Сумма выплат за месяц " + allSalary + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minExpenses = 100_000;
        int maxExpenses = 100_000;
        for (int day = 0; day <= 30; day++) {
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
        int allDay = 30;
        float averageSumExpenses = 0f;
        float salarySum = 0f;
        for (int salary : arr) {
            salarySum += salary;
        }
        averageSumExpenses = salarySum / allDay;
        System.out.println("Средняя сумма трат за месяц составила " + averageSumExpenses + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}

