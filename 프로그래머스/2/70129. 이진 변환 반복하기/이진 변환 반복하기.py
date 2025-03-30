def solution(s):
    zero, binary = 0, 0
    while s != '1':
        # 0의 개수를 카운트하고 제거
        zero += s.count('0')
        s = s.replace('0', '')
        
        # s의 길이를 가진 c를 이진 문자열로 변환
        c = len(s)
        binary_str = ''
        
        while c > 0:
            binary_str += str(c % 2)
            c //= 2
        s = binary_str[::-1]
        binary +=1
    return [binary,zero]