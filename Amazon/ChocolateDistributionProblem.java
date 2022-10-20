import java.util.*;

public class ChocolateDistributionProblem {

	//m here is no. of students
	static int findMinDiff(int arr[], int n, int m)
	{
		//for no chocolates or no students
		if (m == 0 || n == 0)
			return 0;

		// to sort the packets
		Arrays.sort(arr);

		// to check that packets are not more than no. of students
		if (n < m)
			return -1;

		// Highest number of chocolates
		int min_diff = Integer.MAX_VALUE;

		/* Find the subarray of size of total
		   students such that difference between
		   last and first elements of
		   subarray is minimum.*/

		for (int i = 0; i + m - 1 < n; i++) {
			int diff = arr[i + m - 1] - arr[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		return min_diff;
	}

	//Main function
	public static void main(String[] args)
	{
		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30,
					40, 28, 42, 30, 44, 48, 43, 50 };

		int m = 7; // Number of students

		int n = arr.length;
		System.out.println("Minimum difference is "
						+ findMinDiff(arr, n, m));
	}
    
}
