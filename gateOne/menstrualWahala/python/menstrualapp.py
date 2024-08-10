import datetime

todays_date = datetime.date.today()
print(f"WELCOME TO THE MENSTRUAL CYCLE CALCULATOR APP. TODAY'S DATE IS {todays_date}\n")

year = int(input("Enter the year:  "))
month = int(input("Enter the month:  "))
date = int(input("Enter the date of begining of flow:  "))
average_menstrual_duration = int(input("Enter your average menstrual cycle:  "))
flow_duration = int(input("Enter your duration of flow:  "))

date_period_started = datetime.date(year, month, date)
time_duration_of_period = datetime.timedelta(days = (flow_duration - 1))
end_of_period = (date_period_started + time_duration_of_period)

OVULATION_CONSTANT = 14
time_before_ovulation_date = (average_menstrual_duration - OVULATION_CONSTANT)

time_duration_of_before_ovulation = datetime.timedelta(days = time_before_ovulation_date)
ovulation_date = (end_of_period + time_duration_of_before_ovulation)

minimum_difference_in_ovulation_date = datetime.timedelta(days = 2)
last_unsafe_date = (ovulation_date + minimum_difference_in_ovulation_date)

difference_between_first_unsafe = datetime.timedelta(days = 8)
first_unsafe_day = (last_unsafe_date - difference_between_first_unsafe)

safe_period_difference = datetime.timedelta(days = 7)
last_day_of_first_safe_period = (ovulation_date - safe_period_difference)

safe_period_difference_two = datetime.timedelta(days = (average_menstrual_duration - 1))
last_day_of_second_safe_period = (date_period_started + safe_period_difference_two)

minimum_difference_in_ovulation_date_two = datetime.timedelta(days = 3)
day_after_last_unsafe_date = (ovulation_date + minimum_difference_in_ovulation_date_two)

print(f"\nyour period started on the {date_period_started} and will end on {end_of_period}")
print(f"your ovulation date is {ovulation_date}")
print(f"it is not safe to have sex between {first_unsafe_day} and {last_unsafe_date}")
print(f"you first safe period to have sex is between {date_period_started} to {last_day_of_first_safe_period}")
print(f"you second safe period to have sex is between {day_after_last_unsafe_date} to {last_day_of_second_safe_period}\n")
print(f"your next period is starting on {last_day_of_second_safe_period}")






