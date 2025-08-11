package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        double[] arr = new double[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }
        int start = 0, count = 0;
        int end = n-1, tmp = n-1;
        Arrays.sort(arr);
        double target = arr[end];
        try {
            while (start < end) {
                if (target == arr[start] + arr[end]) {
                    end--;
                    tmp--;
                    target = arr[tmp];
                    count++;
                } else if (target < arr[start] + arr[end]) {
                    end--;
                } else if (target > arr[start] + arr[end]) {
                    start++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(count);

    }
}
//1 2 3 4 5 7