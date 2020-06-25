package leetCode;
/*
 * Given a binary array, 
 * find the maximum number of consecutive 1s 
 * in this array.
 */


public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int i, oneCount = 0, arrayCount = 0;
        int len = nums.length; 
        int oneCountArray[] = new int[len+1];
        
        for(i=0; i<len; i++) {
        	if(nums[i] == 1) {
        		oneCount += 1;
        	}
        	else if(nums[i] != 1) {
        		
        		oneCountArray[arrayCount] = oneCount;
        		arrayCount += 1;
        		oneCount = 0;
        	}
        }
        arrayCount += 1;
    	oneCountArray[arrayCount] = oneCount;
    	
    	
        int count = maxOfArray(oneCountArray);
        return count;
    }
	
	
	int maxOfArray(int[] array) {
		int i, largest = array[0], len = array.length;
		
		
		for(i=0; i<len; i++) {
			if(largest < array[i]) largest = array[i];
		}
		return largest;
	}
}

