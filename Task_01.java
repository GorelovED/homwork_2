import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        inputFloat();
    }

    private static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ввод дробного числа (типа float)");
                String input = scanner.nextLine();
                scanner.close(); // Перемещение оператора close()
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Введены некорректные данные");
            }
        }
    }
}