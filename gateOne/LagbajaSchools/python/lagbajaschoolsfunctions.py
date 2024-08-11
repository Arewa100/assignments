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
	master_dict = {}
	for count in range(number_of_student):
		print(f"STUDENT {count + 1}")
		score = get_scores(number_of_subject)
		master_dict[f"student {count + 1}"] = score
	return master_dict

