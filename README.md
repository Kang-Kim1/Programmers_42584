# Programmers_42584
## 프로그래머스 - 더 맵게(https://programmers.co.kr/learn/courses/30/lessons/42626)

프로그래머스 Heap 문제  
PriorityQueue를 이용하여 가장 가중치가 낮은 값을 업데이트하며 쉽게 풀 수 있었다.  

실행 순서는 다음과 같다 :   
1. 오름차순 정렬을 기본으로하는 PriorityQueue pQueue에 input 입력
2. 가장 낮은 스코빌지수가 K이상일 경우 0 반환(섞어볼 필요도 없는 케이스)
3. pQueue 내 가장 낮은 스코빌지수가 K 미만이며, 크기가 2 이상일 때 까지
    1. 가장 낮은 2개 값 poll하여 섞음(가장 덜 매운 스코빌 지수 + (두 번째로 덜 매운 스코빌 지수  * 2))
    2. 섞어 나온 값 pQueue에 입력
    3. answer값 증가
4. pQueue의 가장 낮은 시코빌지수가 K보다 작을 경우 -1 반환(섞을만큼 섞어봤지만 K보다 커질 수 없는 케이스)
5. answer 반환

