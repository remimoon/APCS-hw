
import java.util.*;

public class Driver{

  public static int[] frontPiece(int[] nums) {
      int[] front2;
      front2 = new int[2];
      if (nums.length < 2) {
	  return nums;
	}
	else{
	    front2[0] = nums[0];
	    front2[1] = nums[1];
	    return front2;  
	}
  }

    public static int sum13(int[] nums) {
	int a = nums.length;
	int place = 0;
	int sum = 0;
	while(place<a){
	    if (nums[place] == 13){
		place+=2;
	    }else{
		sum+=nums[place];
		place++;
	    }
	}
	return sum;
    }

    public static void main(String[] args){
	int[] test1 = {1,2,3};
	System.out.println(frontPiece(test1));
	int[] test2 = {1, 2, 13, 2, 1, 13};
	System.out.println(sum13(test2));
    }
}
