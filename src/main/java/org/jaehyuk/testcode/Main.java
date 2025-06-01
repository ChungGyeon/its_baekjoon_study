package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int cnt=Integer.parseInt(sc.readLine());
        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<cnt; i++){
            String order=sc.readLine().trim();
            String[] part=order.split("\\s+");
            switch (part[0]) {
                case "push":
                    int a=Integer.parseInt(part[1]);
                    stack.push(a);
                    break;
                case "pop":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty()) System.out.println(1);
                    else  System.out.println(0);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}