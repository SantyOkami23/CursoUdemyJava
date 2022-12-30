public class EjemploStringTestRendimientoConcatenacion {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);


        long inicio = System.currentTimeMillis();
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;

        for (int i = 0; i <  1000000 ; i++) {
            c = c.concat(a).concat(b).concat ("\n");
              //c+=a+b+"\n";
             //sb.append(a).append(b).append("\n");
        }
        System.out.println(tiempo);
        //System.out.println("c = " + c);
        //System.out.println("sb.toString() = " + sb.toString());

    }
}
