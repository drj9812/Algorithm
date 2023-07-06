n = int(input())

for i in range(n):

    if i == 0:
        print('*' * n, end = '')
        print(' ' * ((2 * n) - 3), end = '')
        print('*' * n, end = '')
    else:
        print(' ' * i, end = '*')
        print(' ' * (n - 2), end = '*')
        if i != n - 1:
            print(' ' * (2 * (n - i) - 3), end = '*')
        print(' ' * (n - 2), end = '*')

    print()
    
for j in range(n - 1):

    if j == n - 2:
        print('*' * n, end = '')
        print(' ' * ((2 * n) - 3), end = '')
        print('*' * n, end = '')
    else:
        print(' ' * (n - j - 2), end = '*')
        print(' ' * (n - 2), end = '*')
        print(' ' * ((2 * (j + 1)) - 1), end = '*')
        print(' ' * (n - 2), end = '*')
    print()