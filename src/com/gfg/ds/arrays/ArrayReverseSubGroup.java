import java.util.Scanner;

class ArrayReverseSubGroup {

    public static int[] reverseArray(int[] arr, int low, int high) {
        int left = 0;
        int right = (high - low) / 2;
        while (left <= right) {
            int temp = arr[low + left];
            arr[low + left] = arr[high - left];
            arr[high - left] = temp;
            left++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = k - 1;
        while (high < n) {
            arr = reverseArray(arr, low, high);
            low = low + k;
            high = high + k;
        }
        arr = reverseArray(arr, low, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}