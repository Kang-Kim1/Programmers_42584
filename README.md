# Programmers_42584
## 프로그래머스 - 주식가격(https://programmers.co.kr/learn/courses/30/lessons/42584#)

프로그래머스 큐/스택 연습문제.  
Input으로 주어지는 Price를 객체화하여 index정보를 함께 입력하였다.  
시간복잡도가 O(n^2)로 효율성 파트를 걱정했으나 문제없이 통과...  

실행 순서는 다음과 같다 :   
1. price와 index를 인스턴스 변수로 하는 Price class 정의
2. Queue<Price> que에 input price + index 입력
3. 금액 비교 후, 가격이 떨어지지 않은 Price를 저장할 Queue<Price> container 생성
4. input이 입력된 Queue가 빌 때까지
    1. Input Queue 첫번째 Price 꺼내기(삭제) > polled 변수에 입력
    2. container 내 데이터 하나씩 꺼내며 가격 polled와 비교 
        *  polled와 같거나 작을 경우 > index 변수값을 이용하여 ret 배열 업데이트 + container에 다시 추가
        *  polled보다 더 클 경우 > index 변수값을 이용하여 ret 배열 업데이트
    3. container에 polled(1.에서 빼낸 Price) 추가
5. ret 배열 반환
