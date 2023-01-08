public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i =1;
        int j = ++i; // preincremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento

        i=2;
        System.out.println("inicial de i=  " + i);
        j = i++; // postincremento
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i=3;
        j = --i; // predecremento
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //Post decremento
        i=4;
        j = i--; // postdecremento
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("(++j) = " + (++j));
        System.out.println("j++ = " + (j++));
       
    }
}
