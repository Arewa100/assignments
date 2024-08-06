def double_every_second_number(credit_card_number):  
	total = 0
	for count in range(0, len(credit_card_number), 2):
		value = int(credit_card_number[count])
		value = (value * 2)

		if value >= 10:
			first_number = value % 10
			second_number = value // 10
			value = (first_number + second_number)
			total = total + value
		else:
			total = total + value
	
	return total



def sum_of_numbers_in_odd_position(credit_card_number):
	total = 0
	for count in range(0, len(credit_card_number)):
		value = int(credit_card_number[count]);
		if not count % 2 == 0:
			total = total + value
	return total
	
def card_type(credit_card_number):

	first_card = int(credit_card_number[0])
	second_card = int(credit_card_number[0])
	third_card_first_digit = int(credit_card_number[0])
	third_card_second_digit = int(credit_card_number[1])
	fourth_card_number = int(credit_card_number[0])
	
	if first_card == 4:
		return "VisaCard"

	elif second_card == 5:
		return "MasterCard"

	elif third_card_first_digit == 3 and third_card_second_digit == 7:
		return "American Express Cards"
	elif fourth_card_number == 6:
		return "Discover Cards"
	else:
		return "Invalid Card Type"

def card(credit_card_number):

	type_of_card = card_type(credit_card_number)
	first_value = double_every_second_number(credit_card_number)
	second_value = sum_of_numbers_in_odd_position(credit_card_number)
	
	length = len(credit_card_number)
	card_digit_length = str(length)
	
	sum_of_the_values = (first_value + second_value)
	
	if sum_of_the_values % 10 == 0:
		message =  "Credit Card Is Valid"
	else:
		message =  "Credit Card Is invalid"
	
	card_data = {"card_type": type_of_card, "card_number": credit_card_number, "card_digit_length": card_digit_length, "card_status": message}
	
	return card_data

















