public class lab1 {
	public static void main(String[] args) {
		int[] nums = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, 52};
		int[] resultM = new int[nums.length];
		String resultS="";
		int j=0;
		int zerosCount =0;
		for (int i=0; i<nums.length; i++) {
		    if (nums[i] != 0) {
		        resultM[j]=nums[i];
		        j++;
		    } else {
		        resultM[resultM.length-1-zerosCount]=nums[i];
		        zerosCount++;
		    }
		}
		for (int i = 0; i< resultM.length; i++) {
		    resultS=(resultS + resultM[i] + " ");
		}
		System.out.println(resultS);
	}
}


