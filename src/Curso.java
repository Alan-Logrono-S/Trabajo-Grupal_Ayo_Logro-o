class Curso{
    String nombre;
    String codigo;
    int creditos;
    public Curso(String nombre, String codigo, int creditos){
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    public void MostrarInf(){
        System.out.println("Curso: "+ nombre);
        System.out.println("Codigo: "+codigo);
        System.out.println("Creditos: "+creditos);
        System.out.println("------------------------");
    }
    public void ActualizarCreditos(int nuevosCreditos){
        this.creditos = nuevosCreditos;

    }
}
//test
class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Programacion","INF101",5);
        curso1.MostrarInf();
        curso1.ActualizarCreditos(6);
        curso1.MostrarInf();

    }
}