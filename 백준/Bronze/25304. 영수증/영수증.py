total = int(input())
n = int(input())

sum = 0

for i in range(n):
    price, cnt = map(int, input().split())
    sum += price * cnt

if sum == total:
    print('Yes')
else:
    print('No')