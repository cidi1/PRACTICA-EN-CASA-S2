package TAREA_DE_DESARROLLO;

public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){
        System.out.println("El título de la tarea es: " + titulo +
                            " el responsable es " + responsable +
                            " las horas estimadas son: " + horasEstimadas +
                            " y la activadad está completada True/False? " + completada);
    }
    public void completar(){
        completada = true;
        System.out.println("Ahora el estado de la tarea está completado");
    }
    void mostrarResponsable(){
        System.out.println("El responsable de la tarea " + titulo + " es: " + responsable);
    }
    void mostrarEstado(){
        System.out.println("El estado de la tarea es completado True/False? " + completada + " y las horas estimadas son: " + horasEstimadas);
    }
}
