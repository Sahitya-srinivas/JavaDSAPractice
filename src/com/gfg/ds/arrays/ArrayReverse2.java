import java.util.Scanner;

class ArrayReverse2 {

    public static int[] reverseArray(int[] arr, int n) {
        int temp;
        for (int i = 0, j = n - 1; i <= j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static int[] reverseArray2(int[] arr, int n) {
        for (int i = 0; i <= (n - 1) / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(n - 1) - i];
            arr[(n - 1) - i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        result = reverseArray(arr, n);
        for (int j = 0; j < n; j++) {
            System.out.print(result[j] + " ");
        }
        sc.close();
    }
}
