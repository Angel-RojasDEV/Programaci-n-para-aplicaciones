public class Ejercicio5 {
    public static void main(String[] args) {
        PruebaExcepcion prueba = null;

        try {
            prueba.validarNombre("Software");
        } catch (Exception e) {
            System.out.println("Se detectó un error de tipo: " + e.getClass().getName());
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}