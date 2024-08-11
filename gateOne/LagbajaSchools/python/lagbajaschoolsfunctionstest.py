import lagbajaschoolsfunctions
import pytest

def test_get_scores(): 
	assert lagbajaschoolsfunctions.get_scores(3) == [1, 2, 3]

def test_exception_handling_of_get_scores():
	with pytest.raises(ValueError) as excinfo:
		lagbajaschoolsfunctions.get_scores(3)
	assert str(excinfo.value) == "invalid input for student score"

def test_get_student_score():
	assert lagbajaschoolsfunctions.get_student_score(4, 3) == {"student 0": [1, 2, 3], "student 1": [4, 5, 6], "student 2": [7, 8, 9], "student 3": [10, 11, 12]}