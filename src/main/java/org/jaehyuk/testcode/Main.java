package org.jaehyuk.testcode;
import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        while(sc.hasNext()){
            String input= sc.nextLine();
            if(input.equals("-")) break;
            arr.add(input);
        }

        int max=0;
        for(String s: arr){
            max=Math.max(max,s.length());
        }

        for(int i=0; i<max; i++){
            for(int j=0; j<arr.size(); j++){
                if(i<arr.get(j).length()){
                    System.out.print(arr.get(j).charAt(i));
                }
            }
        }

    }
}