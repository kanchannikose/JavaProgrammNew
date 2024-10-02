package StringRelated;

//Java program to count frequencies of
//characters in string using Hashmap
import java.io.*;
import java.util.*;

public class OccurrenceOfCharInString {
	
	
	public static void characterCount(String str)
	{
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] ch = str.toCharArray();

		// checking each char of strArray
		for (char c : ch) {
			if (map.containsKey(c)) {

				// If char is present in map,
				// incrementing it's count by 1
				map.put(c, map.get(c) + 1);
			}
			else {

				// If char is not present in map,
				// putting this char to map with 1 as it's value
				map.put(c, 1);
			}
		}
		

		// Printing the charCountMap
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}


