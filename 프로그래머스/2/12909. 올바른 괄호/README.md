# [level 2] 올바른 괄호 - 12909 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12909) 

### 성능 요약

메모리: 53.3 MB, 시간: 17.45 ms

### 구분

코딩테스트 연습 > 스택／큐

### 채점결과

정확성: 69.5<br/>효율성: 30.5<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 20일 21:32:12

### 문제 설명

<p>괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어</p>

<ul>
<li>"()()" 또는 "(())()" 는 올바른 괄호입니다.</li>
<li>")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.</li>
</ul>

<p>'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>문자열 s의 길이 : 100,000 이하의 자연수</li>
<li>문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>"()()"</td>
<td>true</td>
</tr>
<tr>
<td>"(())()"</td>
<td>true</td>
</tr>
<tr>
<td>")()("</td>
<td>false</td>
</tr>
<tr>
<td>"(()("</td>
<td>false</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1,2,3,4<br>
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges


### 나의 메모
처음 풀었을 땐 답은 나왔지만 효율성 테스트에서 탈락이 떴다.<br>
replace로 반복해가면서 ()를 찾고 바꿔치기 하는 방식으로 해서 더이상 바꿀 것이 없는 걸 찾고 그 상태에서 빈값인지 아닌지를 찾았다<br>
비효율적이래~
찾아보니 스택을 활용해서 해결했다.<br>

스택<br>
 - 후입선출(Last In First Out)
데이터를 쌓는 방식으로 생각하면 좋다<br>
제일 마지막에 들어간 데이터가 제일 위에 있어서 꺼낼때 제일 먼저 나온다.<br>

- 단방향 입출력 구조
- 하나씩만 넣고 뺄 수 있음
- 깊이 우선 탐색(DFS)에 이용
  
사용하는 방법을 몰랐는데, 이번 기회에 자료구조 공부를 하면서 사용법을 익혀야겠다.<br>
push() 넣기<br>
pop() 빼기<br>
clear() 다 지우기<br>
peek() 마지막 요소를 반환하고, 스택에는 변화를 주지 않는다<br>
empty() 스택의 비어있는지 여부를 true/false로 반환<br>
search() 요소가 스택에 어느 위치에 존재하는지 반환한다. 이때 인덱스가 아닌 나오는 순서로 알려준다. 존재하지 않으면 -1를 반환. 같은 요소가 있으면 마지막 위치를 반환

