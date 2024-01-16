public class Task2 {
      /*
       2. Написать функцию, возвращающую разницу между самым большим и самым маленьким
          элементами переданного не пустого массива.
      */

    public static String arrayToString(int []arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }
        return sb.toString();
    }

    public static int differenceBetweenMinAndMaxArrayElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        return max - min;
    }
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача №2");
        int[] array4 = new int[]{2, 1, 2, 3, 4, 11, -11, 23};
        System.out.println("Входящий массив - > " + arrayToString(array4));
        System.out.printf("Разница между максимальным и минимальным элементами массива  = %s",
                differenceBetweenMinAndMaxArrayElements(array4));
        System.out.println();
    }
}
