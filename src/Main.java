import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la Inmersión en Java!");

        // System.out.println("Película The Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnPlanBasico = true;
        String nombre = "The Matrix";
        String sinopsis = """
                La mejor película del fin del milenio.
                """;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Media de evaluación: " + mediaEvaluacion);
        System.out.println("En plan básico? " + incluidoEnPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);
        // System.out.println(" ");

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Película actual.");
        } else {
            System.out.println("Es una película retro.");
        }

        int i = 0;
        double mediaEvaluacionUsuario = 0;

        while (i < 3) {
            System.out.println("Ingresa una calificación entre 1 y 5 ej. 3.8");
            Scanner teclado = new Scanner(System.in);
            double entrandoNota = teclado.nextDouble();
            mediaEvaluacionUsuario += entrandoNota;

            i++;
        }
        mediaEvaluacionUsuario /= 3;
        System.out.println("La media de evaluación de la película " +
                nombre + " es: " + mediaEvaluacionUsuario);
    }
}