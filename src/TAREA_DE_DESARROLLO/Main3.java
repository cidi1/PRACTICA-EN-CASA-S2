package TAREA_DE_DESARROLLO;

import MODULO_DE_SOFTWARE.Modulo;

public class Main3 {
   public static void main() {
      Tarea tarea1 = new Tarea();
      tarea1.titulo = "Ecuaciones lineales";
      tarea1.responsable = "Sebastian";
      tarea1.horasEstimadas = 67.0;
      tarea1.completada = false;

      Tarea tarea2 = new Tarea();
       tarea2.titulo = "Practicas en casa S2";
       tarea2.responsable = "Marco";
       tarea2.horasEstimadas = 3.0;
       tarea2.completada = false;

       Tarea tarea3 = new Tarea();
        tarea3.titulo = "Funciones exponenciales";
        tarea3.responsable = "Juan";
        tarea3.horasEstimadas = 12.0;
        tarea3.completada = true;

        //COmprobacion
        tarea1.mostrarResponsable();
        tarea1.mostrarEstado();
        tarea1.completar();
        tarea1.mostrarInformacion();

       tarea2.mostrarResponsable();
       tarea2.mostrarEstado();
       tarea2.mostrarInformacion();

       tarea3.mostrarResponsable();
       tarea3.mostrarEstado();
       tarea3.mostrarInformacion();
   }
}
