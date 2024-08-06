def double_every_second_number(credit_card_number):  
	total = 0
	for count in range(0, len(credit_card_number), 2):
		value = int(credit_card_number[count] )
		value = (value * 2)

		if value >= 10:
			first_number = value % 10
			second_number = value // 10
			value = (first_number + second_number)
			total = total + value
		else:
			total = total + value
	
	return total


result = double_every_second_number("4388576018402626")

print(result)