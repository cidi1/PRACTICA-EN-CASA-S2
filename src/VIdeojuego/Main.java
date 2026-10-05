package VIdeojuego;

public class Main {
   public static void main() {
       Videojuego videojuego1 = new Videojuego();
       videojuego1.nombre = "Fortnite";
       videojuego1.genero = "Battle Royale";
       videojuego1.version = "24.6";
       videojuego1.activo = true;

       Videojuego videojuego2 = new Videojuego();
       videojuego2.nombre = "Minecraft";
       videojuego2.genero = "Aventura";
       videojuego2.version = "18.4.1";
       videojuego2.activo = false;

       Videojuego videojuego3 = new Videojuego();
       videojuego3.nombre = "FC27";
       videojuego3.genero = "Deporte";
       videojuego3.version = "12.4.1";
       videojuego3.activo = true;

       //COmprobación
       videojuego1.mostrarInformacion();
       videojuego1.mostrarVersion();
       videojuego1.iniciar();
       videojuego1.cerrar();

       videojuego2.mostrarInformacion();
       videojuego2.mostrarVersion();
       videojuego2.iniciar();
       videojuego2.cerrar();

       videojuego3.mostrarInformacion();
       videojuego3.mostrarVersion();
       videojuego3.iniciar();
       videojuego3.cerrar();
   }
}
