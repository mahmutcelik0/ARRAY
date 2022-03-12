
package Array;

import java.util.Arrays;

public class MAINCLASS {
    public static void main(String[] args) {

        //SingleDimensionArray myArray = new SingleDimensionArray(10); 


        //INSTERION IN ARRAY
        //myArray.insert(0, 0);
        //myArray.insert(1, 10);
        //myArray.insert(2, 20);

        /*
        //ACCESSING ELEMENTS IN ARRAY
        var firstElement = myArray.singleDimArray[0];
        System.out.println(firstElement);
        var secondElement = myArray.singleDimArray[1];
        System.out.println(secondElement);
        var thirdElement = myArray.singleDimArray[2];
        System.out.println(thirdElement);
        */

        /*
        //TRAVERSING IN ARRAY
        myArray.traverseArray();
        */

        /*
        //SEARCHING IN ARRAY
        myArray.searchInArray(-5);
        */

        /*
        //DELETING IN ARRAY
        myArray.deleteValue(10);
        */


        TwoDimensionalArray my2DimArray = new TwoDimensionalArray(3, 3);


        my2DimArray.insertValueIntoTheArray(5, 0, 0);
        my2DimArray.insertValueIntoTheArray(10, 0, 1);
        my2DimArray.insertValueIntoTheArray(15, 1, 0);
        my2DimArray.insertValueIntoTheArray(20, 1, 1);
        
        
        /*
        System.out.println(Arrays.deepToString(my2DimArray.twoDimensionalArray));
        */
        
        /*
        //ACCESING ELEMENTS IN TWO DIMENSIONAL ARRAYS
        my2DimArray.accessCell(0, 0);
        my2DimArray.accessCell(0, 1);
        my2DimArray.accessCell(1, 0);
        my2DimArray.accessCell(1, 1);
        my2DimArray.accessCell(2, 0);
        my2DimArray.accessCell(3, 0);
        */
        
        /*
        //TRAVERSING IN TWO DIMENSIONAL ARRAYS
        my2DimArray.traverseTwoDimensionalArray();
        */
        
        /*
        //SEARCHING IN TWO DIMENSIONAL ARRAYS 
        my2DimArray.searchingValue(5);
        my2DimArray.searchingValue(15);
        my2DimArray.searchingValue(10);
        my2DimArray.searchingValue(20);
        my2DimArray.searchingValue(30);
        */


        //DELETING IN TWO DIMENSIONAL ARRAYS
        my2DimArray.deleteValueFromArray(0, 0);
        my2DimArray.deleteValueFromArray(1, 1);
        my2DimArray.deleteValueFromArray(3, 0);


    }
}
