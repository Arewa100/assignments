import myerbriggsfunctions 

print("WELCOME TO MYER BRIGGS TEST")
name = input("\nEnter your name: ")
print(f"Welcome {name}. kindly take the following personality test\n")

qestions = myerbriggsfunctions.serve_question()
answers = []
for qestion in qestions:
	print(qestion)
	user_input = input("select 'A' or 'B':  ")
	response = myerbriggsfunctions.exception_checker(user_input)
	answers += response


personality_result = myerbriggsfunctions.personality(answers)
print(f"\n\n{name} your personality is:  {personality_result}")


