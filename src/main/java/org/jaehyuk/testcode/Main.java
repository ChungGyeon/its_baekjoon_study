package org.jaehyuk.testcode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //N = 바구니
        //동시에 공도 그만큼
        //바구니에는 공을 1개만 넣을 수 있다.
        //M 앞으로 공을 몇번넣을지
        //첫번째줄 입력은 바구니의 수와, 앞으로 넣을 수
        //이후 줄은 ijk
        //i ~j :i부터 j까지의 바구니를 의미
        //k : 공의 숫자이다.
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] baskets=new int[N];

        int i,j,k=0;
        for(int q=0; q<N; q++){
            baskets[q]=0;
        }
        for(int z=0; z<M; z++){
            i=sc.nextInt();
            j=sc.nextInt();
            k=sc.nextInt();
            for(int q=i-1; q<j; q++){
                baskets[q]=k;
            }

        }
        for(int q=0; q<N; q++){
            System.out.print(baskets[q]+" ");
        }
        System.out.println('아');
    }
}