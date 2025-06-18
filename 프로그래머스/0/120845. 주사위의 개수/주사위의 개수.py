def solution(box, n):
    answer = 0
    a = box[0] // n
    print(a)
    b = box[1] // n
    print(b)
    c = box[2] // n
    print(c)
    answer = a * b * c
    return answer