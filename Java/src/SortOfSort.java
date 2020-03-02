public class SortOfSort {
    public static void sortOfSort(int [] array){
        int swapMe = 0;     //holds the current largest item before overriding the array
        int SaveMe;         //takes the data before overriding the array
        int index = 0;      //holds the index that the largest item is taken from
        int largest = 0;    //counter for back of array
        int Smallest = 0;   //counter for front of array

        for(int i = 0; i < array.length - largest; i++){  //find the largest item in the array
            if((array[i]) > swapMe){
                swapMe = array[i];
                index = i;
            }
        }
        SaveMe = array[array.length];
        array[array.length] = swapMe;
        array[index] = SaveMe;
    }
}
