import validationfunction 
	
def test_double_every_second_number():
	assert validationfunction.double_every_second_number("4388576018402626") == 37

def test_sum_of_numbers_in_odd_position():
	assert validationfunction.sum_of_numbers_in_odd_position("4388576018402626") == 38

def test_card_type():
	assert validationfunction.card_type("4388576018402626") == "VisaCard"

def test_card_type():
	assert validationfunction.card_type("5388576018402626") == "MasterCard"

def test_card_type():
	assert validationfunction.card_type("3788576018402626") == "American Express Cards"

def test_card_type():
	assert validationfunction.card_type("6388576018402626") == "Discover Cards"

def test_card_type():
	assert validationfunction.card_type("1388576018402626") == "Invalid Card Type"

def test_card():
	assert validationfunction.card("4388576018402626") == {"card_type": "VisaCard", "card_number": "4388576018402626", "card_digit_length": "16", "card_status": "Credit Card Is invalid"}