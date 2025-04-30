public class Jugador {
    private String nombre;
    private int numero;
    private String posicion;

    public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Posición: " + posicion);
    }

    public void actualizarPosicion(String nuevaPosicion) {
        this.posicion = nuevaPosicion;
        System.out.println("La nueva posición de " + nombre + " es: " + posicion);
    }

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Pepe Rito", 10, "Delantero");
        jugador1.mostrarInformacion();
        jugador1.actualizarPosicion("Portero");
        jugador1.mostrarInformacion();
    }
}
