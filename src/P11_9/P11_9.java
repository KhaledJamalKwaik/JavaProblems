package P11_9;

import java.util.Scanner;
import java.util.ArrayList;

public class P11_9 {
 
    public static void main(String[] args) {

        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        fillArray(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " ");
            
            System.out.println();
        }


        ArrayList<Integer> rowsSums = rowsSums(arr);
        ArrayList<Integer> colsSums = colsSums(arr);

        ArrayList<Integer> maxRowsIndcies = new ArrayList<>();
        ArrayList<Integer> maxColsIndcies = new ArrayList<>();

        int maxRowValue = java.util.Collections.max(rowsSums);
        int maxColValue = java.util.Collections.max(colsSums);

        // Get the indecies of the largest rows
        for (int i = 0; i < rowsSums.size(); i++)
            if (rowsSums.get(i) == maxRowValue)
                maxRowsIndcies.add(i);

        // Get the indecies of the largest columns 
        for (int i = 0; i < colsSums.size(); i++)
            if (colsSums.get(i) == maxColValue)
                maxColsIndcies.add(i);

        
        System.out.print("The largest row index: " + maxRowsIndcies.toString());
        System.out.print("\nThe largest column index: " + maxColsIndcies.toString());


    }


    public static void fillArray(int[][] x) {

        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x.length; j++)
                x[i][j] = (int) (Math.random() * 2);

    }


    public static ArrayList<Integer> rowsSums(int[][] x) {

        ArrayList<Integer> rowSums = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {

            int rowSum = 0;
            for (int j = 0; j < x[i].length; j++) 
                rowSum += x[i][j];
            
            rowSums.add(i, rowSum);
        }

        return rowSums;
    }


    public static ArrayList<Integer> colsSums(int[][] x) {

        ArrayList<Integer> colSums = new ArrayList<>();

        for (int i = 0; i < x.length; i++) {

            int colSum = 0;
            for (int j = 0; j < x.length; j++) 
                colSum += x[j][i];
            
            colSums.add(i, colSum);
        }

        return colSums;

    }
    

}
