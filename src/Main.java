import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(0);
        int numeroRandom = random.nextInt(100);
        int intentos = 5;
        System.out.println("Bienvenido al juego de las adivinanzas, tendras 5 oportunidades para adivinar el numero correcto");

        while (intentos > 0){

            System.out.println("Ingresa un número del 0 al 100");
            int numeroIngresado = scanner.nextInt();

            if (numeroRandom == numeroIngresado){
                System.out.println("¡Felicitaciones, el número que ingresaste es correcto!");
                break;
                } else if(numeroRandom < numeroIngresado) {
                System.out.println("El número que ingresaste es mayor , intentalo de nuevo");
            } else if (numeroRandom > numeroIngresado) {
                System.out.println("El número que ingresaste es menor, intentalo de nuevo");
            }
            intentos--;
        }

        if (intentos == 0){
            System.out.println("El número de intentos se agoto, el número a adivinar era: " + numeroRandom );
        }
        scanner.close();
    }
}