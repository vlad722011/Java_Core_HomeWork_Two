public class Task1 {

    /*
      1. Написать метод, возвращающий количество чётных элементов массива.
         countEvens([2, 1, 2, 3, 4]) → 3
         countEvens([2, 2, 0]) → 3
         countEvens([1, 3, 5]) → 0
    */

    public static int countEvenElementsInArray(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static String arrayToString(int []arr) {
        StringBuilder sb = new StringBuilder();
        for (int j : arr) {
            sb.append(j).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача №1");
        int[] array1 = new int[]{2, 1, 2, 3, 4};
        int[] array2 = new int[]{2, 2, 0};
        int[] array3 = new int[]{1, 3, 5};
        System.out.println("Входящий массив - > " + arrayToString(array1));
        System.out.printf("Количество четных элементов этого массива = %s",
                countEvenElementsInArray(array1));
        System.out.println();
        System.out.println("Входящий массив - > " + arrayToString(array2));
        System.out.printf("Количество четных элементов этого массива = %s",
                countEvenElementsInArray(array2));
        System.out.println();
        System.out.println("Входящий массив - > " + arrayToString(array3));
        System.out.printf("Количество четных элементов этого массива = %s",
                countEvenElementsInArray(array3));
        System.out.println();
    }
}
