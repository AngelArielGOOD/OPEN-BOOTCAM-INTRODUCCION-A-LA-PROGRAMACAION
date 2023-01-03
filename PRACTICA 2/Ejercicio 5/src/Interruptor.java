public class Interruptor {
    public static void main(String[] args) {
        var Estacion = "Invierno";

        switch (Estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;

            case  "Otoño":
                System.out.println("Es Otoño");
                break;

            case "Invierno":
                System.out.println("Es Invierno");
                break;

            default:
                System.out.println("Es Verano");
        }

    }
}