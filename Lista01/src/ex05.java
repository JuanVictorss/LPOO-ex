import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        float value_a = read.nextFloat();
        System.out.println("Digite outro valor: ");
        float value_b = read.nextFloat();
        System.out.println("Digite uma operacao +, -, * ou /.");
        String signal = read.next(); 

        if (signal.equals("+")) {
            System.out.println(value_a + value_b);
        } else if (signal.equals("-")) {
            System.out.println(value_a - value_b);
        } else if (signal.equals("*")) {
            System.out.println(value_a * value_b);
        } else if (signal.equals("/")) {
            if (value_b != 0) {
                System.out.println(value_a / value_b);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operation.");
        }

        read.close();
    }
}
