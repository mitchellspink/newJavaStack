class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava x = new BasicJava();

        x.print1To255();
        x.printOdd1To255();
        x.printSumOfNums();
        int[] arr = {1,3,5,7,9,13};
        x.iterateThruArray(arr);
        int[] newArr = {-6,-11,-1,8,33};
        x.findMax(newArr);
        int[] thirdArr = {5,3,7,9,6};
        x.getAverage(thirdArr);
        x.arrayOddNums();
        int[] fourthArr = {1,3,5,7};
        x.greaterThanY(fourthArr, 3);
        int[] fifthArr = {1,5,10,2};
        x.squareValues(fifthArr);
        int[] sixthArr = {-1,5,10,-2};
        x.noNegativeNums(sixthArr);
        int[] seventhArr = {5,3,7,9,6};
        x.maxMinAverage(seventhArr);
        int[] eighthArr = {1,5,10,7,-2};
        x.shiftValues(eighthArr);
    }
}