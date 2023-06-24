
public class MergeSort {

    public static void mergeSort(int[] array){

        if (array.length < 2){
            return;
        }
        int middle = array.length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length - middle];

        for (int i = 0 ; i < middle ; i++){
            leftArray[i] = array[i];
        }
        for (int i = middle ; i < array.length ; i++){
            rightArray[i - middle] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array,leftArray,rightArray);
    }
    private static void merge(int[] array, int[] leftArray, int[] rightArray){

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int left_I = 0 , right_I = 0, mainIndex = 0;

        while( left_I < leftArraySize && right_I < rightArraySize) {

            if (leftArray[left_I] <= rightArray[right_I]) {

                array[mainIndex] = leftArray[left_I];
                left_I++;

            } else {

                array[mainIndex] = rightArray[right_I];
                right_I++;

            }
            mainIndex++;



        }
        while (left_I < leftArraySize) {
            array[mainIndex] = leftArray[left_I];
            left_I++;
            mainIndex++;
        }

        while (right_I < rightArraySize){
            array[mainIndex] = rightArray[right_I];
            right_I++;
            mainIndex++;
        }

    }

}
