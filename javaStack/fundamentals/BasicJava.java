import java.util.ArrayList;

public class BasicJava {
    public void print1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdd1To255() {
    	for (int i = 1; i <= 255; i = i + 2) {
    		System.out.println(i);
    	}
    }

    public void printSumOfNums() {
    	int sum = 0;
    	for (int i = 0; i <= 255; i++) {
    		sum += i;
    		System.out.println("New number: " + i + " Sum: " + sum);
    	}
    }

    public void iterateThruArray(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i]);
    	}
    }

    public void findMax(int[] arr) {
    	int max = arr[0];
    	for (int i : arr) {
    		if (i > max) 
    			max = i;
    	}
    	System.out.println(max);
    }

    public void getAverage(int[] arr) {
    	int sumOfArr = 0;
    	for (int i : arr) {
    		sumOfArr += i;
    	}
    	System.out.println(sumOfArr/arr.length);
    }

    public void arrayOddNums() {
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for (int i = 1; i <= 255; i = i + 2) {
    		arr.add(i);
    	}
    	System.out.println(arr);
    }

    public void greaterThanY(int[] arr, int y) {
    	int greaterThanCount = 0;
    	for (int i : arr) {
    		if (i > y)
    			greaterThanCount++;
    	}
    	System.out.println(greaterThanCount);
    }

    public void squareValues(int[] arr) {
    	ArrayList<Integer> newArr = new ArrayList<Integer>();
    	for (int i : arr) {
    		newArr.add(i * i);
    	}
    	System.out.println(newArr);
    }

    public void noNegativeNums(int[] arr) {
    	ArrayList<Integer> newArr = new ArrayList<Integer>();
    	for (int i : arr) {
    		if (i < 0)
    			i = 0;
    		newArr.add(i);
    	}
    	System.out.println(newArr);
    }

    public void maxMinAverage(int[] arr) {
    	ArrayList<Integer> newArr = new ArrayList<Integer>();
    	int max = arr[0];
    	int min = arr[0];
    	int sumOfArr = 0;
    	for (int i : arr) {
    		if (i > max)
    			max = i;
    		if (i < min)
    			min = i;
    		sumOfArr += i;
    	}
    	newArr.add(max);
    	newArr.add(min);
    	newArr.add(sumOfArr/arr.length);
    	System.out.println(newArr);
    }

    public void shiftValues(int[] arr) {
    	for (int i : arr) {
    		arr[i] = arr[i + 1];
    	}
    	System.out.println(arr);
    }

}