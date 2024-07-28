def sum_of_numbers(numbers):
	total = 0
	for num in numbers:
		total = total + num
	return total

def sum(numbers):
	total = 0
	counter = 0
	while counter < len(numbers):
		total = total + numbers[counter]
		counter = counter + 1
	return total


numbers = [33, 55, 31, 66, 88]

feedback = sum_of_numbers(numbers)
print(feedback)