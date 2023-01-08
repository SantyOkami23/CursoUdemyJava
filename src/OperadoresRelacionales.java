public class OperadoresRelacionales {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean bool= false ;

        boolean b1 = a == b;
        System.out.println("b1 = " + b1);

        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        boolean b3 = a != b;
        System.out.println("b3 = " + b3);

        boolean b4 = bool == true;
        System.out.println("b4 = " + b4);

        boolean b5 = a > b;
        System.out.println("b5 = " + b5);

        boolean b6 = a < b;
        System.out.println("b6 = " + b6);

        boolean b7 = a >= b;
        System.out.println("b7 = " + b7);


    }
}
