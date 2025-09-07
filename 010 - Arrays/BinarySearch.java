import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int nums[], int key) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == nums[mid]) {
                return mid;
            }
            else if (key < nums[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {40, 30, 60, 70, 20, 100};
        int key = 70;
        Arrays.sort(nums);
        int result = binarySearch(nums, key);
        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

// For Binary Search Array must be sorted
//  Time complexity - O(log n)
// In each iteration, the algorithm halves the search space.

