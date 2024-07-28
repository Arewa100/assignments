def sum_of_element(list_of_numbers):
	total = 0
	for num in list_of_numbers:
		total = total + num
	
	return total


numbers = [3, 15, 20, 30, 40]
sum = sum_of_element(numbers)

print(f"the sum of {numbers} is {sum}")