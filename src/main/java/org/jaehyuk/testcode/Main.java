package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        double a = 0, b = 0;
        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());
        System.out.println(a / b);
        bf.close();
    }
}