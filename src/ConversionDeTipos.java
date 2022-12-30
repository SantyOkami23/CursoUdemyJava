public class ConversionDeTipos {
    public static void main(String[] args) {

        //Conversion de tipos de datos
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Conversion de tipos de datos

        Byte.parseByte(numeroStr);
        System.out.println(numeroStr);
        System.out.println("numeroInt = " + numeroInt);
        Short.parseShort(numeroStr);
        Long.parseLong(numeroStr);
        Float.parseFloat(numeroStr);
        Double.parseDouble(numeroStr);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456);
        System.out.println("otroRealStr = " + otroRealStr);


        int i = 42768;
        System.out.println("i = " + i);
        short s = (short) i; //Forzamos la conversión
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        float f = i;
        System.out.println("f = " + f);
    }
}
