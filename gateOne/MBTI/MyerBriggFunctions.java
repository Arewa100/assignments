import java.util.Arrays;
public class MyerBriggFunctions {

	private char[] response;
	private String[] message;


	public MyerBriggFunctions() {

		String[] message = {"(The Inspector : ISTJ Personality) ISTJs are serious, proper, and formal in appearance which can be intimidating. They are cultured and have an affection towards tradition. In contrast, they are quiet and usually calm.  They are called inspectors because of their keen attention to detail. ISTJ are rule followers who always take the logical approach towards their goals and projects. Their dominant cognitive function is introverted sensing which helps them take in the details about their environment while their auxiliary cognitive function is extraverted thinking which makes them efficient and logical thinkers. In their relationships, they are very loyal to their friends and family members. Usually, they have a small circle with who they prefer spending their time with. The ISTJ thrives in jobs that require structure, logic, and stability.", "(The Counselor: INFJ Personality) INFJs are visionaries who have a different view of the world. They love introspection and refuse to take things at a surface level. They could be termed weird by others because of how they see life. The INFJ are idealists who love understanding complex issues. They are reserved leaders who are usually creatives due to how easily they get inspired. Also known as the diplomats, the INFJ prefers to cooperate with members of their team as opposed to conflict. The dominant cognitive function of an INFJ is introverted intuition which helps them focus on internal insights and generally influences their decision-making. Their tertiary cognitive function is an extraverted feeling which makes them highly sensitive to the feeling of others or what others refer to as being empathetic. The INFJ thrives in jobs that require a deal of compassion, psychology, and/or collaboration.", "The Mastermind : (INTJ Personality) INTJs are introverts who are comfortable being by themselves. They would avoid socializing as it drains their energy. They excel at developing plans and strategies. As analytical problem solvers, this personality type is strategic and innovative. Their dominant cognitive function is Introverted intuition which they use to read between the lines and unravel patterns. The auxiliary function is extraverted thinking which makes them deliberate about solutions and highly organized. Also known as the architects, the INTJ thrives in jobs that require logical systems and innovative solutions. They usually prefer to work alone. In relationships, they are loyal and are great at encouraging their partners. ", "(The Giver (ENFJ) ENFJs are individuals who are people-centered. They rely mostly on their intuition and feelings and tend to live through their imagination. They focus on abstracts and what could happen in the future. They are highly empathetic not just to their close friends and family but to people in general. The ENFJ generally loves feedback and they can be referred to as people pleasers. Their dominant cognitive function is an extraverted feeling that helps them be in tune with other people’s feelings. Their auxiliary functions are introverted intuition that makes them focus on the future as opposed to the present moment. They thrive in jobs where they can encourage others and push them to grow. This also includes humanitarian-focused jobs. In relationships, they are supportive and always willing to understand their partners", "(The Craftsman (ISTP) ISTPs are a mysterious, rational, and highly logical bunch. They are spontaneous and unpredictable most times albeit oblivious to those around them because they are experts at hiding their true nature. Their dominant cognitive function is introverted thinking which makes them focus on the logical aspect of a situation. The ISTP’s auxiliary cognitive function is extraverted sensing which helps them focus on abstract things. They thrive in jobs that require technical expertise and physical activity. In relationships, they are calm lovers who prefer being handy around the house", " (The Provider (ESFJ) ESFJs are stereotypically known to be extroverts. They are cheerleaders and raise the spirits of those around them earning them popularity. Because of their nature, they are easily liked and people easily warm up to them. Their dominant cognitive function is an extroverted feeling which makes them work and make decisions based on their gut feeling. The ESFJ’s auxiliary cognitive function is introverted sensing which helps them focus on the present instead of the future or other abstract details. They thrive in jobs that require processes and interpersonal skills. In relationships, they are the traditional partners who believe in structure and stability.", "(The Idealist (INFP) INFPs are usually reserved and introverted. They usually spend time all by themselves in quiet places. They love analyzing signs and symbols and using them to draw inferences in explaining what is happening around them. Their dominant cognitive function is an introverted feeling which helps them with processing emotions internally. The INFP auxiliary cognitive function is the extraverted intuition that helps them focus on the big picture through imagination. They thrive in jobs that require visions and align with their goals/ interests. In relationships take time to select their friends and they are quite big on comprise.", "The Performer (ESFP) ESFPs are mostly perceived to be entertainers. They enjoy being in the spotlight. They enjoy exploring and learning to share what they’ve learned with others through their strong interpersonal skills. Their dominant cognitive function is extraverted sensing which helps them stick to facts instead of abstract ideas. The ESFP’s auxiliary cognitive function is an introverted feeling which helps them make decisions. They thrive in work environments where they can be spontaneous, move around often, and involves the use of artistic values. In relationships, the ESFP will prioritize their family and loved ones over anything although they can also strongly dislike a structured life.", "The Champion (ENFP) ENFPs are highly individualistic and refuse to live their lives inside a box. They strive to create their own methods of doing things. They operate with their feelings and are highly perceptive and thoughtful. Their dominant cognitive function is extraverted intuition which allows them to focus on abstract thoughts and patterns. The auxiliary cognitive function is introverted feelings which make them focus on their feelings rather than logic. In relationships, the ENFP is always expressive and shares affection openly. They also thrive in jobs that demand creativity and imaginative solutions.", "The Doer (ESTP) ESTPs are governed by the need to interact with others. They are interested in abstracts and theories. They are spontaneous and risk-taking. They aren’t afraid of making mistakes as they make them up as they go along. Their dominant cognitive function is extraverted sensing which makes them action-oriented. The auxiliary cognitive function of an ESTP is introverted thinking which makes them highly disciplined and very observant. They thrive in career paths that require mechanical skills, flexibility, and one that is quite unpredictable. In relationships, they can be quite adventurous and prefer activities with their loved ones.", "The Supervisor (ESTJ) ESTJs are organized and governed by the zeal to do what is right and socially acceptable. They epitomize the ideal individual who is on the track toward doing what is “good” and “right”. They are happy to be of help. Their dominant cognitive function is extraverted thinking which makes them quite practical when compared to other personality types. The auxiliary cognitive functions are introverted sensing which makes them very keen on details and stability. The ESTJs like to work in management positions where they can oversee operations and put in structures. In relationships, they love routines and their loved ones know that they can always be depended on for anything.", "The Commander (ENTJ) ENTJs focus on dealing with all things rationally and logically. They are naturally born leaders who command respect. They also do enjoy being in charge. They see obstacles as challenges in which they can prove themselves. Their dominant cognitive function is extraverted thinking which makes them deliberate about orders and judgments. The auxiliary function is introverted intuition which makes them trust their instincts during decision making. The ENTJ thrives in jobs that are complex and require clear strategies for goals. In relationships, they can set high expectations for their loved ones and can be sometimes domineering.", "The Thinker (INTP) INTPs are typically known for their brilliant ideas and propositions. They see a pattern in everything and can easily pick out something that’s out of place. They are concerned with finding an environment where their creative genius can be harnessed. Their dominant cognitive function is introverted thinking which makes them highly understanding and deep thinkers. The auxiliary functions are extraverted intuition which helps with their imagination and inspiration. The INTP thrives in work environments that aren’t focused on traditions. They prefer flexible and independent work styles. In relationships, they are highly unconventional and autonomous.", "(The Nurturer (ISFJ) ISFJs are highly generous and ever-ready to give back to society. They are warm and kind-hearted individuals. They possess an awareness and consideration towards bringing out the best in others. The dominant cognitive function is introverted sensing which makes them very detail-oriented. Their auxiliary functions are extraverted feelings which makes them nurturing and very considerate. They thrive in jobs that require structure and are positioned behind the scenes. In relationships, the ISFJ will take care of their loved ones unconditionally.", "The Visionary (ENTP) ENTPs are extroverts who do not enjoy small talk. These personalities are very rare to come across. They have a logical and rational approach to discussions and/or arguments. They are knowledgeable but need constant stimulation. Their dominant cognitive function is extroverted intuition which makes them always open to exploring new ideas. The auxiliary function is introverted thinking which makes them quite logical. They thrive in jobs where creativity meets challenges. In relationships, the ENTP is spontaneous and can be quite exciting.", "(The Composer (ISFP) ISFPs on the outside seem like introverts but deep down they’re warm and very friendly. They are spontaneous and fun to be with. They are always out to explore new things and discover new experiences. Their dominant cognitive function is an introverted feeling which makes them caring. The auxiliary functions are extraverted sensing which makes them appreciate works of art. ISPs prefer to work independently away from the spotlight. In relationships, they are accommodating and very easygoing"};

	this.message = message;
}
	
