package org.jaehyuk.testcode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double[] grade_list=new double[N];
        for(int i=0; i<N; i++){
            grade_list[i]=sc.nextInt();
        }
        double M=0;
        for(int i=0; i<N; i++){
            if(M<grade_list[i]){
                M= grade_list[i];
            }
        }


        for(int i=0; i<N; i++) grade_list[i] = (grade_list[i] / M) * 100;

        double New_grade=0;
        for(int i=0; i<N; i++){
            New_grade+=grade_list[i];
        }
        System.out.print(New_grade/grade_list.length);
    }
}