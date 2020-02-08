import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

    All numbers (including target) will be positive integers.
    The solution set must not contain duplicate combinations.

Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]

 */
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