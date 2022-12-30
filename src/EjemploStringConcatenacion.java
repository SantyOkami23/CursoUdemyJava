public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con " + profesor;
        System.out.println("Hola  " + detalle);
        
        int numero = 10;
        int numero2 = 20;

        System.out.println(  detalle + (numero+ numero2)  );// Se concatena como si fuera un String, presendecia de izquierda a derecha y parentesis   numero + numero2 + detalle

        String detalle2 = curso.concat(" con ").concat(profesor); //Concatenacion con el metodo concat
        System.out.println("detalle2 = " + detalle2);
    }
}
