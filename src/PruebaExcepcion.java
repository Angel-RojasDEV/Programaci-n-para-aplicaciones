public class PruebaExcepcion {
    public void validarNombre(String nombre) throws NombreInvalido {
        if (nombre == null || nombre.isEmpty()) {
            throw new NombreInvalido("El nombre no puede estar vacío.");
        }
        System.out.println("Nombre válido: " + nombre);
    }

    public static void main(String[] args) {
        PruebaExcepcion prueba = new PruebaExcepcion();
        try {
            prueba.validarNombre("");
        } catch (NombreInvalido e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        }
    }
}