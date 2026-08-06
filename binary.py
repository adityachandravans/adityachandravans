
def reverseBits(n):
      
    binary=format(n,'b')
    reverse=binary[::-1]
    return int(reverse ,2)
print(reverseBits(2))