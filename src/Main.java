import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Ex: ");

        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            switch (a) {
                case 1 : main1(args);
                case 2 : main2(args);
                case 3 : main3(args);
                case 4 : main4(args);
            }
        }
    }

    public static void main1(String[] args) {
        
        float a = (float) 5.55, b = (float) 1.78, c, c1;
        int c2;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("A1: ");
            int a1 = in.nextInt();
            System.out.print("\nB1: ");
            int b1 = in.nextInt();

            System.out.print("\nA2: ");
            float a2 = in.nextFloat();
            System.out.print("\nB2: ");
            float b2 = in.nextFloat();

            // a=1 b=6 - c=1.24...
            c = (1 / (a * b * b - 2 * b)) + ((1 / (3 * a * a + 2)) * b);
            c1 = ((float) 1 / (a1 * b1 * b1 - 2 * b1)) + (((float) 1 / (3 * a1 * a1 + 2)) * b1);
            c2 = (int) ((1 / (a2 * b2 * b2 - 2 * b2)) + ((1 / (3 * a2 * a2 + 2)) * b2));
        }

        System.out.println("\nResult: \n1. " + c + "\n" + "2. " + c1 + "\n" + "3. " + c2 + "\n");

    }

    public static void main2(String[] args) {
        int n = 400, m = 200, c = n + m;

        try (Scanner in = new Scanner(System.in)) {
            Random rd = new Random();

            int[] A = new int[n];
            int[] B = new int[m];
            int[] C = new int[c];
            int[] D = new int[c];
            int[] E = new int[c];

            System.out.print("\nN: ");
            int n1 = in.nextInt();
            System.out.print("\nM: ");
            int m1 = in.nextInt();
            int c1 = n1 + m1;

            System.out.print("\nA: ");
            for (int i = 0; i < n1; i++) {
                A[i] = in.nextInt();
            }

            System.out.print("\nB: ");

            for (int i = 0; i < m1; i++) {
                B[i] = in.nextInt();
            }

            System.out.println("\n");

            int k = 0;
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    if (A[i] == B[j]) {
                        E[k++] = A[i];
                        break;
                    }
                }
            }

            System.out.print("\nSame el.: ");
            for (int i = 0; i < k; i++) {
                System.out.print(E[i] + " ");
            }

            int l = 0;

            for (int i = 0; i < n1; i++)
                for (int j = 0; j < k; j++) {
                    if (A[i] == E[j]) {
                        A[i] = -1;
                        break;
                    }
                }

            for (int i = 0; i < n1; i++) {
                if (A[i] != -1) {
                    C[l++] = A[i];
                }
            }

            System.out.print("\nA El: ");
            for (int i = 0; i < l; i++) {
                System.out.print(C[i] + " ");
            }

            for (int i = 0; i < m1; i++)
                for (int j = 0; j < k; j++) {
                    if (B[i] == E[j]) {
                        B[i] = -1;
                        break;
                    }
                }

            for (int i = 0; i < m1; i++) {
                if (B[i] != -1) {
                    C[l++] = B[i];
                }
            }

            System.out.print("\n\nResult: ");
            for (int i = 0; i < l; i++) {
                System.out.print(C[i] + " ");
            }
            System.out.print("\n\n");

        }

    }

    public static void main3(String[] args) {
        int N = 20;

        int[][] A = new int[N][N];
        int[] B = new int[N];

        try (Scanner in = new Scanner(System.in)) {
            Random rd = new Random();

            System.out.println("N: ");
            int n = in.nextInt();

            System.out.println("A: ");

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    A[i][j] = in.nextInt();
                }

            int k = 0;
            for (int i = 0; i <= n - 1; i++)
                for (int j = 0; j < n; j++) {
                    if ((A[i][j] == 1) && (A[i][j + 1] == 2) && (A[i][j + 2] == 3) && (A[i][j + 3] == 3)
                            && (A[i][j + 4] == 2) && (A[i][j + 5] == 1) && (A[i][j + 5] == 1)) {
                        B[k++] = i;
                    }
                }

            for (int i = 0; i <= n - 1; i++)
                for (int j = 0; j < n; j++) {
                    if ((A[i][j] == 1) && (A[i][j + 1] == 2) && (A[i][j + 2] == 3) && (A[i][j + 3] == 5)
                            && (A[i][j + 4] == 3) && (A[i][j + 5] == 2) && (A[i][j + 6] == 1)) {
                        B[k++] = i;
                    }
                }

            System.out.println("\nResult: ");
            for (int i = 0; i < k; i++) {
                System.out.print(B[i] + " ");
            }
            System.out.print("\n\n\n");
        }
    }

    public static void main4(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Text:");
            String text = in.nextLine();
            String[] words = text.split("[ ,.:;-?!]+");

            System.out.print("\nWords: ");
            for (String word : words) {
                System.out.print(word + " ");
            }

            String a = null;
            String r = " ";
            boolean t;
            int k = 0;

            for (int i = 0; i < words.length; i++) {
                t = false;
                r += words[i] +" ";
                String ch=words[i];
                for (int j = 0; j < ch.length()-1; j++) {
                    if (ch.charAt(j) == ch.charAt(j+1)) {
                        System.out.print("\n" + "C: " + ch.charAt(j) + " " + ch.charAt(j+1));
                        t = true;
                        a = words[i];
                        break;
                    }
                }

                if (t == true) {
                    r = r.replace(a, "");
                }
            }

            System.out.print("\n\nResult:");
            System.out.println(r);

        }
    }
}
