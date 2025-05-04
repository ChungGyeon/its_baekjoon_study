package org.jaehyuk.testcode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //과목명은 쓸모가 없다 그러니 그냥 넣고 말기만 해도 상관없겠네
        ArrayList<Float> credit=new ArrayList<>();
        ArrayList<String> grade=new ArrayList<>();
        try {
            while (sc.hasNext()) {
                String infoLine = sc.nextLine();
                String[] part = infoLine.split(" ");
                credit.add(Float.valueOf(part[1]));
                grade.add(part[2]);
            }
        }

        catch(Exception e){

        }

        double grade_sum=0;
        for(int i=0; i< credit.size(); i++){
            if(!grade.get(i).equals("P")){
                grade_sum+= credit.get(i);
            }
        }

        for(int i=0; i< grade.size(); i++){
            if(grade.get(i).equals("A+")) credit.set(i,(credit.get(i)*(float)4.5));
            else if(grade.get(i).equals("A0")) credit.set(i,(credit.get(i)*(float)4.0));
            else if(grade.get(i).equals("B+")) credit.set(i,(credit.get(i)*(float)3.5));
            else if(grade.get(i).equals("B0")) credit.set(i,(credit.get(i)*(float)3.0));
            else if(grade.get(i).equals("C+")) credit.set(i,(credit.get(i)*(float)2.5));
            else if(grade.get(i).equals("C0")) credit.set(i,(credit.get(i)*(float)2.0));
            else if(grade.get(i).equals("D+")) credit.set(i,(credit.get(i)*(float)1.5));
            else if(grade.get(i).equals("D0")) credit.set(i,(credit.get(i)*(float)1.0));
            else if(grade.get(i).equals("F")) credit.set(i,(credit.get(i)*(float)0.0));
            else{
                credit.set(i,(float)-1.0);
            }
        }
        float sum=0;
        for(int i=0; i<grade.size(); i++) {
            if(credit.get(i)>=0) sum += credit.get(i);
        }
        System.out.print(sum/(grade_sum));


        sc.close();
    }
}