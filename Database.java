package exam;
import java.io.*;
import java.util.Scanner;
public class Database
{
	private String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
	private String[] str;
	File file = new File("Answers.txt");
	public Database(String ans1, String ans2, String ans3, String ans4, String ans5, String ans6, String ans7,
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
	
	public void saveInfo() {
		try {
			if(file.createNewFile()) {
				
			}
			FileWriter fw = new FileWriter(file, true);
			str = new String[] {ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10};
			for(int i=1; i<=str.length; i++) {
				fw.write("Answer "+ i +":"+ " "+ str[i-1]+"\n");
			}
			fw.write("\n");
			fw.close();
		} catch (IOException e) {
			
		}
	}
	
	public String readInfo() {
		String data = null;
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				data = sc.nextLine();
			}
			sc.close();
		} catch(FileNotFoundException e) {
			
		}
		return data;
	}
}