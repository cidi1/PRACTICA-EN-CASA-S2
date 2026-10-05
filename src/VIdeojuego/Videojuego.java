package VIdeojuego;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("El nombre del videojuego es " + nombre + " y el genero es " + genero);
    }
    public void iniciar(){
        activo = true;
        System.out.println("El videojuego " + nombre + "se ha iniciado");
    }
    void cerrar(){
        activo = false;
        System.out.println("El videojuego " + nombre + "se ha cerrrado");
    }
    void mostrarVersion(){
        System.out.println("El videojuego " + nombre + "tiene la version " + version);
    }

}
