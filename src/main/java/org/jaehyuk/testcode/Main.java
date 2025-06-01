package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int T=Integer.parseInt(bf.readLine());
        for(int i=0; i<T; i++){
            String[] tar = bf.readLine().split(" ");
            for(int j=0; j<tar.length; j++){
                if(tar[j].length()==1) {
                    bw.write(tar[j]+" ");
                    continue;
                }
                char[] tar2=new char[tar[j].length()];
                for(int k=0; k<tar2.length; k++){
                    tar2[k]=tar[j].charAt(tar[j].length()-1-k);
                }
                for(int k=0; k<tar2.length; k++){
                    bw.write(tar2[k]);
                }
                if(j==tar.length-1) continue;
                else bw.write(" ");
            }
            bw.write("\n");
        }
        bw.close();
        bf.close();
    }
}