package com.mirea;
import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);

    public static int[][] input(int[][] a, int m, int n){
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
            System.out.print("\n");
        }
        return a;
    }

    public static String[][] input(String[][] a, int m, int n){
        System.out.println("Enter values: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = in.next();
            System.out.print("\n");
        }
        return a;
    }

    public static void output(int[][] a, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.print("\n");
        }
        return;
    }

    public static void output(String[][] a, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.print("\n");
        }
        return;
    }

    public static int[][] sort(int[][] a, int m, int n){
        int currPos=0;
        int buf;
        System.out.println("Enter a value to compare: ");
        int val=in.nextInt();
        for (int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(a[i][j]==val&&(currPos<n)){
                   buf = a[i][j];
                   a[i][j] = a[i][currPos];
                   a[i][currPos] = buf;
                   currPos++;
               }
           }
           currPos=0;
       }
        return a;
    }

    public static String[][] sort(String[][] a, int m, int n){
        int currPos=0;
        String buf;
        System.out.println("Enter a value to compare: ");
        String val=in.next();
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(a[i][j].equals(val)&&(currPos<n)){
                    buf = a[i][j];
                    a[i][j] = a[i][currPos];
                    a[i][currPos] = buf;
                    currPos++;
                }
            }
            currPos=0;
        }
        return a;
    }

    public static void main(String args[]) {
        int m,n;
        System.out.println("Enter the size of an array: ");
        m = in.nextInt();
        n = in.nextInt();
        System.out.println("To create an integer array press 1, to create char array press 2: ");
        int c;
        c = in.nextInt();
        switch(c){
            case 1:
                int[][] a = new int[m][n];
                input(a, m, n);
                sort(a, m, n);
                output(a, m, n);
                break;
            case 2:
                String[][] b = new String[m][n];
                input(b, m, n);
                sort(b, m, n);
                output(b, m, n);
                break;
            default:
                System.out.println("Wrong value!");
                return;
        }
        return;
    }
}
