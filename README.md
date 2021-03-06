# Algorithm
Algorithm solution
<img width="1064" alt="Algorithm_map" src="https://user-images.githubusercontent.com/25919167/98776436-4173b980-2432-11eb-97e4-f45f73a17b16.png">

***
## HackerRank, Programmers, BaekJoon
- Stack/Queue
- Hash
- Heap
- Sorting
- Brute-force 완전탐색
- Greedy
- Dynamic Programming
- DFS/BFS
- BinarySearch
- Etc. (Implementation, Search, String)

***
## Daily : 파이썬 알고리즘 인터뷰
  - YouTube: https://www.youtube.com/watch?v=fNyGHpSWhTA
  - Git: https://github.com/onlybooks/algorithm-interview

### 1. 문자열
- 문자열 조작 문제는 '슬라이싱[]' 이 속도 면에서 매우 빠름
- 팰린드롬 = str[::-1]
  - 가장 긴 팰린드롬 문제는 `투 포인터`를 활용한 expand()함수 사용하기
  - expand() : left, right idx가 같은 문자열일 경우, 윈도우 크기를 좌우로 1씩 넓혀 가며 팰린드롬 여부 확인하는 함수
- 여러 개의 기준으로 문자열 or 리스트 sorting 하기 
  - [stackoverflow](https://stackoverflow.com/questions/4233476/sort-a-list-by-multiple-attributes)
  - list.sort(key=lambda x : (x.split()[1:], x.split()[0]))
- anagram을 판단하는 가장 간단한 방법: 정렬하여 비교

### 2. 배열
- 정렬된 배열에서 탐색의 범위 좁힐 땐 `투 포인터`‼️  

### 3. 연결리스트
- 리스트 : q.pop(0)에서 속도 문제
  - 동적 배열로 구성된 리스트는 맨 앞 아이템을 가져오기에 적합한 자료형이 아니다 (Shifting으로 인해 시간 복잡도 = O(n) )
  - python의 `Deque`는 `이중연결리스트` 구조로 양쪽 방향 모두 추출하는 데 시간 복잡도 O(1) 에 실행된다

### 4. 스택, 큐
- 스택 활용 문제
  - 비교해야 할 횟수 줄일때
    - 일단 stack 에 넣고, stack[-1], stack.pop() 최대한 활용
    
### 5. 데크, 우선순위 큐
- 우선순위 큐: 어떠한 특정 조건에 따라 `우선순위`가 가장 높은 요소가 추출되는 자료형
  - Python에서 우선순위 큐 관련 문제는 대부분 `heapq`를 사용
  
### 6. 해시 테이블
- python Dictionary 해시 테이블로 구현되어 있음: `collections.defaultdict`
  - 존재하지 않는 키를 조회할 경우 자동으로 디폴트 생성
  
### 7. 그래프
- 그래프 순회 : DFS, BFS
  - DFS : 재귀, 반복(stack)
  - BFS : 반복 (queue)
  
| 코드 | DFS | BFS |
| ------ | ------ | ------ |
|discovered 초기화|[  ]|[start_v]|
|v|stack.pop()|queue.pop(0)|
|1st 작업|if v not in discovered|for w in graph[v]|
|2nd |for w in graph[v]|if not w in discovered|
|discover에 값 추가|discover.append(v)| discover.append(w)|

- 백트래킹: 백트래킹은 해결책에 대한 후보를 구축해 나아가다 가능성이 없다고 판단되는 즉시 후보를 포기(backtrack)해 정답을 찾아가는 알고리즘(`제약 충족` 문제에 특히 유용)
  - DFS 응용
  - 주로 재귀로 구현
***
**😱 내가 약한 부분**
- ‼️ `투 포인터 활용 문제` : 가장 긴 팰린드롬, 빗물 트래핑, 세 수의 합
  - 주어진 값을 다 살펴봐야 하지만, 효율적인 방법이 필요할 때!
  - 투 포인터 : 시작점과 끝점 또는 왼쪽 포인터와 오른쪽 포인터 두 지점을 기준으로 하는 문제 풀이 전략
    - 범위를 좁혀 나가기 위해서는 일반적으로 배열이 정렬되어 있을 때 유용
- 🤖 `임시 변수 활용` : 자신을 제외한 배열의 곱
  - 공간복잡도 *O(1)*, 시간복잡도 *O(n)* 으로 문제를 풀어야 할 때
  - 이전 값에 대한 정보를 임시로 갖고 있는 `임시 변수` 활용하기
  - 두 변수를 `swap`하는 가장 일반적이고 널리 사용되는 방법은 임시변수를 사용하는 것
    - python에서는 다중 할당이라는 방식으로 임시변수 없이 swap 가능
- 🔁 `연결리스트` : 두 정렬 리스트의 병합, 페어의 노드 스왑
  - Cycle 방지
    - iterative > `prev, curr, next_node` 세개의 변수 적절히 사용
    - 처음에 prev = None 으로 초기화
  - 시작점을 기억하는 `root`변수 사용
- 📚 `스택` : 빗물트래핑, 중복 문자 제거, 일일 온도
  - 일단 stack 에 넣고, stack[-1], stack.pop() 최대한 활용
  - 앞의 것들과 비교해야 할 때, stack을 쓰면 반복 횟수를 줄일 수 있음

***
| 번호 | 제목 | 난이도 | 장 |clear|
| --- | --- | ---- | - | --- |
| 1 | [유효한 팰린드롬](https://leetcode.com/problems/valid-palindrome/) | ★ | 6장. 문자열 조작 | [20201130](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%B4%20%EC%A1%B0%EC%9E%91%5D%201130.%20Valid%20Palindrome%20%5Bleetcode%20125%5D.ipynb) |
| 2 | [문자열 뒤집기](https://leetcode.com/problems/reverse-string/) | ★ | 6장. 문자열 조작 | [20201130](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%AD%20%EC%A1%B0%EC%9E%91%5D%201130.%20Reverse%20String%20%5Bleetcode%20344%5D.ipynb) |
| 3 | [로그 파일 재정렬](https://leetcode.com/problems/reorder-data-in-log-files/) | ★ | 6장. 문자열 조작 | [20201201](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%B4%20%EC%A1%B0%EC%9E%91%5D%201201.Reorder%20Data%20in%20Log%20Files%20%5Bleetcode%20937%5D.ipynb)|
| 4 | [가장 흔한 단어](https://leetcode.com/problems/most-common-word/) | ★ | 6장. 문자열 조작 | [20201201](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%B4%20%EC%A1%B0%EC%9E%91%5D%201201.Most%20Common%20Word.ipynb%20) |
| 5 | [그룹 애너그램](https://leetcode.com/problems/group-anagrams/) | ★★ | 6장. 문자열 조작 | [20201203](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%B4%20%EC%A1%B0%EC%9E%91%5D%201203.%20Group%20Anagrams%20%5Bleetcode%2049%5D.ipynb) |
| 6 | ‼️ [가장 긴 팰린드롬 부분 문자열](https://leetcode.com/problems/longest-palindromic-substring/) | ★★ | 6장. 문자열 조작 | [20201204](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch1%20%EB%AC%B8%EC%9E%90%EC%97%B4%20%EC%A1%B0%EC%9E%91%5D%201204.%20Logest%20Palindromic%20Substring%20%5Bleetcode%205%5D.ipynb)|
| 7 | [두 수의 합](https://leetcode.com/problems/two-sum/) | ★ | 7장. 배열 | [20201207](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201207.%20Two%20Sum%20%5Bleetcode%201%5D.ipynb) |
| 8 | ‼️ 📚 [빗물 트래핑](https://leetcode.com/problems/trapping-rain-water/) | ★★★ | 7장. 배열 | [20201208](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201208.%20Trapping%20Rain%20Water%20%5Bleetcode%2042%5D.ipynb) |
| 9 | ‼️ [세 수의 합](https://leetcode.com/problems/3sum/) | ★★ | 7장. 배열 | [20201209](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201209.%203Sum%20%5Bleetcode%2015%5D.ipynb) |
| 10 | [배열 파티션 I](https://leetcode.com/problems/array-partition-i/) | ★ | 7장. 배열 |[20201211](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201211.%20Array%20Partition%201%5Bleetcode%20561%5D.ipynb) |
| 11 | 🤖 [자신을 제외한 배열의 곱](https://leetcode.com/problems/product-of-array-except-self/) | ★★ | 7장. 배열 | [20201211](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201211.%20Product%20of%20Array%20Except%20Self%20%5Bleetcode%20238%5D.ipynb)|
| 12 | [주식을 사고팔기 가장 좋은 시점](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | ★ | 7장. 배열 |[20201215](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201215.%20Best%20Time%20to%20Buy%20and%20Sell%20Stock%20%5Bleetcode%20121%5D.ipynb) |
| 13 | [팰린드롬 연결 리스트](https://leetcode.com/problems/palindrome-linked-list/) | ★ | 8장. 연결 리스트 | [20201215](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch2%20%EB%B0%B0%EC%97%B4%5D%201221.%20Array%20Review.ipynb) |
| 14 | 🔁 [두 정렬 리스트의 병합](https://leetcode.com/problems/merge-two-sorted-lists/) | ★ | 8장. 연결 리스트 | [20201218](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201218.%20Merge%20Two%20Sorted%20Lists%20%5Bleetcode%2021%5D.ipynb) |
| 15 | 🔁 [역순 연결 리스트](https://leetcode.com/problems/reverse-linked-list/) | ★ | 8장. 연결 리스트 |[20201223](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201223.%20Reverse%20Linked%20List%20%5Bleetcode%20206%5D.ipynb) |
| 16 | [두 수의 덧셈](https://leetcode.com/problems/add-two-numbers/) | ★★ | 8장. 연결 리스트 |[20201223](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201223.%20Add%20Two%20Numbers%20%5Bleetcode%202%5D.ipynb) |
| 17 | 🔁 [페어의 노드 스왑](https://leetcode.com/problems/swap-nodes-in-pairs/) | ★★ | 8장. 연결 리스트 |[20201223](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201223.%20Swap%20Nodes%20in%20Pairs%20%5Bleetcode%2024%5D.ipynb)  |
| 18 | [홀짝 연결 리스트](https://leetcode.com/problems/odd-even-linked-list/) | ★★ | 8장. 연결 리스트 | [20201228](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201228.%20Odd%20Even%20Linked%20List%20%5Bleetcode%20328%5D.ipynb) |
| 19 | 🔁 [역순 연결 리스트 II](https://leetcode.com/problems/reverse-linked-list-ii/) | ★★ | 8장. 연결 리스트 | [20201229](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch3%20%EC%97%B0%EA%B2%B0%EB%A6%AC%EC%8A%A4%ED%8A%B8%5D%201229.%20Reverse%20Linked%20List%202%5Bleetcode%2092%5D.ipynb)|
| 20 | [유효한 괄호](https://leetcode.com/problems/valid-parentheses/) | ★ | 9장. 스택, 큐 | [20201230](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%201230.%20Valid%20Parentheses%20%5Bleetcode%2020%5D.ipynb) |
| 21 | 📚[중복 문자 제거](https://leetcode.com/problems/remove-duplicate-letters/) | ★★★ | 9장. 스택, 큐 | [20210104](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%200104.%20Remove%20Duplicate%20Letters%20%5Bleetcode%20316%5D.ipynb) |
| 22 | 📚[일일 온도](https://leetcode.com/problems/daily-temperatures/) | ★★ | 9장. 스택, 큐 | [20210104](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%200104.%20Daily%20Temperatures%20%5Bleetcode%20739%5D.ipynb) |
| 23 | [큐를 이용한 스택 구현](https://leetcode.com/problems/implement-stack-using-queues/) | ★ | 9장. 스택, 큐 | [20210104](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%200104.%20Implement%20Stack%20using%20Queues%20%5Bleetcode%20225%5D.ipynb) |
| 24 | [스택을 이용한 큐 구현](https://leetcode.com/problems/implement-queue-using-stacks/) | ★ | 9장. 스택, 큐 |[20210104](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%200104.%20Implement%20Queue%20using%20Stacks%20%5Bleetcode%20232%5D.ipynb) |
| 25 | [원형 큐 디자인](https://leetcode.com/problems/design-circular-queue/) | ★★ | 9장. 스택, 큐 | [20210104](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch4%20%EC%8A%A4%ED%83%9D%2C%20%ED%81%90%5D%200104.%20Design%20Circular%20Queue%20%5Bleetcode%20622%5D.ipynb) |
| 26 | [원형 데크 디자인](https://leetcode.com/problems/design-circular-deque/) | ★★ | 10장. 데크, 우선 순위 큐 |[20210106](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch5%20%EB%8D%B0%ED%81%90%2C%20%EC%9A%B0%EC%84%A0%EC%88%9C%EC%9C%84%20%ED%81%90%5D%200106.%20Design%20Circular%20Deque%20%5Bleetcode%20641%5D.ipynb) |
| 27 | [k개 정렬 리스트 병합](https://leetcode.com/problems/merge-k-sorted-lists/) | ★ | 10장. 데크, 우선 순위 큐 |[20210106](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch5%20%EB%8D%B0%ED%81%90%2C%20%EC%9A%B0%EC%84%A0%EC%88%9C%EC%9C%84%20%ED%81%90%5D%200106.%20Merge%20k%20Sorted%20Lists%20%5Bleetcode%2023%5D.ipynb) |
| 28 | [해시맵 디자인](https://leetcode.com/problems/design-hashmap/) | ★ | 11장. 해시 테이블 | [20210107](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch6%20%ED%95%B4%EC%8B%9C%ED%85%8C%EC%9D%B4%EB%B8%94%5D%200107.%20Design%20HashMap%20%5Bleetcode%20706%5D.ipynb) |
| 29 | [보석과 돌](https://leetcode.com/problems/jewels-and-stones/) | ★ | 11장. 해시 테이블 | [20210112](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch6%20%ED%95%B4%EC%8B%9C%ED%85%8C%EC%9D%B4%EB%B8%94%5D%200112.%20Jewels%20and%20Stones%20%5Bleetcode%20771%5D.ipynb)|
| 30 | [중복 문자 없는 가장 긴 부분 문자열](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | ★★ | 11장. 해시 테이블 |[20210112](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch6%20%ED%95%B4%EC%8B%9C%ED%85%8C%EC%9D%B4%EB%B8%94%5D%200112.%20Longest%20Substring%20Without%20Repeating%20Characters%20%5Bleetcode%203%5D.ipynb) |
| 31 | [상위 K 빈도 요소](https://leetcode.com/problems/top-k-frequent-elements/) | ★★ | 11장. 해시 테이블 |[20210112](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch6%20%ED%95%B4%EC%8B%9C%ED%85%8C%EC%9D%B4%EB%B8%94%5D%200112.%20Top%20K%20Frequent%20Elements%20%5Bleetcode%20347%5D.ipynb) |
| 32 | [섬의 개수](https://leetcode.com/problems/number-of-islands/) | ★★ | 12장. 그래프 | [20210113](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch7%20%EA%B7%B8%EB%9E%98%ED%94%84%5D%200113.%20Number%20of%20Islands%20%5Bleetcode%20200%5D.ipynb) |
| 33 | [전화 번호 문자 조합](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | ★★ | 12장. 그래프 | [20210115](https://github.com/sy2399/Algorithm/blob/master/Daily/%5Bch7%20%EA%B7%B8%EB%9E%98%ED%94%84%5D%200115.%20Letter%20Combinations%20of%20a%20Phone%20Number%20%5Bleetcode%2017%5D.ipynb)|
| 34 | [순열](https://leetcode.com/problems/permutations/) | ★★ | 12장. 그래프 | |
| 35 | [조합](https://leetcode.com/problems/combinations/) | ★★ | 12장. 그래프 ||
| 36 | [조합의 합](https://leetcode.com/problems/combination-sum/) | ★★ | 12장. 그래프 | |
| 37 | [부분 집합](https://leetcode.com/problems/subsets/) | ★★ | 12장. 그래프 ||
| 38 | [일정 재구성](https://leetcode.com/problems/reconstruct-itinerary/) | ★★ | 12장. 그래프 |  |
| 39 | [코스 스케줄](https://leetcode.com/problems/course-schedule/) | ★★ | 12장. 그래프 | |
| 40 | [네트워크 딜레이 타임](https://leetcode.com/problems/network-delay-time/) | ★★ | 13장. 최단 경로 문제 |  |
| 41 | [K 경유지 내 가장 저렴한 항공권](https://leetcode.com/problems/cheapest-flights-within-k-stops/) | ★★ | 13장. 최단 경로 문제 ||
| 42 | [이진 트리의 최대 깊이](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | ★ | 14장. 트리 |  |
| 43 | [이진 트리의 직경](https://leetcode.com/problems/diameter-of-binary-tree/) | ★ | 14장. 트리 | |
| 44 | [가장 긴 동일 값의 경로](https://leetcode.com/problems/longest-univalue-path/) | ★ | 14장. 트리 | |
| 45 | [이진 트리 반전](https://leetcode.com/problems/invert-binary-tree/) | ★ | 14장. 트리 |  |
| 46 | [두 이진 트리 병합](https://leetcode.com/problems/merge-two-binary-trees/) | ★ | 14장. 트리 |  |
| 47 | [이진 트리 직렬화 & 역직렬화](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/) | ★★★ | 14장. 트리 | |
| 48 | [균형 이진 트리](https://leetcode.com/problems/balanced-binary-tree/) | ★ | 14장. 트리 | |
| 49 | [최소 높이 트리](https://leetcode.com/problems/minimum-height-trees/) | ★★ | 14장. 트리 | |
| 50 | [정렬된 배열의 이진 탐색 트리 변환](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/) | ★ | 14장. 트리 |  |
| 51 | [이진 탐색 트리(BST)를 더 큰 수 합계 트리로](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/) | ★★ | 14장. 트리 |  |
| 52 | [이진 탐색 트리(BST) 합의 범위](https://leetcode.com/problems/range-sum-of-bst/) | ★ | 14장. 트리 | |
| 53 | [이진 탐색 트리(BST) 노드 간 최소 거리](https://leetcode.com/problems/minimum-distance-between-bst-nodes/) | ★ | 14장. 트리 |  |
| 54 | [전위, 중위 순회 결과로 이진 트리 구축](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | ★★ | 14장. 트리 |  |
| 55 | [배열의 K번째 큰 요소](https://leetcode.com/problems/kth-largest-element-in-an-array/) | ★★ | 15장. 힙 | |
| 56 | [트라이 구현](https://leetcode.com/problems/implement-trie-prefix-tree/) | ★★ | 16장. 트라이 | |
| 57 | [팰린드롬 페어](https://leetcode.com/problems/palindrome-pairs/) | ★★★ | 16장. 트라이 |  |
| 58 | [리스트 정렬](https://leetcode.com/problems/sort-list/) | ★★ | 17장. 정렬 | |
| 59 | [구간 병합](https://leetcode.com/problems/merge-intervals/) | ★★ | 17장. 정렬 | |
| 60 | [삽입 정렬 리스트](https://leetcode.com/problems/insertion-sort-list/) | ★★ | 17장. 정렬 | |
| 61 | [가장 큰 수](https://leetcode.com/problems/largest-number/) | ★★ | 17장. 정렬 | |
| 62 | [유효한 애너그램](https://leetcode.com/problems/valid-anagram/) | ★ | 17장. 정렬 |  |
| 63 | [색 정렬](https://leetcode.com/problems/sort-colors/) | ★★ | 17장. 정렬 |  |
| 64 | [원점에 K번째 가까운 점](https://leetcode.com/problems/k-closest-points-to-origin/) | ★★ | 17장. 정렬 | |
| 65 | [이진 검색](https://leetcode.com/problems/binary-search/) | ★ | 18장. 이진 검색 |  |
| 66 | [회전 정렬된 배열 검색](https://leetcode.com/problems/search-in-rotated-sorted-array/) | ★★ | 18장. 이진 검색 | |
| 67 | [두 배열의 교집합](https://leetcode.com/problems/intersection-of-two-arrays/) | ★ | 18장. 이진 검색 | |
| 68 | [두 수의 합 II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | ★ | 18장. 이진 검색 |  |
| 69 | [2D 행렬 검색 II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | ★★ | 18장. 이진 검색 |  |
| 70 | [싱글 넘버](https://leetcode.com/problems/single-number/) | ★ | 19장. 비트 조작 |  |
| 71 | [해밍 거리](https://leetcode.com/problems/hamming-distance/) | ★ | 19장. 비트 조작 | |
| 72 | [두 정수의 합](https://leetcode.com/problems/sum-of-two-integers/) | ★★★ | 19장. 비트 조작 |  |
| 73 | [UTF-8 검증](https://leetcode.com/problems/utf-8-validation/) | ★★ | 19장. 비트 조작 |  |
| 74 | [1비트의 개수](https://leetcode.com/problems/number-of-1-bits/) | ★ | 19장. 비트 조작 | |
| 75 | [최대 슬라이딩 윈도우](https://leetcode.com/problems/sliding-window-maximum/) | ★★★ | 20장. 슬라이딩 윈도우 | |
| 76 | [부분 문자열이 포함된 최소 윈도우](https://leetcode.com/problems/minimum-window-substring/) | ★★★ | 20장. 슬라이딩 윈도우 ||
| 77 | [가장 긴 반복 문자 대체](https://leetcode.com/problems/longest-repeating-character-replacement/) | ★★ | 20장. 슬라이딩 윈도우 |  |
| 78 | [주식을 사고 팔기 가장 좋은 시점 II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | ★ | 21장. 그리디 알고리즘 | |
| 79 | [키에 따른 대기열 재구성](https://leetcode.com/problems/queue-reconstruction-by-height/) | ★★ | 21장. 그리디 알고리즘 | |
| 80 | [태스크 스케줄러](https://leetcode.com/problems/task-scheduler/) | ★★ | 21장. 그리디 알고리즘 |  |
| 81 | [주유소](https://leetcode.com/problems/gas-station/) | ★★ | 21장. 그리디 알고리즘 | |
| 82 | [쿠키 부여](https://leetcode.com/problems/assign-cookies/) | ★ | 21장. 그리디 알고리즘 |  |
| 83 | [과반수 엘리먼트](https://leetcode.com/problems/majority-element/) | ★ | 22장. 분할 정복 | |
| 84 | [괄호를 삽입하는 여러가지 방법](https://leetcode.com/problems/different-ways-to-add-parentheses/) | ★★ | 22장. 분할 정복 | |
| 85 | [피보나치 수](https://leetcode.com/problems/fibonacci-number/) | ★ | 23장. 다이나믹 프로그래밍 | |
| 86 | [최대 서브 배열](https://leetcode.com/problems/maximum-subarray/) | ★ | 23장. 다이나믹 프로그래밍 | |
| 87 | [계단 오르기](https://leetcode.com/problems/climbing-stairs/) | ★ | 23장. 다이나믹 프로그래밍 |  |
| 88 | [집 도둑](https://leetcode.com/problems/house-robber/) | ★ | 23장. 다이나믹 프로그래밍 ||
| 89(문제 1) | [비밀 지도](https://programmers.co.kr/learn/courses/30/lessons/17681) | ★ | 부록 B. 카카오 공채 문제 풀이 |  |
| 90(문제 2) | [다트 게임](https://programmers.co.kr/learn/courses/30/lessons/17682) | ★ | 부록 B. 카카오 공채 문제 풀이 |  |
| 91(문제 3) | [캐시](https://programmers.co.kr/learn/courses/30/lessons/17680) | ★ | 부록 B. 카카오 공채 문제 풀이 |  |
| 92(문제 4) | [셔틀버스](https://programmers.co.kr/learn/courses/30/lessons/17678) | ★★ | 부록 B. 카카오 공채 문제 풀이 | |
| 93(문제 5) | [뉴스 클러스터링](https://programmers.co.kr/learn/courses/30/lessons/17677) | ★★ | 부록 B. 카카오 공채 문제 풀이 |  |
| 94(문제 6) | [프렌즈4블록](https://programmers.co.kr/learn/courses/30/lessons/17679) | ★★★ | 부록 B. 카카오 공채 문제 풀이 |  |
| 95(문제 7) | [추석 트래픽](https://programmers.co.kr/learn/courses/30/lessons/17676) | ★★★ | 부록 B. 카카오 공채 문제 풀이 |  |

## 기타 코드
- 4장 [계산 속도 비교](miscellaneous/4-performance.py)
- 9장 [스택](miscellaneous/9-stack.py)
- 11장 [생일 문제](miscellaneous/11-birthday.py)
- 12장 [그래프 순회](miscellaneous/12-graph-traversals.py)
- 14장 [트리 순회](miscellaneous/14-tree-traversals.py)
- 15장 [이진 힙](miscellaneous/15-binary-heap.py)
- 17장 [버블 정렬](miscellaneous/17-bubble-sort.py)
- 17장 [퀵 정렬](miscellaneous/17-quick-sort.py)
- 21장 [분할 가능 배낭 문제](miscellaneous/21-fractional-knapsack.py)
- 23장 [0-1 배낭 문제](miscellaneous/23-zero-one-knapsack.py)
