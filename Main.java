// CLASE BASE
// Esta clase representa la información común de todos los estudiantes.

class Estudiante {

    // ATRIBUTOS
    // Se declaran como protected para que las clases hijas puedan acceder a ellos.
    protected String nombre;
    protected int edad;
    protected String matricula;
    protected double promedio;

    // CONSTRUCTOR
    public Estudiante(String nombre, int edad, String matricula, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    // MÉTODO
    // Muestra la información general del estudiante.
    public void mostrarInformacion() {
        System.out.println("--------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
    }
}

// CLASE DERIVADA
// Hereda todos los atributos y métodos de la clase Estudiante.

class EstudianteLicenciatura extends Estudiante {

    private String carrera;

    public EstudianteLicenciatura(String nombre,
                                  int edad,
                                  String matricula,
                                  double promedio,
                                  String carrera) {

        super(nombre, edad, matricula, promedio);
        this.carrera = carrera;
    }

    // Sobrescribe el método de la clase padre
    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("Tipo de estudiante: Licenciatura");
        System.out.println("--------------------------------");
    }

    // Método exclusivo
    public void estudiar() {
        System.out.println(nombre + " está estudiando la carrera de " + carrera + ".");
    }
}

// CLASE DERIVADA
// Representa a un estudiante de posgrado.

class EstudiantePosgrado extends Estudiante {

    private String especialidad;

    public EstudiantePosgrado(String nombre,
                              int edad,
                              String matricula,
                              double promedio,
                              String especialidad) {

        super(nombre, edad, matricula, promedio);
        this.especialidad = especialidad;
    }

    // Sobrescribe el método heredado
    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Tipo de estudiante: Posgrado");
        System.out.println("--------------------------------");
    }

    // Método exclusivo
    public void investigar() {
        System.out.println(nombre + " realiza investigación en " + especialidad + ".");
    }
}

// CLASE PRINCIPAL

public class Main {

    public static void main(String[] args) {

        // Crear estudiantes de licenciatura
        EstudianteLicenciatura estudiante1 =
                new EstudianteLicenciatura(
                        "Ana Blanco",
                        29,
                        "A001",
                        95.5,
                        "Ingeniería en Sistemas");

        EstudianteLicenciatura estudiante2 =
                new EstudianteLicenciatura(
                        "Juan Perez",
                        21,
                        "A002",
                        88.0,
                        "Administración");

        // Crear estudiante de posgrado
        EstudiantePosgrado estudiante3 =
                new EstudiantePosgrado(
                        "Maria Lopez",
                        22,
                        "A003",
                        92.7,
                        "Inteligencia Artificial");

        // Mostrar información del primer estudiante
        estudiante1.mostrarInformacion();
        estudiante1.estudiar();

        System.out.println();

        // Mostrar información del segundo estudiante
        estudiante2.mostrarInformacion();
        estudiante2.estudiar();

        System.out.println();

        // Mostrar información del estudiante de posgrado
        estudiante3.mostrarInformacion();
        estudiante3.investigar();
    }
}