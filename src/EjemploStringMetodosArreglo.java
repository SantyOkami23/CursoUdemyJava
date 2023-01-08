public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

         String trabalenguas ="trabalenguas";
         System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

         char[] arreglo = trabalenguas.toCharArray();
         int largo = arreglo.length;
         System.out.println("largo = " + largo);

         for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]);
            }
         System.out.println();
         System.out.println("trabalenguas = " + trabalenguas.split("a"));//separa el string en un arreglo

         String [] arreglo2 = trabalenguas.split("a");
         int largo2 = arreglo2.length;

         for ( int j = 0;j < largo2; j++) {
             System.out.println(arreglo2[j]);
         }
         System.out.println("arreglo2 = " + arreglo2);

         String archivo = "alguna.imagen.jpg";
         String [] arreglo3 = archivo.split("\\.");

         largo2=  archivo.length();
         for ( int j = 0;j < largo2; j++) {
              System.out.println(arreglo3[j]);
         }
        

    }
}
