import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero;
        System.out.print("Introduzca Número entero: ");
        Numero = sc.nextInt();
        if(Numero%2==0)
            System.out.println("El numero que usted digito es par");
        else
            System.out.println("El numero que usted digito es impar");
    }
}
