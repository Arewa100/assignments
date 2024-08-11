import lagbajaschoolsfunctions 


number_of_student = int(input("Enter the number of student:  "))
number_of_subject = int(input("Enter the number of subject:  "))
result = lagbajaschoolsfunctions.get_student_score(number_of_student, number_of_subject)

student_total_data = lagbajaschoolsfunctions.calculate_total(result)
dict_of_average = lagbajaschoolsfunctions.calculate_average(student_total_data, number_of_subject)

#print(student_total_data)
result = lagbajaschoolsfunctions.calculate_position(dict_of_average)
print(result)
print(dict_of_average)

