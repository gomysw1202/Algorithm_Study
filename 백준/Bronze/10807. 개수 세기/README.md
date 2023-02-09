# [Bronze V] 개수 세기 - 10807 

[문제 링크](https://www.acmicpc.net/problem/10807) 

### 성능 요약

메모리: 14328 KB, 시간: 128 ms

### 분류

구현(implementation)

### 문제 설명

<p>총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.</p>

### 출력 

 <p>첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.</p>


### 나의 노트

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] K = new int[201];
		for(int i=0; i<N ;i++) 
			K[sc.nextInt()+100]++;
		System.out.println(K[sc.nextInt()+100]);
	}
}

index가 201인 이유는 정수의 범위가 -100에서 100까지인데 -100에서 0까지 숫자의 위치를 index 0에서 100를 주고,
1부터 100을 index 101에서 200인 것이다. 
K[sc.nextInt()+100]++; 입력한 숫자의 100을 더해서 해당 숫자의 위치에 1씩 증가를 해주고, 
K[sc.nextInt()+100] 마지막에 찾을려고 하는 숫자를 입력해 해당 숫자 위치에 있는 증가된 수를 출력해준다.

이렇게 쓰면 굳이 주지 않아도 될 배열 메모리를 사용하게 된다.
처음에 배열에 들어가 있는 값들은 다 0인데, 숫자의 위치라고 말해서 배열마다 해당 숫자값이 들어갔다고 혼자 생각함...
코드를 봐도 그런 작업이 없었는데... 하나씩 잘 
