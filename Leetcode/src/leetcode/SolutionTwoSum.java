package leetcode;
import java.util.ArrayList;
import java.util.HashMap;

public class SolutionTwoSum {
	  public int[] twoSum(int[] nums, int target) {
	        
		  HashMap<Integer,Integer> dict=new HashMap<Integer,Integer>();
	        ArrayList<Integer> result = new ArrayList<>();

		  for(int i=0;i<nums.length; i++)
		  {
			  int com=target-nums[i];
			  if(dict.containsKey(com))
			  {
				int index= dict.get(com);
			    result.add(index);
			    result.add(i);
			    break;
			  }
			  if(!dict.containsKey(com))
			  {
				  dict.put(nums[i], i);
			  }
		  }
		  
		  int[] resultArray= result.stream().mapToInt(Integer::intValue).toArray();
		  return resultArray;
	    }
}
