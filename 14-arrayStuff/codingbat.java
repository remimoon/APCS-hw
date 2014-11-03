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

public boolean tripleUp(int[] nums) {
    if (nums.length < 3){
	return false;
    }
    for (int i = 0; i < nums.length-2; i++){
	int first = nums[i];
	int second = nums[i+1];
	int third = nums[i+2];
	if ( (first+1==second) && (second+1==third) ) {
	    return true;
	}
    }
    return false;
}

public int[] seriesUp(int n) {
	int place=0;
	int[] s = new int[n*(n+1)/2];
	for(int i=0; i<=n; i++){
	    for(int j=1; j<=i; j++){
		s[place] = j;
		place += 1	    }
	}
	return s;
    }

maxmirror??? very confused

    public int maxMirror(int[] nums) {
	if(nums.length==0) return 0;
	int output=1;
	for(int i=0; i<nums.length; i++){
	    for(int x=i+1; x<nums.length; x++){
		if(nums[i]==nums[x]){
		    output ++;
		}
	    }
	}
	return output;
}

public boolean canBalance(int[] nums) {
    int first = 0;
    int sum = 0;

    for (int i = 0; i < nums.length; i++){
	sum += nums[i];
    }

    int half = (sum)/2;

    if (sum % 2 != 0){
	return false;

    } else {
    
    for (int i = 0; first < half; i++){
	first += nums[i];
	if (first == half){
	    return true;
	}
    }
    return false;
    }
}
