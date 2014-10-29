public int sum67(int[] nums) {
    boolean test = false;
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
	if (test == true){
	    if (nums[i] == 7){
		test = false;
	    }
	} else {
	    if (nums[i] == 6) {
		test = true;
	    }else {
		sum= sum + nums[i];
	    }
	}
    }
  return sum;
}


public boolean more14(int[] nums) {
    int four = 0;
    int one = 0;
    for (int i = 0; i < nums.length; i++){
	if (nums[i] == 4){
	    four ++;
	}else{
	    if (nums[i] == 1){
		one ++;
	    }
	}
    }
    if (one > four) {
	return true;
    } else {
	return false;
    } 
}
