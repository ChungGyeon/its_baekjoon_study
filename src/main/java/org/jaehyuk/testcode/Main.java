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

        int count = 0;
        for(int i=0; i<(s-p)+1; i++) {
            String tmp = DNA.substring(i, i + p);
            if ((tmp.length() - tmp.replace("A", "").length()) < minctn[0]){
                continue;
            }
            if ((tmp.length()-tmp.replace("C", "").length()) < minctn[1]) {
                continue;
            }
            if((tmp.length() - tmp.replace("G", "").length()) < minctn[2]){
                continue;
            }
            if((tmp.length() - tmp.replace("T", "").length()) < minctn[3]){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}

