import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task123();
        task4();
    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    static void task123() {
        final int [] monthCost = generateRandomArray();
        int sum=0;
        double avrgCost=0;
        int minCost= monthCost[0];
        int maxCost= monthCost[0];
        for (int i = 0; i < monthCost.length-1; i++) {
            sum+= monthCost[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");

        for (int i = 0; i < monthCost.length-1; i++) {
            if (minCost > monthCost[i]) {
                minCost = monthCost[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minCost+" рублей");

        for (int i = 0; i < monthCost.length-1; i++) {
            if (maxCost < monthCost[i]) {
                maxCost = monthCost[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxCost+" рублей");

        avrgCost=sum/ monthCost.length;
        System.out.println("Средняя сумма трат за месяц составила "+avrgCost+" рублей\n");
    }
    static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length-1-i]);
        }
        System.out.println("\n");
    }
    }