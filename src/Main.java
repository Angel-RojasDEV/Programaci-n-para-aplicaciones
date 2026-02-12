import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.println("--- Calcular el porcentaje de votos ---");
    System.out.println("--- Para salir digite 0 ---");

    while (true) {
      System.out.print("Digite el numero de candidato: ");
      int num = sc.nextInt();

      if (num == 0) break;

      list.add(num);
    }

    if (list.isEmpty()) {
      System.out.println("No se ingresaron votos.");
    } else {
      int total = list.size();
      Map<Integer, Integer> conteo = new HashMap<>();

      for (int numcandidato : list) {
        conteo.put(numcandidato, conteo.getOrDefault(numcandidato, 0) + 1);
      }

      System.out.println("-- Resultados --");
      System.out.println("Votos totales: " + total);

      for (Map.Entry<Integer, Integer> entry : conteo.entrySet()) {
        int numcandidato = entry.getKey();
        int votos = entry.getValue();
        double porcentaje = (votos * 100.0) / total;

        System.out.println("Candidato: " + numcandidato);
        System.out.println("Votos: " + votos);
        System.out.println("Porcentaje: " + porcentaje + "%");
        System.out.println("-----------------------");
      }
    }
    sc.close();
  }
}