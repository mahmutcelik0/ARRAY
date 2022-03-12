
package Array;


public class SingleDimensionArray {
    int[] singleDimArray;

    public SingleDimensionArray(int size) {
        singleDimArray = new int[size];
        for (int a = 0; a < singleDimArray.length; a++) {
            singleDimArray[a] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int valueToInsert) {      //TIME COMPLEXITY IS O(1)
        try {
            if (singleDimArray[index] == Integer.MIN_VALUE) {
                singleDimArray[index] = valueToInsert;
                System.out.println("VALUE HAS BEEN INSERTED.");
            } else {
                System.out.println("THE CELL HAS BEEN CHANGED");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("OUT OF INDEX");
        }
    }

    public void traverseArray() {
        try {
            for (int a = 0; a < singleDimArray.length; a++) {
                if (singleDimArray[a] != Integer.MIN_VALUE) System.out.println(singleDimArray[a]);

            }

        } catch (Exception e) {
            System.out.println("ARRAY NO LONGER EXISTS!");
        }
    }

    public void searchInArray(int elementToSearchInArray) {

        for (int a = 0; a < singleDimArray.length; a++) {
            if (singleDimArray[a] == elementToSearchInArray) {
                System.out.println("ELEMENT IS IN ARRAY.IT'S INDEX IS: " + a);
                return;
            }
        }
        System.out.println(elementToSearchInArray + " IS NOT IN THE ARRAY.");

    }

    public void deleteValue(int valueToDelete) {
        for (int a = 0; a < singleDimArray.length; a++) {
            if (singleDimArray[a] == valueToDelete) {
                singleDimArray[a] = Integer.MIN_VALUE;
                System.out.println(valueToDelete + " HAS BEEN REMOVED FROM ARRAY");
                return;
            }

        }
        System.out.println(valueToDelete + " IS NOT IN THE ARRAY.");


    }


}
