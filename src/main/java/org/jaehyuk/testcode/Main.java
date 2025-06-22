package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int envelp=Integer.parseInt(sc.readLine());
        int cnt=0;
        while (true){
            if(envelp%5==0){
                cnt+=envelp / 5;
                break;
            }
            envelp-=3;
            cnt++;
            if(envelp<0){
                cnt=-1;
                break;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}