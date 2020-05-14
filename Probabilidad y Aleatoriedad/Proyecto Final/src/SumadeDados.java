import java.util.Scanner;

public class SumadeDados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, dados;
        float numerador;
        double fraccion, denominador, probabilidad;
        System.out.println("Calculador de Probabilidad");
        System.out.println("Ingrese el numero que se busca como resultado de varios dados:");
        numero = input.nextInt();
        System.out.println("Ingrese la cantidad de dados: ");
        dados = input.nextInt();

        numerador = (numero-dados)*(dados-1)+1;
        denominador = Math.pow(6, dados);
        fraccion = numerador/denominador;
        probabilidad = Math.round((fraccion*100) * 100.0) / 100.0;

        System.out.println("La probabilidad de obtener "+numero+" como la suma de "+dados+" dados es: "+probabilidad+"%");

    }
}
