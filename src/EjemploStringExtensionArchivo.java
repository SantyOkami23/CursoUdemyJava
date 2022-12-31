// Para obtener la extensión
public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        //String archivo = "C:\\Users\\Santy\\Documents\\NetBeansProjects\\JavaSE\\src\\EjemploStringExtensionArchivo.java";
        String archivo = "alguna_imagen.pdf";


        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());

        //System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring() = " + archivo.substring(i+1));


    }
}
