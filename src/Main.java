public class Main {
    public static void main(String[] args) {
        //Primer Punto
        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es 0.");
        }
        System.out.println("\n");

        //segundo Punto
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("el numeroWhile es: " + numeroWhile);
        }

        System.out.println("\n");

        //Tercer Punto
        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println("el numeroDoWhile es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);
        System.out.println("\n");

        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("el numeroFor es: " + numeroFor);
        }
        System.out.println("\n");

        String estacion = "otoño";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera.");
                break;
            case "verano":
                System.out.println("Estamos en verano.");
                break;
            case "otoño":
                System.out.println("Estamos en otoño.");
                break;
            case "invierno":
                System.out.println("Estamos en invierno.");
                break;
            default:
                System.out.println("La estación no es válida.");
                break;
        }
    }
}