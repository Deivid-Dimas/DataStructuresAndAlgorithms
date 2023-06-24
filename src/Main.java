import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random random = new Random();
        for ( int i = 0 ; i < arr.length ; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Starting QuickSort!");
        QuickSort.quickSort(arr);
        for ( int i = 0 ; i < arr.length ; i++){
            System.out.print(" " + arr[i]);
        }
    }

}