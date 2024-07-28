def list_of_digits(numbers): 
	fourthnumber = numbers % 10 
	first_division = numbers // 10 
	thirdnumber = first_division % 10 
	second_division = first_division // 10
	secondnumber = second_division % 10 
	firstnumber = second_division // 10
	
	feedback = [firstnumber, secondnumber, thirdnumber, fourthnumber]

	return feedback

number = int(input("Enter any four digit: "))
result = list_of_digits(number)
print(result)