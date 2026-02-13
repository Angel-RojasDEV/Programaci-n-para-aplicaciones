public static void Verificarnum(int num) {
    if (num % 2 != 0) {
        throw new ArithmeticException("Error: El numero " + num + " es impar");
    }
    IO.println("El numero " + num + " es par");
}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Digite el numero: ");
    int num = sc.nextInt();
    try {
        Verificarnum(num);
    } catch (ArithmeticException e) {
        IO.println(e.getMessage());
    }
}