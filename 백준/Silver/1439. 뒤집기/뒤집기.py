s = input()

count_all_one = 0
count_all_zero = 0

if s[0] == '0':
    count_all_zero += 1
elif s[0] == '1':
    count_all_one += 1
    
for i in range(len(s) - 1):
    if s[i] != s[i + 1]:
        if s[i+1] == '0':
            count_all_zero += 1
        if s[i+1] == '1':
            count_all_one += 1
print(min(count_all_one, count_all_zero))
        