import java.util.Scanner;

public class NokiaMenu {
	public static void main(String[] args) {
		System.out.println("Welcome to the Nokia World\n");

	Scanner input = new Scanner(System.in);
			


			String name;	
			int menu;
			int password;
			int home;


		System.out.println("enter your name\n");
		 	name = input.next();

		System.out.printf("Welcome %s, enter your password %n", name);
			password = input.nextInt();

			if(password == 2233) {

		System.out.println("press 1 to go to menu");
			home = input.nextInt();
			
		
		switch(home) {
			case 1: 
				System.out.println("welcome to the menu bar. select any option from the menu\n");

			String message = """
				1: Phonebook
				2: Messages
				3: Chat
				4: Call register
				5: Tones
				6: Settings
				7: Call divert
				8: Games
				9: Calculator
				10: Reminders
				11: Clock
				12: Profile
				13: SIM services
					""";
				System.out.println(message);

					menu = input.nextInt();


			switch(menu) {

				case 1:
					System.out.println("welcome to phonebook. select any of the following options\n\n");

						int phonebook;

						String options = """
							1: Search
							2: Service Nos
							3: Add name
							4: Erase
							5: Edit
							6: Assign tone
							7: Send b'card
							8: Options
							9: Speed dials
							10: Voice tags
								""";

						System.out.println(options);
							phonebook = input.nextInt();
					
					switch(phonebook) {
						case 1:
							System.out.println("Search");
							break;
						case 2:
							System.out.println("Service Nos");
							break;
						case 3:
							System.out.println("Add name");
							break;
						case 4:
							System.out.println("Erase");
							break;
						case 5:
							System.out.println("Edit");
							break;
						case 6:
							System.out.println("Assign tone");
							break;
						case 7:
							System.out.println("Send b'card");
							break;
						case 8:
							System.out.println("Options, select the options");
								int opt;
								String option = """

							1: Type of View
							2: Memory Status
								""";

							System.out.println(option);
								opt = input.nextInt();

								switch(opt) {
									case 1: 
										System.out.println("Type of View");
										break;
									case 2: 
										System.out.println("Memory Status");
										break;

									}



							break;
						case 9:
							System.out.println("Speed dials");
							break;
						case 10:
							System.out.println("Voice tags");
							break;
					
}

					break;
				case 2: 

					System.out.println("welcome to Messages. select any of the following options\n\n");

						int messages;

						String msg = """
							1: Write Messages
							2: Inbox
							3: Outbox
							4: Picture Messages
							5: Templates
							6: Smileys
							7: Message Settings
								""";

						System.out.println(msg);
							messages = input.nextInt();
					
					switch(messages) {

						case 1:
							System.out.println("Write Messages");
							break;
						case 2:
							System.out.println("Inbox");
							break;
						case 3:
							System.out.println("Outbox");
							break;
						case 4:
							System.out.println("Picture Messages");
							break;
						case 5:
							System.out.println("Templates");
							break;
						case 6:
							System.out.println("Smileys");
							break;
						case 7:
							System.out.println("Message Settings, select options");
								int settings;
								String ms = """
							1: Set 1
							2: Common
							3: Info Service
							4: Voice mail box number
								""";

							System.out.println(ms);
								settings = input.nextInt();

								switch(settings) {
									case 1: 
										System.out.println("Set 1");
										System.out.println("select option");
											int setOne;
											String set = """
												1: Message center number
												2: Messages sent as
												3: Message Validity
													""";
											System.out.println(set);
											setOne = input.nextInt();

										switch(setOne) {
											case 1:
												System.out.println("Message center number");
												break;
											case 2:
												System.out.println("Messages sent as");
												break;
											case 3:
												System.out.println("Message Validity");
												break;
										}

										break;
									case 2: 
										System.out.println("Common");
										System.out.println("select option");
											int comm;
											String common_message = """
												1: Delivery reports
												2: Reply via same center 
												3: Character support
														""";
											System.out.println(common_message);
											comm = input.nextInt();

										switch(comm) {
											case 1:
												System.out.println("Delivery reports");
												break;
											case 2:
												System.out.println("Reply via same center ");
												break;
											case 3:
												System.out.println("Character support");
												break;
										}

										break;
									case 3: 
										System.out.println("Info Service");
										break;
									case 4: 
										System.out.println("Voice mail box number");
										break;

									}





}

					break;
				case 3:
					System.out.println("welcome to Chat");
					break;
				case 4: 

					System.out.println("welcome to Call register. select any of the following options\n\n");

						int register;

						String info = """
							1: Missed Calls
							2: Recieved calls
							3: Dialed numbers
							4: Erase recent call lists
							5: Show call duration
							6: Show call costs
							7: call cost settings
							8: prepaid credit
								""";

						System.out.println(info);
							register = input.nextInt();
					
					switch(register) {

						case 1:
							System.out.println("Missed Calls");
							break;
						case 2:
							System.out.println("Recieved calls");
							break;
						case 3:
							System.out.println("Erase recent call lists");
							break;
						case 4:
							System.out.println("Show call duration");
							break;
						case 5:

							System.out.println("Show call duration, select options");
								int duration;
							String durationMessage = """

							1: Last call duration
							2: All calls duration
							3: Recieved calls duration
							4: Clear timer
								""";

							System.out.println(durationMessage);
								duration = input.nextInt();

								switch(duration) {
									case 1: 
										System.out.println("Last call duration");
										break;
									case 2: 
										System.out.println("All calls duration");
										break;
									case 3: 
										System.out.println("Recieved calls duration");
										break;
									case 4: 
										System.out.println("Clear timer");
										break;
									}

							break;
						case 6:
							
							System.out.println("Show call costs, select options");
							int costs;
							String costMessage = """

							1: Last call cost
							2: All calls cost
							3: Clear counters
								""";

							System.out.println(costMessage);
								costs = input.nextInt();

								switch(costs) {
									case 1: 
										System.out.println("Last call cost");
										break;
									case 2: 
										System.out.println("All calls cost");
										break;
									case 3: 
										System.out.println("Clear counters");
										break;
									}
							break;

						case 7:
							System.out.println("Call cost settings, select options");
								int costSettings;
								String costSettingsMessage = """
							1: Call cost limit
							2: Show cost in
								""";

							System.out.println(costSettingsMessage);
								costSettings = input.nextInt();

								switch(costSettings) {
									case 1: 
										System.out.println("Call cost limit");
										break;
									case 2: 
										System.out.println("Show cost in");
																												break;
									case 3: 
										System.out.println("Info Service");
										break;
									case 4: 
										System.out.println("Voice mail box number");
										break;

									}
							break;
						case 8:
							System.out.println("prepaid credit");
							break;





}
					break;
				case 5:	
					System.out.println("welcome to Tones");

					int changeTones;
						String toneMessage = """
							1: Ringing Tone
							2: Ringing volume
							3: Incoming call alert
							4: Composer
							5: Message alert tone
							6: Keyboard Tone
							7: Warning and game tones
							8: Vibrating alert
							9: Screen saver
								""";

						System.out.println(toneMessage);
							changeTones = input.nextInt();
					switch(changeTones) {
							case 1:
								System.out.println("Ringing Tone");
								break;
							case 2:
								System.out.println("Ringing volume");
								break;
							case 3:
								System.out.println("Incoming call alert");
								break;
							case 4:
								System.out.println("Composer");
								break;
							case 5:
								System.out.println("Message alert tone");
								break;
							case 6:
								System.out.println("Keyboard Tone");
								break;	
							case 7:
								System.out.println("Warning and game tones");
								break;
							case 8:
								System.out.println("Vibrating alert");
								break;
							case 9:
								System.out.println(" Screen saver");
								break;
}

					break;
				case 6: 
					System.out.println("welcome to settings. select options");
						
						int phoneSettings;
						String setingsMessage = """

							1: Call settings
							2: Phone settings
							3: Security settings
							4: Restore factory setting
								""";

						System.out.println(setingsMessage);
							phoneSettings = input.nextInt();

					switch(phoneSettings) {
						case 1:
							System.out.println("Call settings, select options");
								int callSettings;
							String callSettingsMessage = """
							1: Automatic redial
							2: Speed dialing
							3: Call waiting option
							4: Own number sending
							5: Phone line in use
							6: Automatic answer
								""";

							System.out.println(callSettingsMessage);
								callSettings = input.nextInt();

								switch(callSettings) {
									case 1: 
										System.out.println("Automatic redial");
										break;
									case 2: 
										System.out.println("Speed dialing");
																												break;
									case 3: 
										System.out.println("Call waiting option");
										break;
									case 4: 
										System.out.println("Own number sending");
										break;
									case 5: 
										System.out.println("Phone line in use");
										break;

									case 6: 
										System.out.println(" Automatic answer");
										break;

									}
							break;
	
						case 2:
							System.out.println(" Phone settings");

							System.out.println("phone settings, select options");
								int thePhoneSettings;
							String thePhoneSettingsMessage = """
							1: Language
							2: Cell info display
							3: Welcome note
							4: Network selection
							5: light
							6: Comfirm SIM service actions
								""";

							System.out.println(thePhoneSettingsMessage);
								thePhoneSettings = input.nextInt();

								switch(thePhoneSettings) {
									case 1: 
										System.out.println("Language");
										break;
									case 2: 
										System.out.println("Cell info display");
																												break;
									case 3: 
										System.out.println("Welcome note");
										break;
									case 4: 
										System.out.println("Network selection");
										break;
									case 5: 
										System.out.println("light");
										break;
									case 6: 
										System.out.println("Comfirm SIM service actions");
										break;
									}

							break;
						case 3:
							System.out.println(" Security settings");


							System.out.println("Call settings, select options");
								int securitySettings;
							String securitySettingsMessage = """
							1: PIN code request
							2: Call barring service
							3: Fixed dialing
							4: Closed user group
							5: Phone security
							6: Change access codes
								""";

							System.out.println(securitySettingsMessage);
								securitySettings = input.nextInt();

								switch(securitySettings) {
									case 1: 
										System.out.println("PIN code request");
										break;
									case 2: 
										System.out.println("Call barring service");
																												break;
									case 3: 
										System.out.println("Fixed dialing");
										break;
									case 4: 
										System.out.println("Closed user group");
										break;
									case 5: 
										System.out.println("Phone security");
										break;
									case 6: 
										System.out.println("Change access codes");
										break;
									}


							break;
						case 4:
							System.out.println(" Restore factory setting");
							break;
}
					break;
				case 7: 
					System.out.println("welcome to Call divert");
					break;
				case 8:	
					System.out.println("welcome to Games");
					break;
				case 9: 
					System.out.println("welcome to Calculator");
					break;
				case 10:
					System.out.println("welcome to Reminders");
					break;
				case 11: 
					System.out.println("welcome to Clock");

						System.out.println("clock settings, select options");
								int clockSettings;

							String clockSettingsMessage = """
							1: Alarm clock
							2: Clock settings
							3: Date settings
							4: Stopwatch
							5: Countdown timer
							6: Auto update of date and time
								""";

							System.out.println(clockSettingsMessage);
								clockSettings = input.nextInt();

								switch(clockSettings) {
									case 1: 
										System.out.println("Alarm clock");
										break;
									case 2: 
										System.out.println("Clock settings");
																												break;
									case 3: 
										System.out.println("Date settings");
										break;
									case 4: 
										System.out.println("Stopwatch");
										break;
									case 5: 
										System.out.println("Countdown timer");
										break;
									case 6: 
										System.out.println("Auto update of date and time");
										break;
									}



					break;
				case 12:
					System.out.println("welcome to Profiles");
					break;
				case 13: 
					System.out.println("welcome to SIM services");
					break;

				default: 
					System.out.println("invalid entry");

}					break;	
				default:
					System.out.println("no network or wrong input");
}

} 			else {

		System.out.println("Wrong paasword");
	
}		
}
}