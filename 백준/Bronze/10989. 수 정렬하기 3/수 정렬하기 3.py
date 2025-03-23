import sys

input = sys.stdin.readline

# 계수정렬 사용
n = int(input())
arr = [0] *(10000 + 1)

for i in range(n):
    arr[int(input())] += 1

for i in range(len(arr)):
    if arr[i] != 0:
        for j in range(arr[i]):
            print(i)