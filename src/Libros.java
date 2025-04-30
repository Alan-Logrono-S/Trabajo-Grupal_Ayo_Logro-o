class Libros{
    String titulo;
    String autor;
    int anioPublicacion;
    public Libros(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public void mostrarInf(){
        System.out.println("El titulo del libro es " + titulo );
        System.out.println("El autor es " + autor );
        System.out.println("El año es " +  anioPublicacion );
        System.out.println("--------------------------");
    }
    public void atualizarAnio(int actualizarAnioPublicacion){
        this.anioPublicacion = actualizarAnioPublicacion;
    }
}
class Mein {
    public static void main(String[] args) {
        Libros libro1 = new Libros("Don Quijote", "Miguel de Cervantes",
                1605);
        Libros libro2 = new Libros("Cien Años de Soledad","Gabriel García Marquez",
                1967);
        libro1.mostrarInf();
        libro1.atualizarAnio( 1606);
        libro1.mostrarInf();
        libro1.mostrarInf();
        libro2.atualizarAnio(1970);
        libro2.mostrarInf();
    }
}