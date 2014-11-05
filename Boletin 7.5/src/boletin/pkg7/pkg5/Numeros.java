//Dados 3 números que se supon distintos , indicar cal é o maior
package boletin.pkg7.pkg5;

public class Numeros {

    private float valor;

    //constructor
    public Numeros() {

    }

    //metodos
    public void setNumero(float a) {
        valor = a;
    }

    public float getNumero() {
        return valor;
    }

    public void operacionNumeros(Numeros num1, Numeros num2, Numeros num3) {
        if (num1.getNumero() > num2.getNumero() && (num1.getNumero() > num3.getNumero())) {
            System.out.println(num1.getNumero() + "es el mas grande.");

        } else if (num2.getNumero() > num3.getNumero() && num2.getNumero() > num1.getNumero()) {
            System.out.println(num2.getNumero() + "es el mas grande.");
        } else {
            System.out.println(num3.getNumero() + "es el mas grande.");
        }
    }

}