	public String[] serveQuestion() {
			String[] question =  {
					"1: (A) expend energy, enjoy groups : (B) conserve energy, enjoy one on one",
					"2: (A) interpret literally : (B) look for meaning and possibilities",
					"3: (A) logical, thinking, questioning : (B) emphathic, feeling, accommodating",
					"4: (A) organized, orderly : (B) flexing, adaptable",
					"5: (A) more outgoing, think out loud : (B) more reserved, think of yourself",
					"6: (A) practical, realistic, experimental : (B) imagination, innovation, theoretical",
					"7: (A) candid, straight forward, frank : (B) tactful, kind, encouraging",
					"8: (A) plan, shedule : (B) emphathic, feeling, accommodating",
					"9: (A) seek many tasks, public activities, interactions with others : (B) seek, private, solitary activities with quiet to concentrate",
					"10: (A) standard, usual, conventional : (B) different, novel, unique",
					"11: (A) firm, tend to criticize, hold the line (B) gentle, tend to appreciate, concilate",
					"12: (A) regulated, structured : (B) easygoing, \"live\" and (let live) ",
					"13: (A) external, communicative, express yours : (B) internal, reticent, keep to yourself",
					"14: (A) focus on here-and-now :(B) look to the future, global perspective, \"big picture\" ",
					"15: (A) tough-minded, just : (B) tender-hearted, merciful",
					"16: (A) preparation, plan ahead : (B) tender-hearted, merciful",
					"17: (A) active, initiate : (B) reflective, deliberate",
					"18: (A) facts, things, \"what is\" : (B) ideas, dreams, \"what could be\" ",
					"19: (A) matter of fact, issue-oriented : (B) sensitive, people-oriented, compassionate",
					"20: (A) control, govern : (B) latitude, freedom"
					};

		return question;
}
	public void getResponse(char[] response) {

		for(int count = 0; count < response.length; count++) {
			if(response[count] != 'A' && response[count] != 'B') {
				int questionNumber = (count + 1);
				throw new IllegalArgumentException("invalid input at question " + questionNumber + " the selection should be 'A' or 'B'");
			}
		}
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
		public String personality() {

			getResponse(response);
	 		String firstResponse = String.valueOf(getFirstTestResult());
			String secondResponse = String.valueOf(getSecondTestResult());
			String thirdResponse =  String.valueOf(getThirdTestResult());
			String fourthResponse = String.valueOf(getFourthTestResult());
	
			String[] ofResponses = {firstResponse, secondResponse, thirdResponse, fourthResponse};
			String personalityTest = "";

			for(int count = 0; count < ofResponses.length; count++) {
				personalityTest = personalityTest + ofResponses[count];
			}
		
			if(personalityTest.equals("ISTJ")) {
				return message[0];
			}else if(personalityTest.equals("INFJ")) {
				return message[1];
			}else if(personalityTest.equals("INTJ")) {
				return message[2];
			}else if(personalityTest.equals("ENFJ")) {
				return message[3];
			}else if(personalityTest.equals("ISTP")) {
				return message[4];
			}else if(personalityTest.equals("ESFJ")) { 
				return message[5];
			}else if(personalityTest.equals("INFP")) { 
				return message[6];
			}else if(personalityTest.equals("ESFP")) { 
				return message[7];
			}else if(personalityTest.equals("ENFP")) { 
				return message[8];
			}else if(personalityTest.equals("ESTP")) { 
				return message[9];
			}else if(personalityTest.equals("ESTJ")) { 
				return message[10];
			}else if(personalityTest.equals("ENTJ")) { 
				return message[11];
			}else if(personalityTest.equals("INTP")) { 
				return message[12];
			}else if(personalityTest.equals("ISFJ")) { 
				return message[13];
			}else if(personalityTest.equals("ENTP")) { 
				return message[14];
			}else { 
				return message[15];
			}

}
} 




















