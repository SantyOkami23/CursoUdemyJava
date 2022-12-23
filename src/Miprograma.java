public class Miprograma  {
    public static void main(String[] args) {
        // Declarar y asignar valores al array
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 3, 3, 4};

        // Inicializar variables para almacenar el número que más se repite y su cantidad
        int max = arr[0];
        int maxCount = 1;

        // Recorrer el array
        for (int i = 0; i < arr.length; i++) {
            // Contar cuántas veces aparece el elemento actual en el array
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Si el contador es mayor que el máximo actual, actualizar el máximo y su cantidad
            if (count > maxCount) {
                max = arr[i];
                maxCount = count;
            }
        }

        // Imprimir el número que más se repite y su cantidad
        System.out.println("El número que más se repite es: " + max);
        System.out.println("Aparece " + maxCount + " veces en el array.");
    }
}
