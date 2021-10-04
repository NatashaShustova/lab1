public class lab1 {
	public static void main(String[] args) {
		int[] nums = {1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
		int i = nums.length;
		int sum = 0, sum2 = 0, sum3 = 0, y = 0, col_plus = 0, col_minus = 0, sr_arif = 0;
		for (int x = 0; x < i; x++){
		    if (nums[x] > 0) {
		        col_plus += 1;
		        sum += nums[x];
		        if (nums[x] > y) {
		            y = nums[x];
		        }
		    } else if (nums[x] < 0) {
		        col_minus += 1;
		        if (nums[x]%2 == 0) {
		            sum2 += nums[x];
		        }
		        sum3 += nums[x];
		        sr_arif = sum3/col_minus;
		    } 
		}
		System.out.println("Сумма положительных элементов массива: " + sum);
		System.out.println("Сумма отрицательных чётных элементов массива: " + sum2);
		System.out.println("Максимальное значение: " + y);
		System.out.println("Количество положительных элементов: " + col_plus);
		System.out.println("Среднее арифметическое отрицательных элементов: " + sr_arif);
	}
}


