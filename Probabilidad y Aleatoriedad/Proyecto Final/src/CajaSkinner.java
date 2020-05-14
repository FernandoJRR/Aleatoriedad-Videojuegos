import java.util.Scanner;

public class CajaSkinner {
    public static double numerorandom(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numerorandom;
        int numero;
        boolean repeticion;

        do {
            numerorandom = numerorandom(0, 100);
            if (numerorandom < 50){
                System.out.println("Recompensa osi");
            }
            System.out.println("Repetir? - 1 Si - 0 No");
            numero = input.nextInt();
            switch (numero){
                case 1:
                    repeticion = true;
                    break;
                case 0:
                default: repeticion = false;
            }
        }while (repeticion);
    }
}
