import datetime

todays_date = datetime.date.today()
print(f"WELCOME TO THE MENSTRUAL CYCLE CALCULATOR APP. TODAY'S DATE IS {todays_date}\n")

year = int(input("Enter the year:  "))
month = int(input("Enter the month:  "))
date = int(input("Enter the date of begining of flow:  "))
average_menstrual_duration = int(input("Enter your average menstrual cycle:  "))
flow_duration = int(input("Enter your average duration of flow:  "))

date_period_started = datetime.date(year, month, date)
time_duration = datetime.timedelta(days = date)
end_of_period = (date_period_started + time_duration)

print(f"your period started on the {date_period_started} and will end on {end_of_period}")



