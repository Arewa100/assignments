def reverse_list(list_of_items):
	reversed_list = [] 
	element = 0
	counter = 1

	while counter <= len(list_of_items):
		element = list_of_items[-counter]
		reversed_list += [element]
		counter = counter + 1
	return reversed_list

result = reverse_list([2,3,4,5,6])
print(result)