import javax.swing.*;

public class ConvertidorSistemaNumerico {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal =0;
         try {
             numeroDecimal =Integer.parseInt(numeroStr);

         }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Error, debe ingresar un numero entero");
             main (args);
             System.exit(0);
         }



        System.out.println("numeroDecimal = " + numeroDecimal);
        char espacio= ' ';

        String mensajeBinario= "Numero binario de  " +  numeroDecimal+ espacio + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario= 0b111110100;//Para representar un numero binario como entero
        System.out.println("numeroBinario = " + numeroBinario);


        String mensajeOctal= "Numero octal de  " +  numeroDecimal+ espacio + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 0764;//Para que se interprete como un octal
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal= "Numero hexadecimal de  " +  numeroDecimal+ espacio + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numeroHexadecimal = 0x1f4;//Para interpretarse como hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje =mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n"+mensajeHexadecimal;


        JOptionPane.showInputDialog(null, mensaje );


    }
}

