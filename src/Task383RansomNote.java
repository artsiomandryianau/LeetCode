import java.util.ArrayList;
import java.util.List;
/*
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true


 */
class Task383RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        boolean flag = false;
        if( ransomNote.length() > magazine.length()) return flag;
        if(ransomNote.equals(magazine) || ransomNote.length() == 0) return !flag;

        List ransomeNoteList = new ArrayList();
        List magazineList = new ArrayList();
        for(int j = 0; j < ransomNote.length(); j++) {
            ransomeNoteList.add(ransomNote.charAt(j));
        }
        for(int j = 0; j < magazine.length(); j++) {
            magazineList.add(magazine.charAt(j));
        }

        if(!magazineList.containsAll(ransomeNoteList)) return false;

        while(ransomeNoteList.size()!=0){
            if(!magazineList.contains(ransomeNoteList.get(0))) return false;

            magazineList.remove(ransomeNoteList.get(0));
            ransomeNoteList.remove(0);
            flag = true;
        }
        return flag;
    }
}