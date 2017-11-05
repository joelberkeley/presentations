a = (x % 2 for x in range(6))
list(a)  # {0, 1, 0, 1, 0, 1}

set(a)  # empty set (generator already iterated over)
b = (y % 2 for y in range(6))
set(b)  # {0, 1}

x = ((c, ord(c)) for c in 'cat')
dict(x)  # {'c': 99, 'a': 97, 't': 116}
