nums = [1, 2, 2, 3, 1, 4, 2]

count = {}

for num in nums:
    if num in count:
        count[num] += 1
    else:
        count[num] = 1

print(count)