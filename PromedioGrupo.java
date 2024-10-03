import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PromedioGrupo {
    // El tamañoo del grupo es N
    // Las calificaciones de leen y se almacenan en un arreglo de tamaño N

    public static estudiante[] estudiantes;

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void leerEstudiantes() throws IOException {
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
            estudiantes[i] = e; // agregar un objeto Estudiante al arreglo

        }

    }

    public static void imprimirEstudiantes() { //No regresa nada
        for (estudiante e : estudiantes) {
            System.out.println(e.toString());
        }
    }

    public static double calcularPromedioGrupo(){ // regresa valores double ( calificaciones )
        double suma = 0;

        for( estudiante e: estudiantes){
            suma += e.getPromedio();
        }
        return suma / estudiantes.length;
    }

    public static void main(String[] args) throws IOException {
        int N; // El tamaño del arreglo
        double promedio; //

        System.out.println("Programa que calcula el promedio de un grupo: ");
        System.out.println("Escribe el tamaño del grupo: ");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // construyendo el arreglo de estudiantes
        estudiantes = new estudiante[N];

        // Lectura de la informacion de los estudiantes
        leerEstudiantes();

        // Imprimir el contenudi de calificaciones
        imprimirEstudiantes();

        //Calcular promedio del grupo
        promedio = calcularPromedioGrupo();
        System.out.println("El promedio del grupo es: " + promedio);
    }
}