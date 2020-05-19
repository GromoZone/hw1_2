package Hw1_2;

public class MainClassZagornov {
    //1
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //2
    public static void fillArray(String[] args) {
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;
        for (int x : arr1) System.out.print(x + " ");
    }

    //3
    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
            System.out.print(arr2[i] + " ");
        }
        //4
        public static void fillDiagonal () {
            int[][] arr3 = new int[7][7];
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0, j2 = arr3[i].length; j < arr3[i].length; j++, j2--) {
                    if (i == j || i == ( j2 - 1 )) arr3[i][j] = 1;
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.print("\r\n");
            }
        }
    }
}