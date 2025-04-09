def solution(n):
    a, b = 0, 1  # f(0) = a, f(b) = b
    
    for i in range(2, n + 1):
        answer = a + b      # F(n) = F(n-1) + F(n-2)
        a, b = b, answer    # b = a + 1, answer = b + 1
    return answer % 1234567