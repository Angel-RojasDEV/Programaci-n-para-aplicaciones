import java.util.Scanner;

public class Excepciones_NumberFormatException {
    public static void main(String[] args) {
        String num1, op, num2;

        if (args.length == 3) {
            num1 = args[0];
            op = args[1];
            num2 = args[2];
        } else {
            Scanner input = new Scanner(System.in);
            System.out.print("Introduce el primer numero: ");
            num1 = input.next();
            System.out.print("Introduce el operador: ");
            op = input.next();
            System.out.print("Introduce el segundo numero: ");
            num2 = input.next();
        }

        int operand1 = 0;
        int operand2 = 0;
        int result = 0;

        try {
            operand1 = Integer.parseInt(num1);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + num1);
            System.exit(2);
        }

        try {
            operand2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            System.out.println("Entrada incorrecta: " + num2);
            System.exit(3);
        }

        switch (op.charAt(0)) {
            case '+': result = operand1 + operand2; break;
            case '-': result = operand1 - operand2; break;
            case '*': result = operand1 * operand2; break;
            case '/': result = operand1 / operand2; break;
        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }
}