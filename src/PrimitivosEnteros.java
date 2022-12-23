public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte= 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte  " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte  " + Byte.MIN_VALUE);

        short numeroShort= 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short  " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short  " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo Int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo Int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un Int  " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un Int  " + Integer.MIN_VALUE);

        long numeroLong =  9223372036854775807L;//Para identificar que es Long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo Long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo Long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un Long  " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long  " + Long.MIN_VALUE);

        var numeroVar= 127; //Tipo var siempre es de tipo integer, de tipo entero, se agrega la L para convertir el tipo de dato
        var letraVar= "Hola";
        System.out.println("letraVar = " + letraVar);





    }
}
