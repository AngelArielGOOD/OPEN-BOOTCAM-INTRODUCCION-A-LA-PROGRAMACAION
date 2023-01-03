public class Interruptor {
    public static void main(String[] args) {
        var Estacion = "fe";

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

            case "Verano":
                System.out.println("Es Verano");
                break;

            default:
                System.out.println("No es una estacion del año");
        }

    }
}