import java.util.Scanner;

public class Sin_excepciones {
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

        if (!esNumerico(num1)) {
            System.out.println("Entrada incorrecta: " + num1);
            System.exit(2);
        }

        if (!esNumerico(num2)) {
            System.out.println("Entrada incorrecta: " + num2);
            System.exit(3);
        }

        int operand1 = Integer.parseInt(num1);
        int operand2 = Integer.parseInt(num2);
        int result = 0;

        switch (op.charAt(0)) {
            case '+': result = operand1 + operand2; break;
            case '-': result = operand1 - operand2; break;
            case '*': result = operand1 * operand2; break;
            case '/':
                if (operand2 != 0) result = operand1 / operand2;
                else System.exit(4);
                break;
        }

        System.out.println(num1 + " " + op + " " + num2 + " = " + result);
    }

    public static boolean esNumerico(String s) {
        if (s == null || s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-' && s.length() > 1) continue;
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
}