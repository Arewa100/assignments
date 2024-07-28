def even_positions(list_of_items):
	elements_on_even_positions = [] 
	element = 0
	for count in range(len(list_of_items)):
		if count % 2 == 0:
			element = list_of_items[count]
			elements_on_even_positions += [element]
			
	return elements_on_even_positions


my_items = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

result = even_positions(my_items)
print(result)