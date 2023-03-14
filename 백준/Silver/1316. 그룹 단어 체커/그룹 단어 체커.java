import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 단어의 개수
        int cnt = 0;

        for (int i = 0; i < n; i++) { // 단어의 개수 만큼 반복
            String str = sc.next(); // 단어 입력 받기
            boolean check[] = new boolean[26]; // 알파벳 소문자 수 만큼 배열 생성
            boolean tmp = true; // 그룹단어 여부 확인용

            for (int j = 0; j < str.length(); j++) {
                int index = str.charAt(j)-'a'; // 소문자 배열 위치 구하기
                if(check[index]) { // 만약 이전에 같은 문자가 존재 했다라면
                    if(str.charAt(j) != str.charAt(j-1)) { // 앞글자가 같은 문자가 아니라면 
                        tmp = false; // 그룹 단어가 아님
                        break;
                    }
                }else { // 이전에 같은 문자가 존재 하지 않았더라면
                    check[index] = true; // 문자가 존재했다는 걸 표시하기
                }
            }
            if(tmp) { // 그룹 문자라면
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}