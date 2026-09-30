import java.util.Scanner;
import task1.Task1_Collections;
import task2.PrimesGeneratorTest;
import task3.Task3_Sets;
import task4.Task4_WordFrequency;
import task5.Task5_MapSwap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("   ГЛАВНОЕ МЕНЮ ЛАБОРАТОРНОЙ РАБОТЫ     ");
            System.out.println("========================================");
            System.out.println("1. Задание № 1: Методы Collections");
            System.out.println("2. Задание № 2: Генератор простых чисел");
            System.out.println("3. Задание № 3: Множества и сравнение объектов");
            System.out.println("4. Задание № 4: Частота слов");
            System.out.println("5. Задание № 5: Обмен ключей и значений");
            System.out.println("0. Выход из программы");
            System.out.println("----------------------------------------");
            System.out.print("Выберите номер задания для запуска: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите число от 0 до 5.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Задание № 1 (Методы Collections)");
                    System.out.println("----------------------------------------");
                    Task1_Collections.run();
                    break;
                case 2:
                    System.out.println("Задание № 2 (Генератор простых чисел)");
                    System.out.println("----------------------------------------");
                    PrimesGeneratorTest.run();
                    break;
                case 3:
                    System.out.println("Задание № 3 (Множества и сравнение объектов)");
                    System.out.println("----------------------------------------");
                    Task3_Sets.run();
                    break;
                case 4:
                    System.out.println("Задание № 4 (Частота слов)");
                    System.out.println("----------------------------------------");
                    Task4_WordFrequency.run();
                    break;
                case 5:
                    System.out.println("Задание № 5 (Обмен ключей и значений)");
                    System.out.println("----------------------------------------");
                    Task5_MapSwap.run();
                    break;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 5.");
            }
            System.out.println("----------------------------------------");

            scanner.nextLine();

            try {
                System.in.read();
            }
            catch (Exception e) {}
        }

        scanner.close();
    }
}
