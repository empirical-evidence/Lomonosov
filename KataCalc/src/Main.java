import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(Calc(input));
    }


    public static String Calc(String input) throws Exception {
        String[] expression = input.split(" ");

        if (expression.length < 3) {
            throw new Exception("Внимание: операция не является арифметической.\nПерезапустите программу.");
        } else if (expression.length > 3) {
            throw new Exception("Формат операции не удовлетворяет условиям.\nДопустимое количество символов: 3\nПерезапустите программу.");
        }
        try {
            int a = Integer.parseInt(expression[0]);
            int b = Integer.parseInt(expression[2]);
            if (((a > 10) || (a < 0)) || ((b > 10) || (b < 0))) {
                throw new Exception("Введите положительное число от 1 до 10");
            }
            int result;
            switch (expression[1]) {
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                default:
                    throw new Exception("Введен символ не отвечающий арифметическим условиям.\nДля совершения оперции введите:\n  *  умножение\n  /  деление\n  +  сложение\n -  вычитание\nПерезапустите программу.");
            }
            return Integer.toString(result);
        } catch (NumberFormatException  e) {
            try {
                Roman a = Roman.valueOf(expression[0]);
                Roman b = Roman.valueOf(expression[2]);
                int a1 = a.translation;
                int b1 = b.translation;
                if ((a1 > 10) || (b1 > 10)) {
                    throw new Exception("Число должно быть от 1 до 10\nПерезапустите программу.");
                }
                int result1;
                switch (expression[1]) {
                    case "*":
                        result1 = a1 * b1;
                        break;
                    case "/":
                        result1 = a1 / b1;
                        break;
                    case "+":
                        result1 = a1 + b1;
                        break;
                    case "-":
                        result1 = a1 - b1;
                        break;
                    default:
                        throw new Exception("Введен некорректный символ.\nПерезапустите программу.");
                }
                if (result1 < 0) {
                    throw new Exception("В римской системе счисления нет отрицательных чисел.\nПерезапустите программу.");
                }
                Roman c = Roman.values()[result1 - 1];
                String translation = c.toString();
                return translation; }
            catch (Exception s) {
                throw new Exception("Используются разные системы счисления или введен некорректный символ.\nПерезапустите программу.");
            }
        }
    }}

