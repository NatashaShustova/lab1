public class lab1 {
	public static void main(String[] args) {
		int[] nums = {15, 10, 51, 6, 5, 3, 10, -34, 0, 32, 56, 12, 24, 52};
		int i = nums.length;
		int[] a = new int[i];
		int y = i-1;
		for (int x = 0; x < i; x++) {
		    while (y >= 0) {
		        a[x] = nums[y];
		        System.out.println(a[x]);
		        y--;
		    }
		}
	}
}


