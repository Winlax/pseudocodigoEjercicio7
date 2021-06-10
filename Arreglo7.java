import java.util.*;

public class Arreglo7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int ceros = 0;
        int numeroAleatorio;
        int min = 0;
        int max = 36;

        for (double i = 1; i<=15; i++) {

            numeroAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);

            if (numeroAleatorio == 0) {
                ceros += 1;
            } else if (numeroAleatorio % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }

        }

        double CerosPorcentaje = ( (double)ceros * 100 ) / 15;
	    double ParesPorcentaje = ( (double)pares * 100 ) / 15;
	    double ImparesPorcentaje = ( (double)impares * 100 ) / 15;

        System.out.println("Numeros Pares: "+ParesPorcentaje+"%");
	    System.out.println("Numeros Impares: "+ImparesPorcentaje+"%");
	    System.out.println("Numeros Ceros: "+CerosPorcentaje+"%");
    }
}