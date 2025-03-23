import sys

input = sys.stdin.readline

n = int(input())

arr = [0] * (2000000 + 1)

for i in range(n):
    arr[int(input()) + 1000000] = 1
    
for i in range(len(arr)):
    if arr[i] :
        print(i - 1000000)