package MODULO_DE_SOFTWARE;

public class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion(){
        System.out.println("El nómbre del módulo es " + nombre + " El lenguaje es " + lenguaje + " la version es " + version + ", y está terminado? " + terminado);

    }
    public void marcarTerminado(){
        terminado = true;
        System.out.println("Ahora el estado del módulo está terminado!");
    }
    void mostrarEstado(){
        System.out.println("EL estado del módulo está terminado True/False? " + terminado);
    }
    void mostrarVersion(){
        System.out.println("La version del módulo es " + version);
    }
}
