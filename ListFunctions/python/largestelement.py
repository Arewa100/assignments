def largest_element(list_of_numbers):
	counter = 1
	largest = 0
	while counter < len(list_of_numbers):
		if list_of_numbers[counter] > largest:
			largest = list_of_numbers[counter]
		counter = counter + 1
	return largest



list_of_numbers = []
for count in range(1, 11):
	user_input = int(input("Enter series of numbers: "))
	list_of_numbers += [user_input]
print(list_of_numbers)

largest = largest_element(list_of_numbers)
print(f"the largest value in the list is {largest}")
	