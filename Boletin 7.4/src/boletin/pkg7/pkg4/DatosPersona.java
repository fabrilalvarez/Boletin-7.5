package boletin.pkg7.pkg4;

public class DatosPersona {

    int pesoPersona;
    String nombre;

    //Constructor
    public DatosPersona() {

    }

    public DatosPersona(String a) {
        nombre = a;
    }

    //Metodo
    public String getNombre() {
        return nombre;

    }

    public void setPeso(int a) {
        pesoPersona = a;
    }

    public int getPeso() {
        return pesoPersona;
    }

    public void comparar(DatosPersona primeraPersona, DatosPersona segundaPersona) {

        if (primeraPersona.getPeso() > segundaPersona.pesoPersona) {
            System.out.println("*** " + primeraPersona.nombre + " PESA MAS QUE "+ 
                    segundaPersona.nombre + (primeraPersona.pesoPersona - segundaPersona.pesoPersona));

        } else if (segundaPersona.getPeso() > primeraPersona.getPeso()) {
            System.out.println("--- " + segundaPersona.nombre + " PESA MAS." +
                    (segundaPersona.pesoPersona-primeraPersona.pesoPersona));

        } else {
            System.out.println("PESAN IGUAL");
        }
    }

}
