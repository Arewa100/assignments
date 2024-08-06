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