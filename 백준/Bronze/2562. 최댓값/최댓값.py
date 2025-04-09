
max_num = 0
idx = 0
for i in range(9):
    num = int(input())
    if max_num < num:
        max_num = num
        idx = i
print(max_num)
print(idx + 1)
