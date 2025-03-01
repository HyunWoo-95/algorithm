def gcd(n, m):
    if n%m == 0:
        return m
    else:
        return gcd(m, n%m)

def solution(n, m):
    # for i in range(min(n,m), 0, -1):
    #     if (n % i == 0) and (m % i == 0):
    #         a = i
    #         break
    # for j in range(max(n,m), (n*m) +1):
    #     if j % n == 0 and j % m == 0:
    #         b = j
    #         break
    # return [a,b]
    
    # 유클리드 호제법 1
    # c, d = max(n,m), min(n,m)
    # t = 1
    # while t > 0 :
    #     t = c % d
    #     c, d = d, t
    # answer = [c, int(n*m/c)]
    # return answer
    
    # 유클리드 호제법 2
    answer =[gcd(m,n), n *m // gcd(m,n)]
    return answer