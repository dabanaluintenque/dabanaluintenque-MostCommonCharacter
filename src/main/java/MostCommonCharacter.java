import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {


        char findFriquentValue = ' ';
        int temp = 0;

        Map<Character, Integer> recurThemost = new HashMap<>();

        for ( char charValue : str.toCharArray()) {
            recurThemost.put(charValue, recurThemost.getOrDefault(charValue, 0) + 1);
        }

         for (Map.Entry<Character, Integer> entries : recurThemost.entrySet()) {

            if(entries.getValue() >  temp) {

                temp = entries.getValue();

                findFriquentValue = entries.getKey();
            }
         }

         return findFriquentValue;
    }
}
