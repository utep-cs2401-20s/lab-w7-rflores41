public class SortOfSort {
    public static void SortOfSort(int [] array){
        int swapMe = 0;     //holds the current largest item before overriding the array
        int SaveMe = 0;     //takes the data before overriding the array
        int index = 0;      //holds the index that the largest item is taken from
        int lCounter = 0;   //counter for left side of array
        int rCounter = 0;   //counter for right side of array

        while(lCounter + rCounter != array.length){
            sortRight(array, rCounter, lCounter, swapMe, index, SaveMe);
            sortRight(array, rCounter, lCounter, swapMe, index, SaveMe);
            sortLeft(array, rCounter, lCounter, swapMe, index, SaveMe);
            sortLeft(array, rCounter, lCounter, swapMe, index, SaveMe);
        }
    }

    public static void sortRight(int [] array, int rCounter, int lCounter, int swapMe, int index, int SaveMe){
        for(int i = 0 + lCounter; i < array.length - rCounter; i++){
            if((array[i])> swapMe){
                swapMe = array[i];
                index = i;
            }
        }
        SaveMe = array[array.length - rCounter];
        array[array.length - rCounter] = swapMe;
        array[index] = SaveMe;
        rCounter++;
    }

    public static void sortLeft(int [] array, int rCounter, int lCounter, int swapMe, int index, int SaveMe){
        for(int i = 0 + lCounter; i < array.length - rCounter; i++){
            if((array[i] > swapMe)){
                swapMe = array[i];
                index = i;
            }
        }
        SaveMe = array[lCounter];
        array[lCounter] =  swapMe;
        array[index] = SaveMe;
        lCounter++;
    }
}
