import java.util.Scanner;

public class MinMax5var {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Хранилище 10 чисел
        int[] numbers = new int[10];
        
        // Запрос 10 чисел
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " | ");
            numbers[i] = scanner.nextInt();
        }
        
        // Min и max
        int min = numbers[0];
        int max = numbers[0];
        
        // Находим минимальное и максимальное значения
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // Вывод
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        
        scanner.close();
    }
}