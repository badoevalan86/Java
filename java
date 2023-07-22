import java.util.Scanner;

public class SumOfNaturalNumbers {
    // Найдем сумму первых n натуральных чисел
    public static int sumOfNaturalNumbers(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int num = scanner.nextInt();
        int result = sumOfNaturalNumbers(num);
        System.out.println("Сумма первых " + num + " натуральных чисел: " + result);
    }
}
