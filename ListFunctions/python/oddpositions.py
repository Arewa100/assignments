def odd_positions(list_of_items):
	elements_on_odd_positions = [] 
	element = 0
	for count in range(len(list_of_items)):
		if not count % 2 == 0:
			element = list_of_items[count]
			elements_on_odd_positions += [element]
			
	return elements_on_odd_positions


my_items = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j']

result = odd_positions(my_items)
print(result)