package display;

public class Display {

    public static String[][] display(int[][] arrayOfNumbers) {
        validateArrayLength(arrayOfNumbers);
        String[][] resultOfDisplay = new String[3][3];
        iterateThroughTheArray(arrayOfNumbers, resultOfDisplay);
        return resultOfDisplay;
    }
    private static void iterateThroughTheArray(int[][] arrayOfNumbers, String[][] resultOfDisplay) {
        for(int row = 0; row < arrayOfNumbers.length; row++) {
            for(int column = 0; column < arrayOfNumbers[row].length; column++) {
                if(arrayOfNumbers[row][column] == 0) {
                    resultOfDisplay[row][column] = " ";
                }else {
                    resultOfDisplay[row][column] = "*";
                }
            }
        }

    }

    private static void validateArrayLength(int[][] arrayOfNumbers) {
        if(arrayOfNumbers.length != 3) throw new IllegalArgumentException("The length of the given array is not valid");
    }
}
