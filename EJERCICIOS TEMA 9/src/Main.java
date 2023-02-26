public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 17;
        cliente.nombre = "Ariel";
        cliente.telefono = 481380312;
        cliente.credito= 20150;
        System.out.println("---------------CLIENTE-----------------");
        System.out.println("Tu edad es " + cliente.edad);
        System.out.println("Tu nombre es " + cliente.nombre);
        System.out.println("Tu telefono es " + cliente.telefono);
        System.out.println("Tu credito es de $" + cliente.credito);
        System.out.println("---------------------------------------");

        trabajador.edad = 17;
        trabajador.nombre = "Bololon";
        trabajador.telefono = 999388312;
        trabajador.salario= 187.50;
        System.out.println("---------------Trabajador-----------------");
        System.out.println("Tu edad es " + trabajador.edad);
        System.out.println("Tu nombre es " + trabajador.nombre);
        System.out.println("Tu telefono es " + trabajador.telefono);
        System.out.println("Tu salario es de $" + trabajador.salario);
        System.out.println("------------------------------------------");
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona{
   int credito;

}

class Trabajador extends Persona{
    double salario;

}