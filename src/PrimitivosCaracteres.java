public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter ='\u0040';
        char decimal = 64;
        char simbolo ='@';

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);


        System.out.println("decimal = caracter " + (decimal  == simbolo));

        System.out.println("char corresponde en byte a  " + Character.BYTES);
        System.out.println("char corresponde en bITES a  " + Character.SIZE);
        System.out.println("Minimo valor " + Character.MIN_VALUE);
        System.out.println("Maximo valor " + Character.MAX_VALUE);

        char espacio = '\u0020'; // ' '
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro= '\r';


        System.out.println("Ejemplo espacio" + retornoCarro+ "Retorno carrito");
        System.out.println("Ejemplo espacio" + espacio+ "Si hay espacio");
        System.out.println("Ejemplo espacio" + retroceso+retroceso+ " retroceso");
        System.out.println("Ejemplo \tespacio" + tabulador+ "tabulador");

        System.out.println("Ejemplo espacio" + nuevaLinea+ "Nueva linea");
    }
}
