import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*

We are given two sentences A and B.  (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Return a list of all uncommon words.

You may return the list in any order.
 */
class Task884UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap();
        String[] aTable = A.split(" ");
        String[] bTable = B.split(" ");

        for (String word: aTable)
            count.put(word, count.getOrDefault(word, 0) + 1);
        for (String word: bTable)
            count.put(word, count.getOrDefault(word, 0) + 1);

        List<String> ans = new LinkedList();
        for (String word: count.keySet())
            if (count.get(word) == 1)
                ans.add(word);

        return ans.toArray(new String[ans.size()]);
    }
}