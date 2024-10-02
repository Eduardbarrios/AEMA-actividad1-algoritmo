import java.util.Scanner;

public class $7_BasicCalculator {
    public static void main(String[] args) {
        //creamos un scaner para leer informqación de la consola
        Scanner sc = new Scanner(System.in);
        //bienbenida
        System.out.println("Bienvenido a la calculadora");
        //pedimos al usuario que introduzca el primer valor
        System.out.println("introduce el primer número de la operación (use la coma como valor decimal):");
        //guardamos el valor obtenido del usuario
        double num1 = sc.nextDouble();
        System.out.println("introduce el segundo número de la operación (use la coma como valor decimal):");
        //guardamos el valor obtenido del usuario
        double num2 = sc.nextDouble();
        //calculamos la suma
        double sumaOut = num1 + num2;
        //calculamos la resta
        double restaOut = num1 - num2;
        //calculamos la multiplicación
        double multiOut = num1*num2;
        //calculamos la división
        double divOut = num1/num2;
        //calculamos el modulo
        double modOut = num1%num2;
        //imprimimos los resultado
        System.out.printf("Suma: %.2f%n", sumaOut);
        System.out.printf("Resta: %.2f%n", restaOut);
        System.out.printf("Multiplicación: %.2f%n", multiOut);
        System.out.printf("División: %.2f%n", divOut);
        System.out.printf("Modulo: %.2f%n", modOut);
        //cerramos el scaner
        sc.close();
    }
}
