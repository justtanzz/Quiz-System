package exam;
public class CheckAnswers {
	
	private String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
	private int no_of_Correct=0;
	
	public CheckAnswers(String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7,
			String ans8, String ans9, String ans10) {
		super();
		this.ans1 = ans1;
		this.ans2 = ans2;
		this.ans3 = ans3;
		this.ans4 = ans4;
		this.ans5 = ans5;
		this.ans6 = ans6;
		this.ans7 = ans7;
		this.ans8 = ans8;
		this.ans9 = ans9;
		this.ans10 = ans10;
	}


	public int checkGK() {
		if (ans1.equalsIgnoreCase("1877")){
			no_of_Correct++;
		}
	
			 if (ans2.equalsIgnoreCase("Mercury")){
			no_of_Correct++;
			}
	
			 if (ans3.equalsIgnoreCase("Hotmail")){
			no_of_Correct++;
		}
			 if (ans4.equalsIgnoreCase("Brazil")){
			no_of_Correct++;
		}
	
			 if (ans5.equalsIgnoreCase("Paris")){
			no_of_Correct++;
		}

			 if (ans6.equalsIgnoreCase("Despacito")){
			no_of_Correct++;
		}
			 if (ans7.equalsIgnoreCase("Delaware")){
			no_of_Correct++;
		}
			 if (ans8.equalsIgnoreCase("Madrid")){
			no_of_Correct++;
		}
			 if (ans9.equalsIgnoreCase("Mona Lisa")){
			no_of_Correct++;
		}
			 if (ans10.equalsIgnoreCase("Bing")){
			no_of_Correct++;
		}
			 return no_of_Correct*5;
	}	
	
	public int checkMath() {
		if (ans1.equalsIgnoreCase("Traversal")){
			no_of_Correct++;
		}
		 if (ans2.equalsIgnoreCase("360°")){
			no_of_Correct++;
		}
		 if (ans3.equalsIgnoreCase("9:7")){
			no_of_Correct++;
		}
		 if (ans4.equalsIgnoreCase("125%")){
			no_of_Correct++;
		}
		 if (ans5.equalsIgnoreCase("510.5")){
			no_of_Correct++;
		}
		 if (ans6.equalsIgnoreCase("40%")){
			no_of_Correct++;
		}
		 if (ans7.equalsIgnoreCase("5")){
			no_of_Correct++;
		}
		 if (ans8.equalsIgnoreCase("25000")){
			no_of_Correct++;
		}
		 if (ans9.equalsIgnoreCase("9")){
			no_of_Correct++;
		}
		 if (ans10.equalsIgnoreCase("720°")){
			no_of_Correct++;
		}
		 return no_of_Correct*5;
	}
	public int checkLiterature() {
		if (ans1.equalsIgnoreCase("John Keats")){
			no_of_Correct++;
		}
		if (ans2.equalsIgnoreCase("America")){
			no_of_Correct++;
		}
		if (ans3.equalsIgnoreCase("Denmark")){
			no_of_Correct++;
		}
		if (ans4.equalsIgnoreCase("poem")){
			no_of_Correct++;
		}
		if (ans5.equalsIgnoreCase("Arundhati Roy")){
			no_of_Correct++;
		}
		if (ans6.equalsIgnoreCase("Herman Melville")){
			no_of_Correct++;
		}
		if (ans7.equalsIgnoreCase("P.B.Shelley")){
			no_of_Correct++;
		}
	
		if (ans8.equalsIgnoreCase("P.B.Shelley")){
			no_of_Correct++;
		}
		if (ans9.equalsIgnoreCase("William Wordsworth")){
			no_of_Correct++;
		}
		if (ans10.equalsIgnoreCase("William Blake")){
			no_of_Correct++;
		}
		return no_of_Correct*5;
	}
	
}
