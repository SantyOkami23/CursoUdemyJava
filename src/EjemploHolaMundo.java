public class EjemploHolaMundo {
    public static void main (String [] args) {

        String saludo = " Hola Mundo desde Java 2";
        System.out.println (saludo);
        System.out.println("saludo.toUpperCase () = "+ saludo.toUpperCase());

        int numero= 10;
        System.out.println("numero = " + numero);
        boolean valor= true;
        int numero2= 20;

        if (valor){
            System.out.println("numero = "+ numero);
            numero2 = 1;
        }
        System.out.println("numero2 = "+ numero2);

        var numero3 = "Sin colocar tipo de dato";
        System.out.println(numero3);

        String nombre;
        nombre = "Andres";

        if (numero > 11){
            nombre= "Juan";
        }
        System.out.println("nombre = "+ nombre );
        //Cometario
        /*Cometario multiple*/
    }
}
