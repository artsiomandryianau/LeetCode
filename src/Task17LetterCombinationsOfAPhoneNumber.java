import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task17LetterCombinationsOfAPhoneNumber {
    /*
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
     */

    List<String> output = new ArrayList<String>();
    Map<String, String> dictonary = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};


    public void backtrack(String combination, String next_digits) {

        if (next_digits.length() == 0) {
            output.add(combination);
        } else {
            String digit = next_digits.substring(0, 1);
            String letters = dictonary.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = dictonary.get(digit).substring(i, i + 1);

                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }
}
