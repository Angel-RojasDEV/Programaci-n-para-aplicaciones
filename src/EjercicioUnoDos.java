import javax.crypto.spec.PSource;
import java.sql.SQLOutput;

public class EjercicioUnoDos {
    public static void main(String[] args) {
        try {
            throw new Exception("Error provocado manualmente en el bloque try.");
        } catch (Exception e) {
            System.out.println("Mensaje capturado: " + e.getMessage());
            System.out.println("\n--- Stack Trace ---");
            e.printStackTrace();
        } finally {
            System.out.println("\nBloque finally alcanzado: La ejecución ha pasado por aquí.");
        }
    }
}