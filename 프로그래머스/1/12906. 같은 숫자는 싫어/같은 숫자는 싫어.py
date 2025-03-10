def solution(arr):
#     answer = [arr[0]]
#     # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
#     for i in range(1, len(arr)):
#         if arr[i] != arr[i-1]:
#             answer.append(arr[i])
    
#     print('Hello Python')
    stack = []
    for i in arr:
        # 스택이 비어있지 않고, top 값이 현재 요소 값이 같다면 pop 
        if stack and stack[-1] == i:
            continue # 값이 같다면 무시
        stack.append(i)
    return stack