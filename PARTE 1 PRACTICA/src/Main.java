public class Main {
    public static void main(String[] args) {
        suma(50, 60, 30);

        Coche miCoche = new Coche();
        miCoche.Maspuertas();
        System.out.println("EL NUMERO DE PUERTAS ES " + miCoche.Numpuertas);

    }

    public static void suma(int a, int b, int c){
        int resultado;
        resultado= a + b +c;
        System.out.println(resultado);

    }

}

class Coche{
    public int Numpuertas = 4;
    public void Maspuertas(){
        this.Numpuertas++;
    }
}