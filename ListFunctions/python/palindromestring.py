def palindrome_checker(user_entry):
	element = ''
	counter = 1
	while counter <= len(user_entry):
		element = element + user_entry[-counter]
		counter = counter + 1
	if user_entry == element:
		return f"{user_entry} is a palindrome"
	else: 
		return f"{user_entry} is not a palindrome"
	


result = palindrome_checker('hannah')
print(result)
	
