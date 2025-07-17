package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;
/*
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

범위
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int S[] = new int[N];

        for (int i = 0; i< N; i++){
            A[i] = sc.nextInt();
        }
        S[0]=A[0];
        for(int i = 1; i < N; i++){
            S[i]=S[i-1]+A[i];
        }
        int i=0;
        int j=0;
        for(int k=0; k<M; k++){
            i=sc.nextInt();
            j=sc.nextInt();
            i-=1;
            j-=1;
            if(i==0){
                System.out.println(S[j]);
            }
            else {
                System.out.println(S[j] - S[i - 1]);
            }
        }
        sc.close();
    }
}