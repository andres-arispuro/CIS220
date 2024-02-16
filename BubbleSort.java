//Andres Ramos
//Chpt2 PA
public class BubbleSort{
    
    //sorting method implementing Bubble Sort
    public static void bubbleSort(int [] array, int n){
        for(int i = 0; i < n -1; ++i){  //outer loop to go through array
            for(int j = 0; j < n -1; ++j){  //inner loop to compare elements and swap
                if(array[j] > array[j+1]){  //compare adjacent elements
                    int bubble = array[j];  //swap values using temp variable or a bubble
                    array[j] = array[j+1];
                    array[j+1] = bubble;
                }
            }
        }
    }

    public static void main(String[]args){
        //initialize array
        int [] sampleArray = {93, 52, 72, 42, 3, 63, 100, 19, 61, 44, 21, 98, 6, 41, 78, 5, 51, 60, 67, 11};
        //declare n = length of array
        int n = sampleArray.length;

        //call bubbleSort method
        bubbleSort(sampleArray, n);

        //Print sorted array using for loop to traverse through sorted array
        System.out.print("The sorted array is: ");
        for(int i = 0; i < sampleArray.length; ++i){
            System.out.print(sampleArray[i] + " ");
        }
        System.out.println("");
    }

    

}