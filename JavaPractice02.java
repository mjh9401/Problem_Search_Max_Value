package JavaExam02;

import java.util.*;

public class JavaPractice02 {
//		[제약 사항]
//	    각 수는 0 이상 10000 이하의 정수이다.
	
//		[입력]
//		가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//		각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스의 개수 입력
		int t = sc.nextInt(); 
		// 배열
		int arr[][] = new int[t][10]; 
		int max = 0;
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<10;j++) {
				// 숫자 입력받기
				int num= sc.nextInt();
				// 배열에 숫자입력
				if(num >=0 && num <=10000) {
					arr[i][j] = num;
				}
				// 비교
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println("#"+(i+1)+" "+max);
			max=0;
		}
	}
}
