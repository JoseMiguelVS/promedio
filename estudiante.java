public class estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;
    private double promedio;

    // ------------------------------------------------------------------
    // constructor
    public estudiante(String m, String n) { // declara variables a usar
        // El objeto es construir e inicializar el objeto
        this.matricula = m; // setters == establecedores
        this.nombre = n; // getters == captadores
    }

    public String getMatricula() { // capta
        return matricula;
    }

    public void setMatricula(String matric) { // variable diferente
        this.matricula = matric; // establece
    }

    // --------------------------------------------------------------------
    // constructor de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // --------------------------------------------------------------------
    // constructor de estruccturas
    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    // --------------------------------------------------------------------
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    // --------------------------------------------------------------------
    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    // ---------------------------------------------------------------------
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.estructuras + this.evaluacion + this.ingles) / 3;
    }

    // ------------------------------------------------------------------------------------------------------
    // toString
    @Override // == sobre escribir
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

}
