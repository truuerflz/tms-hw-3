public class ArrayActions {

    void maxAndMin(int[] arr) {
        System.out.println("MAX AND MIN TASK");
        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max number from array: " + max + "; min: " + min);
        System.out.println();
    }

    void evenAndOdd(int[] arr) {
        System.out.println("EVEN AND ODD TASK");
        System.out.print("Even numbers: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i : arr) {
            if (i % 2 == 1 || i % 2 == -1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void longestAndShortest(int[] arr) {
        System.out.println("LONGEST AND SHORTEST TASK");
        int longestIndex = 0, shortestIndex = 0;
        int longestDigit = 0, shortestDigit = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int digit = 0;
            while (elem != 0) {
                elem = elem / 10;
                digit++;
            }

            if (digit > longestDigit) {
                longestIndex = i;
                longestDigit = digit;
            }
            if (digit < shortestDigit) {
                shortestIndex = i;
                shortestDigit = digit;
            }
        }

        System.out.println("Longest number: " + arr[longestIndex] + ", shortest: " + arr[shortestIndex]);
        System.out.println();
    }

    void incrementOrder(int[] arr) {
        System.out.println("INCREMENT ORDER TASK");
        for (int i = 0; i < arr.length; i++) {
            boolean isIncrement = true;
            int num = arr[i];

            while (num > 9) {
                int elem = num % 10;
                num = num / 10;
                if (num % 10 + 1 != elem) {
                    isIncrement = false;
                    break;
                }
            }

            if (isIncrement) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
    }

    void incrementOrderExtra(int[] arr) {
        System.out.println("INCREMENT ORDER EXTRA TASK");
        boolean beginOfRow = true;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] - 1) {

                if (beginOfRow) {
                    System.out.print(arr[i] + " " + arr[i + 1] + " ");
                    beginOfRow = false;
                } else {
                    System.out.print(arr[i + 1] + " ");
                }

            } else if (!beginOfRow) {
                beginOfRow = true;
                System.out.println();
            }
        }
        System.out.println();
    }

    void palindrome(int[] arr) {
        System.out.println("PALINDROME TASK");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int numLength = 0;
            while (num != 0) { //length of number
                numLength++;
                num = num / 10;
            }

            num = arr[i];
            boolean isPalindrome = true;
            for (int j = 0; j < numLength / 2; j++) { //palindrome check
                int head = num / (int) Math.pow(10, numLength - 2 * j - 1);
                int tail = num % 10;
                num = num % (int) Math.pow(10, numLength - 2 * j - 1);
                num /= 10;

                if (head != tail) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(arr[i]);
            }

        }
        System.out.println();
    }

}
