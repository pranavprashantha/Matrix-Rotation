import java.util.*;
//import java.util.Iterator;
class Main {
  public static void main(String[] args) {
    // int[] arr = {2,4,7,6,7,7};
    // int n = removeDuplicates(arr);
    // System.out.println(n);
    int[][] test = {{1,2,3}, {4,5,6}, {7,8,9}};
     System.out.println(Arrays.deepToString(rotateMatrix(test)));

    int n = 3;
    //System.out.println(n / 2);
    ArrayList<Integer> test2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    
    Iterator<Integer> iterate = test2.iterator();
    
    while(iterate.hasNext()) {
      
      int letter = iterate.next();
      System.out.println(letter);
      
    }
  }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
 
        int i = 0;
 
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
 
        return i + 1;
    }
    public static int[][] rotateMatrix(int[][] matrix) {
        
      int[][] fin = new int[matrix.length][matrix[0].length];
        
      for(int row = 0; row < matrix.length; row++) {
            
          for(int col = 0; col < matrix[0].length; col++) {
                
            fin[row][col] = matrix[matrix.length - col - 1][row];
            
          }
        
      }
    return fin;
    }
}