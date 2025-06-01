package org.jaehyuk.testcode;
import java.util.*;

public class Main {

    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int cnt=sc.nextInt();
        boolean[][] paper=new boolean[100][100];
        for(int i=0; i<cnt; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            for(int height=x; height<x+10; height++){
                for(int width=y; width<y+10; width++){
                    paper[height][width]=true;
                }
            }
        }

        cnt=0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(paper[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
    }
}