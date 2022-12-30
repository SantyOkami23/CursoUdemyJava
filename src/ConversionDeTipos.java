public class ConversionDeTipos {
    public static void main (String [] args){

        //Conversion de tipos de datos
        String numeroStr = "50";

        int numeroInt =Integer.parseInt(numeroStr);
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
        double realDouble= Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "true";
        boolean logicoBoolean= Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

    }
}
