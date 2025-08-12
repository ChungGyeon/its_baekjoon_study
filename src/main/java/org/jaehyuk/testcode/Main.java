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

        int[] dect = new int [4];
        for(int i=0; i<DNA.length(); i++){
            if(DNA.charAt(i) == 'A') dect[0]++;
            if(DNA.charAt(i) == 'C') dect[1]++;
            if(DNA.charAt(i) == 'G') dect[2]++;
            if(DNA.charAt(i) == 'T') dect[3]++;
        }
        //애초에 개수 안맞는 예외처리
        if(dect[0]<minctn[0] || dect[1]<minctn[1] || dect[2]<minctn[2] || dect[3]<minctn[3]){
            System.out.println(0);
            return;
        }

        int start = 0, count = 0, end = 0;
        if(p==1) {
            end = 1;
        }
        else{
            end = p;
        }
        for(int i=0; i<(s-p)+1; i++){
            dect[0]=0;
            dect[1]=0;
            dect[2]=0;
            dect[3]=0;
            for(int j = start; j<end; j++){
                if(DNA.charAt(j) == 'A') dect[0]++;
                if(DNA.charAt(j) == 'C') dect[1]++;
                if(DNA.charAt(j) == 'G') dect[2]++;
                if(DNA.charAt(j) == 'T') dect[3]++;
            }
            if(dect[0]<minctn[0] || dect[1]<minctn[1] || dect[2]<minctn[2] || dect[3]<minctn[3]){
                start++;
                end++;
            }
            else{
                count++;
                start++;
                end++;
            }
        }
        System.out.println(count);
    }
}