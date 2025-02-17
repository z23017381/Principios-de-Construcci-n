// Importaciones necesarias
import java.util.ArrayList;
import java.util.List;

// Clase abstracta para el personal de la selección mexicana de fútbol
abstract class Persona {
    int id;
    String nombre;
    String apellidos;
    int edad;

    // Constructor
    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos getter y setter para los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto para concentrarse
    public abstract void concentrarse();

    // Método para viajar (común a todos)
    public void viajar() {
        System.out.println(nombre + " esta viajando.");
    }
}

// Clase para el futbolista (hereda de Persona)
class Futbolista extends Persona {
    int numPlay;
    String posicionEnCancha;

    // Constructor
    public Futbolista(int id, String nombre, String apellidos, int edad, int numPlay, String posicionEnCancha) {
        super(id, nombre, apellidos, edad);
        this.numPlay = numPlay;
        this.posicionEnCancha = posicionEnCancha;
    }

    // Métodos getter y setter para los atributos

    public int getNumPlay() {
        return numPlay;
    }

    public void setNumPlay(int numPlay) {
        this.numPlay = numPlay;
    }

    public String getPosicionEnCancha() {
        return posicionEnCancha;
    }

    public void setPosicionEnCancha(String posicionEnCancha) {
        this.posicionEnCancha = posicionEnCancha;
    }

    // Implementación del método abstracto concentrarse
    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando en el juego.");
    }

    // Métodos específicos del futbolista
    public void viajarParaJuegoVis() {
        System.out.println(nombre + " esta viajando para un juego como visitante.");
    }

    public void jugarPartido() {
        System.out.println(nombre + " esta jugando un partido.");
    }

    public void entrenar() {
        System.out.println(nombre + " esta entrenando.");
    }
}

// Clase para el entrenador (hereda de Persona)
class Entrenador extends Persona {
    String apellidosDelJugador;
    int idFederacion;

    // Constructor
    public Entrenador(int id, String nombre, String apellidos, int edad, String apellidosDelJugador, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.apellidosDelJugador = apellidosDelJugador;
        this.idFederacion = idFederacion;
    }

    // Métodos getter y setter para los atributos

    public String getApellidosDelJugador() {
        return apellidosDelJugador;
    }

    public void setApellidosDelJugador(String apellidosDelJugador) {
        this.apellidosDelJugador = apellidosDelJugador;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Implementación del método abstracto concentrarse
    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando en la estrategia del partido.");
    }

    // Métodos específicos del entrenador
    public void dirigirPartido() {
        System.out.println(nombre + " esta dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " esta dirigiendo un entrenamiento.");
    }
}

// Clase para el masajista (hereda de Persona)
class Masajista extends Persona {
    String profesion;
    int aniosExperiencia;

    // Constructor
    public Masajista(int id, String nombre, String apellidos, int edad, String profesion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.profesion = profesion;
        this.aniosExperiencia = aniosExperiencia;
    }

    // Métodos getter y setter para los atributos

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Implementación del método abstracto concentrarse
    @Override
    public void concentrarse() {
        System.out.println(nombre + " se esta concentrando en el bienestar de los jugadores.");
    }

    // Métodos específicos del masajista
    public void darMasaje() {
        System.out.println(nombre + " esta dando un masaje.");
    }
}

// Clase principal para probar el programa
public class SeleccionMexicana {
    public static void main(String[] args) {
        // Crear lista para almacenar al personal
        List<Persona> personal = new ArrayList<>();

        // Crear instancias de las clases
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Gerardo", "Martino", 59, "Messi", 12345);
        Masajista masajista = new Masajista(3, "Juan", "Pérez", 45, "Masajista Deportivo", 15);

        // Agregar al personal a la lista
        personal.add(futbolista);
        personal.add(entrenador);
        personal.add(masajista);

        // Iterar sobre la lista y llamar a los métodos
        for (Persona persona : personal) {
            persona.concentrarse();
            persona.viajar();

            if (persona instanceof Futbolista) {
                Futbolista f = (Futbolista) persona;
                f.viajarParaJuegoVis();
                f.jugarPartido();
                f.entrenar();
            } else if (persona instanceof Entrenador) {
                Entrenador e = (Entrenador) persona;
                e.dirigirPartido();
                e.dirigirEntrenamiento();
            } else if (persona instanceof Masajista) {
                Masajista m = (Masajista) persona;
                m.darMasaje();
            }

            System.out.println("--------------------");
        }
    }
}