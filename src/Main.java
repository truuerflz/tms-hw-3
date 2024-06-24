public class Main {
    public static void main(String[] args) {

        ArrayActions array = new ArrayActions();

        int[] arr1 = {4, -3, 0, 6, 7, 4, 5, 10, -8, 2};
        array.maxAndMin(arr1);

        int[] arr2 = {4, -3, 0, 6, 7, 4, 5, 10, -8, 2};
        array.evenAndOdd(arr2);

        int[] arr3 = {444, -375, 17, 666666, 77, 41212, 5, 10000000, -8367, 22};
        array.longestAndShortest(arr3);

        int[] arr4 = {12345, 367, 41, 5, 89, 923, 345, 6123, 222, 189, 23456789, 8654, 4235653};
        array.incrementOrder(arr4);

        int[] arr5 = {7, 3, 4, 5, 8, 9, 3, 6, 2, 1, 2, 8, 4, 5};
        array.incrementOrderExtra(arr5);

        int[] arr6 = {12321, 367, 41, 5, 89, 989, 345, 6116, 222, 189, 23456789, 8656568};
        array.palindrome(arr6);

    }
}