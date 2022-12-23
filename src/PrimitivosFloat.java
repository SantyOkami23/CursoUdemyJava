public class PrimitivosFloat {
    static double valorDefecto;
    public static void main(String[] args) {
        float realFloat = 2.12e3f;//Para indicar que es tipo flotante se usa la f 1.0f
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde en byte a = " + Float.BYTES);
        System.out.println("Float corresponde en Bites a = " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float = " + Float.MIN_VALUE);



        double realdDouble = 3.4028235E39; //Double
        System.out.println("realdDouble = " + realdDouble);
        System.out.println("Double corresponde en byte a = " + Double.BYTES);
        System.out.println("Double corresponde en Bites a = " + Double.SIZE);
        System.out.println("Maximo valor para Double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor para Double = " + Double.MIN_VALUE);

        var varFlotante = 3.1415;
        System.out.println("varFlotante = " + varFlotante);


        System.out.println("valorDefecto = " + valorDefecto);
    }
}
