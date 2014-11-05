package boletin.pkg7.pkg5;

import java.util.Scanner;

public class Boletin75 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---------------------------------------");

        Scanner dato = new Scanner(System.in);
        Numeros num1 = new Numeros();
        Numeros num2 = new Numeros();
        Numeros num3 = new Numeros();
        Numeros llamada = new Numeros();
        System.out.println("NUMERO: ");
        num1.setNumero(dato.nextFloat());
        System.out.println("NUMERO: ");
        num2.setNumero(dato.nextFloat());
        System.out.println("NUMERO: ");
        num3.setNumero(dato.nextFloat());
        llamada.operacionNumeros(num1, num2, num3);
        System.out.println("---------------------------------------");

    }

}
