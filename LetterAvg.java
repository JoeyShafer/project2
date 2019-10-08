import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetterAvg extends PosAvg{
	
	private ArrayList<String> stations = new ArrayList<String>();
	private char letter;
	
	public LetterAvg (char letter) throws IOException {
		this.letter = letter;
		read();
	}
	
	

}
