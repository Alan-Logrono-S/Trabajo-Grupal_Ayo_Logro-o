public class Ciclista {
    private String nombre;
    private int edad;
    private int kmRecorridos;

    public Ciclista(String nombre, int edad, int kmRecorridos) {
        this.nombre = nombre;
        this.edad = edad;
        this.kmRecorridos = kmRecorridos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Kilómetros recorridos: " + kmRecorridos + " km");
    }

    public void actualizarKilometros(int nuevosKm) {
        this.kmRecorridos += nuevosKm;
        System.out.println(nombre + " ahora tiene " + kmRecorridos + " km recorridos en total.");
    }

    public double promedioKmMensual() {
        double promedio = kmRecorridos / 12.0;
        System.out.printf("Promedio mensual de km para %s: %.2f km%n", nombre, promedio);
        return promedio;
    }

    public static void main(String[] args) {
        Ciclista ciclista1 = new Ciclista("Pepe Razo", 26, 4200);
        Ciclista ciclista2 = new Ciclista("Luis Castillo", 33, 3900);
        Ciclista ciclista3 = new Ciclista("Roberto Sanchez", 35, 4500);

        ciclista1.mostrarInformacion();
        ciclista1.actualizarKilometros(200);
        ciclista1.promedioKmMensual();

        System.out.println("\n----------------\n");

        ciclista2.mostrarInformacion();
        ciclista2.actualizarKilometros(350);
        ciclista2.promedioKmMensual();

        System.out.println("\n----------------\n");

        ciclista3.mostrarInformacion();
        ciclista3.actualizarKilometros(150);
        ciclista3.promedioKmMensual();
    }
}
