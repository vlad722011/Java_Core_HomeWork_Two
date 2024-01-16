public class Task3 {

    /*
      3. Написать функцию, возвращающую истину, если в переданном массиве есть два
         соседних элемента, с нулевым значением.
     */

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }
        return sb.toString();
    }

    public static boolean neighboringZeroElements(int[] arr) {
        boolean isNeighboringZeroElements = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0 && arr[i] == 0) {
                isNeighboringZeroElements = true;
                break;
            }
        }
        return isNeighboringZeroElements;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача №3");
        int[] array5 = new int[]{2, 1, 2, 3, 4, 11, -11, 23};
        int[] array6 = new int[]{2, 1, 2, 3, 0, 0, -12, 2};
        System.out.println("Входящий массив - > " + arrayToString(array5));
        System.out.print("Во входящем массиве есть соседние нулевые элементы? - > ");
        System.out.println(neighboringZeroElements(array5));
        System.out.println("Входящий массив - > " + arrayToString(array6));
        System.out.print("Во входящем массиве есть соседние нулевые элементы? - > ");
        System.out.println(neighboringZeroElements(array6));
    }
}
