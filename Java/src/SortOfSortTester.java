import org.junit.Test;
public class SortOfSortTester {
    public static void main(String[] args) {
        //array test 1 will check if the method works properly with an odd length array
        int [] test1 = {10, 5, 8, 1, 3, 4, 6};
        new SortOfSort(test1);
        //array test 2 will check for the main functionality of the method to know if it works or not
        int [] test2 = {1, 2, 3, 4, 5, 6};
        SortOfSort(test2);
        //array test 3 will use negative numbers
        int [] test3 = {-5, -100, -25, -30, -78, 91, -43, -67, -82};
        SortOfSort(test3);
        //array test 4 is to test what happens if all inputs are equal
        int [] test4 = {1, 1, 1, 1, 1, 1, 1, 1};
        SortOfSort(test4);
        //array 5 is to see with an array if 1 and empty array
        int [] test5 = {};
        SortOfSort(test5);
    }
}
