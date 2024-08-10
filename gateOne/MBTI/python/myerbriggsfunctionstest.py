import myerbriggsfunctions 
import pytest

def test_serve_question_function():
	result = myerbriggsfunctions.serve_question()
	assert result[0] == "1: (A) expend energy, enjoy groups : (B) conserve energy, enjoy one on one"

def test_getresponse():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.getresponse(response) == response

def test_if_get_response_can_check_for_exceptions():
	response = ['A', 'B', 'A', 'f', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	with pytest.raises(ValueError) as excinfo:
		myerbriggsfunctions.getresponse(response)
	assert str(excinfo.value) == "invalid input, make sure your selection is A or B"

def test_exception_checker():
	user_input = 'S'
	with pytest.raises(ValueError) as excinfo:
		myerbriggsfunctions.exception_checker(user_input)
	assert str(excinfo.value) == "invalid input, make sure your selection is A or B"

def test_get_first_test_result():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.get_first_test_result(response) == 'I'

def test_get_second_test_result():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.get_second_test_result(response) == 'S'

def test_get_third_test_result():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.get_third_test_result(response) == 'T'

def test_get_fourth_test_result():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.get_fourth_test_result(response) == 'J'


def test_for_personality():
	response = ['A', 'B', 'A', 'A', 'A', 'B', 'A', 'A', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'A', 'B', 'A', 'B', 'B']
	assert myerbriggsfunctions.personality(response) == "(The Inspector : ISTJ Personality) ISTJs are serious, proper, and formal in appearance which can be intimidating. They are cultured and have an affection towards tradition. In contrast, they are quiet and usually calm.  They are called inspectors because of their keen attention to detail. ISTJ are rule followers who always take the logical approach towards their goals and projects. Their dominant cognitive function is introverted sensing which helps them take in the details about their environment while their auxiliary cognitive function is extraverted thinking which makes them efficient and logical thinkers. In their relationships, they are very loyal to their friends and family members. Usually, they have a small circle with who they prefer spending their time with. The ISTJ thrives in jobs that require structure, logic, and stability."





