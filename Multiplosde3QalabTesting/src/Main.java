import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;

        System.out.print("Introduzca un número entero: ");
        X = sc.nextInt();

        if (X % 2 == 0 || X % 3 == 0) {
            System.out.println("Es múltiplo de 2 o de 3");
        } else {
            System.out.println("No es múltiplo de 2 o de 3");
        }
    }
}
