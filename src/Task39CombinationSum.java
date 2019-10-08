import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task39CombinationSum {


    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> results =new  ArrayList<>();
        if(candidates== null || candidates.length == 0){
            return results;
        }

        Arrays.sort(candidates);

        List<Integer> combination = new ArrayList<>();
        findCombination(results, combination, candidates, target, 0);

        return results;
    }

    private void findCombination(List<List<Integer>> results, List<Integer> combination, int[] candidates, int target, int startIndex){

        if(target == 0){
            results.add(new ArrayList<>(combination));
            return;        }

        for (int i = startIndex; i <candidates.length; i++){
            if(candidates[i] > target){
                break;
            }

            combination.add(candidates[i]);
            findCombination(results, combination, candidates, target - candidates[i],i);
            combination.remove(combination.size()-1);
        }
    }
}