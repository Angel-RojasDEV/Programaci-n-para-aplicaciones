public class Ejercicioseis {
    public static void a() throws Exception {
        throw new Exception("Excepción original desde el método A");
    }

    public static void b() throws RuntimeException {
        try {
            a();
        } catch (Exception e) {
            throw new RuntimeException("Excepción lanzada desde el método B (causada por A)", e);
        }
    }

    public static void main(String[] args) {
        try {
            b();
        } catch (RuntimeException e) {
            System.out.println("Visualizando el encadenamiento de excepciones:");
            e.printStackTrace();
        }
    }
}