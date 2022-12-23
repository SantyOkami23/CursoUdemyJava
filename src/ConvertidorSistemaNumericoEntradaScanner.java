import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertidorSistemaNumericoEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal =0;

         try {
             numeroDecimal =scanner.nextInt();

         }catch(InputMismatchException e){
             System.out.println("Error, debe ingresar un numero entero");
             main (args);
             System.exit(0);
         }



        System.out.println("numeroDecimal = " + numeroDecimal);
        char espacio= ' ';

        String mensajeBinario= "Numero binario de  " +  numeroDecimal+ espacio + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal= "Numero octal de  " +  numeroDecimal+ espacio + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal= "Numero hexadecimal de  " +  numeroDecimal+ espacio + Integer.toHexString(numeroDecimal);


        String mensaje =mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n"+mensajeHexadecimal;

        System.out.println( mensaje);

    }
}



