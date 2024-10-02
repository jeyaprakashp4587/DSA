import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofAnArray {
    
  public int[] sorts (int[] arr) {
    int [] sortArray = arr.clone();
       Arrays.sort(sortArray);
       HashMap <Integer,Integer> rank = new HashMap<>();
       int ranknum=1;
       for (int i = 0; i < sortArray.length; i++) {
        if (!rank.containsKey(sortArray[i])) {
            rank.put(sortArray[i], ranknum);
            ranknum++;
        }
       }
       for (int j = 0; j < sortArray.length; j++) {
         arr[j] = rank.get(arr[j]);
        // System.out.print(rank.get(arr[j]));
       }
       return arr;
  }
 
    public static void main(String[] args) {
         int [] arr = {100,100,100};
       RankTransformofAnArray rank = new RankTransformofAnArray();
      int[] result = rank.sorts(arr);
      for (int i : result) {
        System.out.println(i);
      }
       
    }
}