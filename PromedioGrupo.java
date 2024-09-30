import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PromedioGrupo {
    // El tamañoo del grupo es N
    // Las calificaciones de leen y se almacenan en un arreglo de tamaño N

    public static estudiante[] estudiantes;

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void leer_estudiantes() throws IOException {
        String matricula, nombre;
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Informacion del estudiante [" + (i + 0) + "]");
            System.out.println("Matricula");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre");
            entrada = bufer.readLine();
            nombre = entrada;

            estudiante e = new estudiante(matricula, nombre);

            System.out.println("Escriba calificaciones de Estructuras");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));

            System.out.println("Escriba calificaciones de Evaluacion");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));

            System.out.println("Escriba calificaciones de Ingles");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));

            e.setPromedio();
            estudiantes[i] = e; //agregar un objeto Estudiante al arreglo
            
        }

    }

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo

        // Arreglo de un tipo de un dato abtracto
        // Arreglo de tipo
        double[] calificaciones; // arreglo de calificaciones
        double suma = 0; // para sumar calificaciones
        double promedio; //

        System.out.println("Programa que calcula el promedio de un grupo: ");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiantes
        estudiantes = new estudiante[N];

        // Construimos el arreglo de calificiones
        calificaciones = new double[N];

        // Leer las calificaciones de cada alumno
        // for (int i = 0; i < calificaciones.length; i++) {
        // System.out.println("Escribe la calificacion del alumno " + (i + 1) + ": ");
        // entrada = bufer.readLine();
        // calificaciones[i] = Double.parseDouble(entrada);
        // suma += calificaciones[i];
        // }
        // promedio = suma / N;
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i]);
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}