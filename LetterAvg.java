import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg extends PosAvg{
	
	//The Average letter
	private char letter;
	
	/*
	 * Constructor for LetterAvg takes in a char repersenting the average letter 
	 * from the station adn reads in "Mesonet.txt"
	 * 
	 * @Param letter the average letter
	 */
	public LetterAvg (char letter) throws IOException {
		this.letter = letter;
		read();
	}
	
	

}
