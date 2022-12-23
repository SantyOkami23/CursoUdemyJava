import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal =Integer.parseInt(numeroStr);
        System.out.println("numeroDecimal = " + numeroDecimal);
        char espacio= ' ';

        System.out.println("Numero binario de  " +  numeroDecimal+ espacio + Integer.toBinaryString(numeroDecimal));
        int numeroBinario= 0b111110100;//Para representar un numero binario como entero
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("Numero octal de  " +  numeroDecimal+ espacio + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;//Para que se interprete como un octal
        System.out.println("numeroOctal = " + numeroOctal);


        System.out.println("Numero hexadecimal de  " +  numeroDecimal+ espacio + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;//Para interpretarse como hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje ="Numero binario de  " +  numeroDecimal+ espacio + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero octal de  " +  numeroDecimal+ espacio + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero hexadecimal de  " +  numeroDecimal+ espacio + Integer.toHexString(numeroDecimal);


        JOptionPane.showInputDialog(null, mensaje );


    }
}
