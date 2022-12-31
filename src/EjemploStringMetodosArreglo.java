public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
         String nombre = "Santy";

         System.out.println("nombre.length " + nombre.length());
         System.out.println("nombre,toUpperCase() = "+ nombre.toUpperCase());// convierte a mayusculas
         System.out.println("nombre.toLowerCase() = "+ nombre.toLowerCase());//toLowerCase() convierte a minusculas
         System.out.println("nombre.equals(\"Santy\")=  " + nombre.equals("Santy"));//si es igual
         System.out.println("nombre.equals(\"santy\")=  " + nombre.equals("santy"));//si es igual
         System.out.println("nombre.equalsIgnoreCase(\"santy\")=  " + nombre.equalsIgnoreCase("santy"));//si es igual sin importar mayusculas y minusculas
         System.out.println("nombre.compareTo(\"Santy\") = " + nombre.compareTo("Pedro"));//compara si es igual
         System.out.println("nombre.chartA(0) = " + nombre.charAt(0));//obtiene el caracter en la posicion 0
         System.out.println("nombre.chartA(1) = " + nombre.charAt(1));//obtiene el caracter en la posicion 1

         System.out.println("nombre.substring() = " + nombre.substring(1,4));// obtiene los  caracteres desde la posicion que se indique
         System.out.println("nombre.substring() = " + nombre.substring(1));// obtiene los  caracteres desde la posicion que se indique
         System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));// obtiene el ultimo caracter de formq dinamica

         String trabalenguas ="trabalenguas";
         System.out.println("trabalenguas = " + trabalenguas.replace("a", "e"));//reemplaza la letra a por la e
         System.out.println("trabalenguas = " + trabalenguas);
         System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));//obtiene la posicion de la letra a
         System.out.println("trabalenguas = " + trabalenguas.lastIndexOf('a'));//obtiene la ultima posicion de la letra a
         System.out.println(".indexOf('z') = " + trabalenguas.indexOf("lenguas"));//obtiene la posicion de la letra z
         System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("lenguas"));//verifica si contiene la letra t
         System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr")); //verifica si empieza con tr
         System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));//verifica si termina con lenguas
         System.out.println("   trabalenguas   ");
         System.out.println("   trabalenguas   ".trim() );//elimina los espacios en blanco



        

    }
}
