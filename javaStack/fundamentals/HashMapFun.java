import java.util.HashMap;
import java.util.Set;

public class HashMapFun {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Gorgeous", "movin' to Miami was her life's dream");
		trackList.put("20/20", "I feel like the greatest, only been at this for 2 years");
		trackList.put("I'm Ready", "diamonds hittin' left right, I;m just livin' my best life");
		trackList.put("I'm Not Real", "I'm not real, I think I never was");

		System.out.println(trackList.get("Gorgeous"));

		Set<String> keys = trackList.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + trackList.get(key));
		}
	}

}