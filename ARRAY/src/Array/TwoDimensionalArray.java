
package Array;

public class TwoDimensionalArray {

    int twoDimensionalArray[][] = null;

    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        twoDimensionalArray = new int[numberOfRows][numberOfColumns];

        for (int a = 0; a < twoDimensionalArray.length; a++) {
            for (int b = 0; b < twoDimensionalArray[0].length; b++) {
                twoDimensionalArray[a][b] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValueIntoTheArray(int numberToInsert, int row, int column) {
        try {
            if (twoDimensionalArray[row][column] != Integer.MIN_VALUE) {
                System.out.println("CELL HAS BEEN FULLED");
            } else {
                twoDimensionalArray[row][column] = numberToInsert;
                System.out.println("ELEMENT HAS BEEN REACHED SUCCESSFULLY");
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("OUT OF INDEX");
        }


    }

    public void accessCell(int row, int column) {
        try {
            System.out.println("ELEMENT IS: " + twoDimensionalArray[row][column]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index For 2D Array");
        }
    }


    public void traverseTwoDimensionalArray() {  //O(MN) complexity
        for (int a = 0; a < twoDimensionalArray.length; a++) {
            for (int b = 0; b < twoDimensionalArray[a].length; b++) {
                System.out.print(twoDimensionalArray[a][b] + "    ");
            }
            System.out.println("");
        }
    }

    public void searchingValue(int numberToFindintoArray) {

        for (int a = 0; a < twoDimensionalArray.length; a++) {
            for (int b = 0; b < twoDimensionalArray[a].length; b++) {
                if (twoDimensionalArray[a][b] == numberToFindintoArray) {
                    System.out.println(numberToFindintoArray + "Element is in the " + a + ".row " + b + ".column");
                    return;
                }
            }
        }
        System.out.println("ELEMENT IS NOT IN THE ARRAY");

    }

    public void deleteValueFromArray(int row, int column) {
        try {
            System.out.println("ELEMENT HAS BEEN DELETED: " + twoDimensionalArray[row][column]);
            twoDimensionalArray[row][column] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("INVALID INDEX");
        }
    }


}
