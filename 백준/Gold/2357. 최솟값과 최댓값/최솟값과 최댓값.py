import sys
import math
# n, m = map(int, input().split())
# # n = 10 , m = 4
# 
# n_arr = [0] * n # 길이가 n이면서 0으로 채워진 배열
# m_arr = [[0 for j in range(2)] for i in range(m)] # 길이가 m이면서 0으로 2개씩 채워진 배열이 들어가 이차원 배열
# 
# for i in range(n):
#     n_arr[i] = int(input())
# for i in range(m):
#     a, b = map(int, input().split()) 
#     sub_arr = n_arr[a - 1:b]  # a, b는 1-based index이므로 0-based index로 변환
#     print(min(sub_arr), max(sub_arr))  # 최솟값, 최댓값 출력
# -----------------------------시간 초과-------------------------------------
# 세그먼트 트리 초기화
def build_segment_tree(arr, seg_tree, node, start, end):
    if start == end:
        seg_tree[node] = (arr[start], arr[start])  # (최솟값, 최댓값)
    else:
        mid = (start + end) // 2
        build_segment_tree(arr, seg_tree, node * 2, start, mid)
        build_segment_tree(arr, seg_tree, node * 2 + 1, mid + 1, end)
        seg_tree[node] = (
            min(seg_tree[node * 2][0], seg_tree[node * 2 + 1][0]),  # 최소값
            max(seg_tree[node * 2][1], seg_tree[node * 2 + 1][1])   # 최대값
        )

# 구간 최소, 최대 쿼리
def query_segment_tree(seg_tree, node, start, end, left, right):
    if right < start or end < left:
        return (float('inf'), float('-inf'))  # 범위를 벗어남
    if left <= start and end <= right:
        return seg_tree[node]  # 포함되는 범위
    
    mid = (start + end) // 2
    left_query = query_segment_tree(seg_tree, node * 2, start, mid, left, right)
    right_query = query_segment_tree(seg_tree, node * 2 + 1, mid + 1, end, left, right)

    return (min(left_query[0], right_query[0]), max(left_query[1], right_query[1]))

# 입력 받기
n, m = map(int, sys.stdin.readline().split())
arr = [int(sys.stdin.readline()) for _ in range(n)]

# 세그먼트 트리 초기화
h = 2 ** (math.ceil(math.log2(n)) + 1)
seg_tree = [None] * h
build_segment_tree(arr, seg_tree, 1, 0, n - 1)

# 질의 처리
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    min_val, max_val = query_segment_tree(seg_tree, 1, 0, n - 1, a - 1, b - 1)
    print(min_val, max_val)
 
    
