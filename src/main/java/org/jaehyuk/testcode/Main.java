package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        String DNA = bf.readLine(); //역시 문자열은 이게 맞아

        int[] minctn = new int [4]; //최소개수 저장배열
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<4; i++){
            minctn[i] = Integer.parseInt(st.nextToken());
        }

        int[] dect = new int[4];
        int count = 0;


        for(int i=0; i<p; i++){
            if(DNA.charAt(i)=='A') dect[0]++;
            if(DNA.charAt(i)=='C') dect[1]++;
            if(DNA.charAt(i)=='G') dect[2]++;
            if(DNA.charAt(i)=='T') dect[3]++;
        }
        if(dect[0]>=minctn[0] && dect[1]>=minctn[1] && dect[2]>=minctn[2] && dect[3]>=minctn[3]) count++;

        for(int i=p; i<s; i++){
            char tmp = DNA.charAt(i-p);
            if(tmp=='A') dect[0]--;
            if(tmp=='C') dect[1]--;
            if(tmp=='G') dect[2]--;
            if(tmp=='T') dect[3]--;

            tmp = DNA.charAt(i);
            if(tmp=='A') dect[0]++;
            if(tmp=='C') dect[1]++;
            if(tmp=='G') dect[2]++;
            if(tmp=='T') dect[3]++;
            if(dect[0]>=minctn[0] && dect[1]>=minctn[1] && dect[2]>=minctn[2] && dect[3]>=minctn[3]) count++;
        }
        System.out.println(count);
    }
}