def add_list_alternatively(first_list, second_list):
	third_list = []
	element = ''
	for count in range(len(first_list)):
		element = first_list[count]
		third_list += [element]
		element = second_list[count]
		third_list += [element]
	return third_list


first_item = ['soap', 'sponge', 'scrub']
second_item = [1, 2, 4]

result = add_list_alternatively(first_item, second_item)	
print(result)	