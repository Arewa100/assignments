import lagbajaschoolsfunctions 


number_of_student = int(input("Enter the number of student:  "))
number_of_subject = int(input("Enter the number of subject:  "))
result = lagbajaschoolsfunctions.get_student_score(number_of_student, number_of_subject)

current_result = lagbajaschoolsfunctions.calculate_total(result)
print(current_result)
