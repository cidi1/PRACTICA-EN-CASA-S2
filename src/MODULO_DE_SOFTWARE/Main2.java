package MODULO_DE_SOFTWARE;

public class Main2 {
    public static void main() {
        Modulo modulo1 = new Modulo();
        modulo1.nombre = "Gestion de compra";
        modulo1.version = "16.4.2";
        modulo1.terminado = true;
        modulo1.lenguaje = "Python";

        Modulo modulo2 = new Modulo();
        modulo2.nombre = "Cobranzas";
        modulo2.version = "27.8.6";
        modulo2.terminado = false;
        modulo2.lenguaje = "C++";

        Modulo modulo3 = new Modulo();
        modulo3.nombre = "Inventarios";
        modulo3.version = "67.0";
        modulo3.terminado = true;
        modulo3.lenguaje = "Java";

        //Comprobacion
        modulo1.marcarTerminado();
        modulo1.mostrarEstado();
        modulo1.mostrarVersion();
        modulo1.mostrarInformacion();

        modulo2.marcarTerminado();
        modulo2.mostrarEstado();
        modulo2.mostrarVersion();
        modulo2.mostrarInformacion();

        modulo3.marcarTerminado();
        modulo3.mostrarEstado();
        modulo3.mostrarVersion();
        modulo3.mostrarInformacion();
    }
}
