public class TipoPrimitivos {
    public static void main (String [] args) {

        //Booleanos y tipo char
        boolean a = false;
        boolean b = true;
        char a1 = 'a';
        char b1 = 'b';
        char c1 = '\u0021'; // Signo de exclamación

        // Numeros enteros
        byte enteroByte= 127; //Entre -128 a 127
        short enteroShort= 32767; // entre -32768 a 32767
        int enteroInt = 29382448; //Entre 2147483648 a 214748346
        long enteroLong = 9320493084023949L; //Muy grande

        //Numeros reales
        float realFloat= 3.1415f; // Para flotantes
        double realDouble= 3.12423494; //Más capacidad

        System.out.println(c1);
        System.out.println(realFloat);
    }
}
