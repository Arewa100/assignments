import java.util.Arrays;
public class MyerBriggFunctions {

	private char[] response;
	
	public String[] serveQuestion() {
			String[] question =  {
					"1: (A) expend energy, enjoy groups (B) conserve energy, enjoy one on one",
					"2: (A) interpret literally (B) look for meaning and possibilities",
					"3: (A) logical, thinking, questioning (B) emphathic, feeling, accommodating",
					"4: (A) organized, orderly (B) flexing, adaptable",
					"5: (A) more outgoing, think out loud  (B) more reserved, think of yourself",
					"6: (A) practical, realistic, experimental (B) imagination, innovation, theoretical",
					"7: (A) candid, straight forward, frank (B) tactful, kind, encouraging",
					"8: (A) plan, shedule (B) emphathic, feeling, accommodating",
					"9: (A) seek many tasks, public activities, interactions with others (B) seek, private, solitary activities with quiet to concentrate",
					"10: (A) standard, usual, conventional (B) different, novel, unique",
					"11: (A) firm, tend to criticize, hold the line (B) gentle, tend to appreciate, concilate",
					"12: (A) regulated, structured (B) easygoing, \"live\" and (let live) ",
					"13: (A) external, communicative, express yours (B) internal, reticent, keep to yourself",
					"14: (A) focus on here-and-now (B) look to the future, global perspective, \"big picture\" ",
					"15: (A) tough-minded, just (B) tender-hearted, merciful",
					"16: (A) preparation, plan ahead (B) tender-hearted, merciful",
					"17: (A) active, initiate (B) reflective, deliberate",
					"18: (A) facts, things, \"what is\" (B) ideas, dreams, \"what could be\" ",
					"19: (A) matter of fact, issue-oriented (B) sensitive, people-oriented, compassionate",
					"20: (A) control, govern (B) latitude, freedom"
					};

		return question;
}
	public void getResponse(char[] response) {
	
		this.response = response;

		
}
	public char getFirstTestResult() {

		char[] theResponse = response;

		int numberOfAs = 0;
		int numberOfBs = 0;
		char firstResponse = theResponse[0];
		char secondResponse = theResponse[4];
		char thirdResponse = theResponse[8];
		char fourthResponse = theResponse[12];
		char fifthResponse = theResponse[16];

		char[] firstTestResponses = {firstResponse, secondResponse, thirdResponse, fourthResponse, fifthResponse};
	
		for(int count = 0; count < firstTestResponses.length; count++) {
			if(firstTestResponses[count] == 'A') {
				numberOfAs = numberOfAs + 1;
			} else {
				numberOfBs = numberOfBs + 1;
			}
		}
		
		if(numberOfAs > numberOfBs) {
			return 'E';
		}else {
			return 'I';
		
		}
}
	public char getSecondTestResult() {

		char[] theResponse = response;

		int numberOfAs = 0;
		int numberOfBs = 0;
		char firstResponse = theResponse[1];
		char secondResponse = theResponse[5];
		char thirdResponse = theResponse[9];
		char fourthResponse = theResponse[13];
		char fifthResponse = theResponse[17];

		char[] firstTestResponses = {firstResponse, secondResponse, thirdResponse, fourthResponse, fifthResponse};
	
		for(int count = 0; count < firstTestResponses.length; count++) {
			if(firstTestResponses[count] == 'A') {
				numberOfAs = numberOfAs + 1;
			} else {
				numberOfBs = numberOfBs + 1;
			}
		}
		
		if(numberOfAs > numberOfBs) {
			return 'S';
		}else {
			return 'N';
		
		}
}
	public char getThirdTestResult() {

		char[] theResponse = response;

		int numberOfAs = 0;
		int numberOfBs = 0;
		char firstResponse = theResponse[2];
		char secondResponse = theResponse[6];
		char thirdResponse = theResponse[10];
		char fourthResponse = theResponse[14];
		char fifthResponse = theResponse[18];

		char[] firstTestResponses = {firstResponse, secondResponse, thirdResponse, fourthResponse, fifthResponse};
	
		for(int count = 0; count < firstTestResponses.length; count++) {
			if(firstTestResponses[count] == 'A') {
				numberOfAs = numberOfAs + 1;
			} else {
				numberOfBs = numberOfBs + 1;
			}
		}
		
		if(numberOfAs > numberOfBs) {
			return 'T';
		}else {
			return 'F';
		
		}
}
	public char getFourthTestResult() {

		char[] theResponse = response;

		int numberOfAs = 0;
		int numberOfBs = 0;
		char firstResponse = theResponse[3];
		char secondResponse = theResponse[7];
		char thirdResponse = theResponse[11];
		char fourthResponse = theResponse[15];
		char fifthResponse = theResponse[19];

		char[] firstTestResponses = {firstResponse, secondResponse, thirdResponse, fourthResponse, fifthResponse};
	
		for(int count = 0; count < firstTestResponses.length; count++) {
			if(firstTestResponses[count] == 'A') {
				numberOfAs = numberOfAs + 1;
			} else {
				numberOfBs = numberOfBs + 1;
			}
		}
		
		if(numberOfAs > numberOfBs) {
			return 'J';
		}else {
			return 'P';
		
		}
}

} 
























