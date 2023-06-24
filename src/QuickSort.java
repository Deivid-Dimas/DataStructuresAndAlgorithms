public class QuickSort {

    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length - 1);
    }
    public static void quickSort(int[] arr, int lowIndex, int highIndex){
        if (lowIndex >= highIndex){
            return;
        }
        //pickup the pivot
        int pivot = arr[highIndex];
        //define Pointers L and R
        int leftPointerIndex = lowIndex;
        int rightPointerIndex = highIndex;
        //loop the remaining array
        while ( leftPointerIndex < rightPointerIndex){
            // find the Left bigger than pivot
            while (arr[leftPointerIndex] <= pivot && leftPointerIndex < rightPointerIndex){
                leftPointerIndex++;
            }
            // Find the rigth pointer lower than pivot
            while (arr[rightPointerIndex] >= pivot && leftPointerIndex < rightPointerIndex ){
                rightPointerIndex--;
            }
            //swap pointers
            swap(arr,leftPointerIndex, rightPointerIndex);
        }
        //swap pivot
        swap(arr, leftPointerIndex, highIndex);
        //call left side array recursive
        quickSort(arr, lowIndex, leftPointerIndex - 1);
        //call right side array recursive
        quickSort(arr, leftPointerIndex + 1 , highIndex);

    }

    private static void swap(int[] array , int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
