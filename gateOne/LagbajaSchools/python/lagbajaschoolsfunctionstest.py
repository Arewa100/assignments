import lagbajaschoolsfunctions
import pytest

def test_get_scores(): 
	assert lagbajaschoolsfunctions.get_scores(3) == [1, 2, 3]

def test_exception_handling_of_get_scores():
	with pytest.raises(ValueError) as excinfo:
		lagbajaschoolsfunctions.get_scores(3)
	assert str(excinfo.value) == "invalid input for student score"

def test_get_student_score():
	assert lagbajaschoolsfunctions.get_student_score(4, 3) == {"student 1": [1, 2, 3], "student 2": [4, 5, 6], "student 3": [7, 8, 9], "student 4": [10, 11, 12]}

def test_calculate_total():
	student_data = {"student 1": [1, 2, 3], "student 2": [4, 5, 6], "student 3": [7, 8, 9], "student 4": [10, 11, 12]}
	assert lagbajaschoolsfunctions.calculate_total(student_data) == {"student 1": 6, "student 2": 15, "student 3": 24, "student 4": 33}

def test_calculate_average():
	student_total_data = {"student 1": 6, "student 2": 15, "student 3": 24, "student 4": 33}
	assert lagbajaschoolsfunctions.calculate_average(student_total_data, 4) == {"student 1": 1.5, "student 2": 3.75, "student 3": 6, "student 4": 8.25}