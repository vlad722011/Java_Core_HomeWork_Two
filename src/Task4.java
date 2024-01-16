public class Task4 {

    /*
      4. Требуется написать метод, принимающий на вход размеры двумерного массива
      и выводящий массив в виде инкременированной цепочки чисел, идущих по спирали.
    */

    private static void printMatrix(int numberOfMatrixRows, int numberOfMatrixColumns, int[][] array) {
        for (int i = 0; i < numberOfMatrixRows; i++) {
            for (int j = 0; j < numberOfMatrixColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] fillTheArrayInASpiral(int x, int y){
        int countIteration = 0;

        if(x <= y){
            if(x % 2 == 0){
                countIteration = x / 2;
            }
            else countIteration = (x / 2) + 1;
        }
        else {
            if( y % 2 == 0){
                countIteration = y / 2;
            }
            else countIteration = (y / 2) + 1;
        }

        int [][] matrix = new int[x][y];

        int indexString = 0;
        int indexColumn = 0;
        int value = 1;
        int count = x * y;

        for (int k = 0; k < countIteration; k++) {

            while(indexColumn < y){
                matrix[indexString][indexColumn] = value;
                value += 1;
                indexColumn += 1;
                count -= 1;
                if(count == 0){
                    return matrix;
                }
            }
            indexColumn -= 1;

            while(indexString < (x - 1)){
                indexString += 1;
                matrix[indexString ][indexColumn ] = value;
                value += 1;
                count -= 1;
                if(count == 0){
                    return matrix;
                }
            }

            while(indexColumn - k > 0){
                indexColumn -= 1;
                matrix[indexString][indexColumn] = value;
                value += 1;
                count -= 1;
                if(count == 0){
                    return matrix;
                }
            }

            while(indexString - k > 1){
                indexString -= 1;
                matrix[indexString][indexColumn] = value;
                value += 1;
                count -= 1;
                if(count == 0){
                    return matrix;
                }
            }

            indexColumn += 1;
            x -= 1;
            y -= 1;
        }

        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("Задача №4");
        System.out.println();

        int numberOfMatrixRows1 = 8;
        int numberOfMatrixColumns1 = 8;
        int array1 [][] = fillTheArrayInASpiral(numberOfMatrixRows1, numberOfMatrixColumns1);

        int numberOfMatrixRows2 = 6;
        int numberOfMatrixColumns2 = 3;
        int array2 [][] = fillTheArrayInASpiral(numberOfMatrixRows2, numberOfMatrixColumns2);

        int numberOfMatrixRows3 = 3;
        int numberOfMatrixColumns3 = 2;
        int array3 [][] = fillTheArrayInASpiral(numberOfMatrixRows3, numberOfMatrixColumns3);



        System.out.println("Вариант один");
        printMatrix(numberOfMatrixRows1, numberOfMatrixColumns1, array1);
        System.out.println();

        System.out.println("Вариант два");
        printMatrix(numberOfMatrixRows2, numberOfMatrixColumns2, array2);
        System.out.println();

        System.out.println("Вариант три");
        printMatrix(numberOfMatrixRows3, numberOfMatrixColumns3, array3);
        System.out.println();
    }


}
