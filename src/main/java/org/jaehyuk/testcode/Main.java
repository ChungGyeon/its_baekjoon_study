package org.jaehyuk.testcode;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        double[] arr = new double[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        int start = 0, count = 0, tmp = 0;
        int end = n - 1;
        Arrays.sort(arr);
        double target = arr[tmp];
        for(int i=0; i<n; i++){
            start=0;
            end=n-1;
            target = arr[i];
         while (start < end) {
            if (target == arr[start] + arr[end]) {
                if(start != i && end != i ){
                    count++;
                    break;
                }
                else if (start == i){
                    start++;
                }
                else if (end == i){
                    end--;
                }
            } else if (target < arr[start] + arr[end]) {
                end--;
            } else{
                start++;
            }
            }
        }
        System.out.println(count);

    }
}

/*
* 주요 문제점
* 1.타겟 선택 방식이 잘못 됨
* 모든 수를 타겟으로 검색해야한다.
*
* 2.중복값 처리 로직 오류
* arr[start] ==arr[start+1]은 start+1이게 배열의 범위를 벗어날 수 있음?
* 이건 while문 조건으로 일어나지 않을 일이고
*
* 3.투 포인터 알고리즘 구현 오류
* 타겟이 바뀔때마다 포인터를 초기화 해야한다.
* 현재는 이전 상태를 유지하고 있다
*
* 4. 자신 자신을 사용하는 경우 처리 부족
* 타겟 수 자체는 합을 만들때 사용하면 안된다.
*
* 3번이 가장 이 문제에 적절할거 같은데?
* 1번은 내가 끝에서부터 시작하는걸 지적한거야,근데 이것도 문제 없는거 아닌가?
* 인덱스 0 부터 시작하게 하는건 문제가 있지, 지금 코드로는
* 만약 0부터 시작해서 아무것도 안맞는다면 target을 늘리고 하는 식으로 가야겠네
*
* 위 조건대로 해봐도 안되서 답지 보고 만듬*/