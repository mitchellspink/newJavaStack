import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class PuzzleJava {

	public void puzzle1() {
		int[] arr = {3,5,1,2,7,9,8,13,25,32};
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int sum = 0;
		for (int i : arr) {
			sum += i;
			if (i > 10)
				newArr.add(i);
		}
		System.out.println(sum);
		System.out.println(newArr);
	}

	public void puzzle2() {
		String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> list = Arrays.asList(names);
        List<String> namesGreaterThanFive = new ArrayList<String>();
        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
        	if (list.get(i).length() > 5) {
        		namesGreaterThanFive.add(list.get(i));
        	}
        }
        String[] newArr = new String[namesGreaterThanFive.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = namesGreaterThanFive.get(i);
        }
        System.out.println(newArr);
	}

	public void allLetters() {
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
        "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        List<String> list = Arrays.asList(letters);
        Collections.shuffle(letters);
        System.out.println(letters);
	}

}