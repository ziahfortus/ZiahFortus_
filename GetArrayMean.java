import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int sum = 0;
        
        for (int i = 0; i<n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
    }
    
    double mean = GetArrayMean(numbers, n);
    System.out.printf("Mean of array is: %.2f", mean);
}

public static double GetArrayMean(int[] arr, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    return (double) sum / n;
}
}








