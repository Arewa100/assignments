def get_scores(number_of_subject):
	score = []
	try:
		for count in range(number_of_subject):
			student_score = int(input(f"Enter score for subject {count+1}:  "))
			score += [student_score]
	except ValueError:
		raise ValueError("invalid input for student score")
	else:
		return score


def get_student_score(number_of_student, number_of_subject):
	student_data = {}
	for count in range(number_of_student):
		print(f"STUDENT {count + 1}")
		score = get_scores(number_of_subject)
		student_data[f"student {count + 1}"] = score
	return student_data

def calculate_total(student_data):
	total = {}
	student_data_size = len(student_data)
	for count in range(student_data_size):
		sum_of_scores = 0
		data = student_data[f"student {count + 1}"]
		for counter in range(len(data)):
			sum_of_scores = sum_of_scores + data[counter]
		total[f"student {count + 1}"] = sum_of_scores

	return total

def calculate_average(student_total_data, number_of_subject):
	average = {}
	student_total_length = len(student_total_data)
	for count in range(student_total_length):
		total = student_total_data[f"student {count + 1}"]
		calculated_average = (total / number_of_subject)
		average[f"student {count + 1}"] = calculated_average

	return average
	
	



