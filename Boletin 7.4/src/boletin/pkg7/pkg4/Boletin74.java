package boletin.pkg7.pkg4;

import java.util.Scanner;

public class Boletin74 {

    public static void main(String[] args) {
        // TODO codigo del programa.
        System.out.println("---------------------------------------");

        Scanner dato = new Scanner(System.in);

        DatosPersona aux = new DatosPersona();
        System.out.println("Nombre: ");
        DatosPersona primeraPersona = new DatosPersona(dato.nextLine());
        System.out.println("Nombre: ");
        DatosPersona segundaPersona = new DatosPersona(dato.nextLine());
        System.out.println("Peso de "+primeraPersona.getNombre());
        primeraPersona.setPeso(dato.nextInt());
        System.out.println("Peso de "+segundaPersona.getNombre());
        segundaPersona.setPeso(dato.nextInt());
        aux.comparar(primeraPersona, segundaPersona);

        System.out.println("---------------------------------------");
    }

}
