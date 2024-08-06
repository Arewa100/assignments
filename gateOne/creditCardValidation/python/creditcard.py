import validationfunction
	
print("WELCOME TO THE CREDIT CARD VALIDATOR")

flag = ""

while not flag == "no": 
	
	credit_card_number = input("Enter credit card number to verify:  ")
	
	card_data = validationfunction.card(credit_card_number)
	
	print(f"Credit Card Type: {card_data["card_type"]}")
	print(f"Credit Card Number: {card_data["card_number"]}")
	print(f"Credit Card Digit Length: {card_data["card_digit_length"]}")
	print(f"Credit Card Validity Status: {card_data["card_status"]}")
	
	flag = input("Enter \"yes\" to continue or \"no\" to end app:  \n")