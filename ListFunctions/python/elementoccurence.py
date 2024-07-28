def check_list_element(element, list_of_element):
	for count in list_of_element:
		if element in list_of_element: 
			return f"{element} is present in {list_of_element}" 
		else:
			return "element does not occur in the list"


grouped_items = [2, 4, 5, 6]
result =  check_list_element(8, grouped_items)
print(result)