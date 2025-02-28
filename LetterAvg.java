
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
	public LetterAvg (char letter) throws IOException 
	{
		this.letter = letter;
		read();
	}
	
	/*
	 * Finds the number of station that start with the average letter.
	 */
	public int numberOfStationWithLetterAvg() 
	{
		int numOfStations = 0;
		
		//Loops through station array to count how many stations start with the avg letter.
		for (int i = 0; i < stations.size(); ++i) {
			if (letter == stations.get(i).charAt(0)) {
				++numOfStations;
			}
		}
		return numOfStations;
	}
	
	/*
	 * Finds the stations that start with the average letter and adds them to an arraylist.
	 * 
	 * @Param letter the average letter.
	 */
	public ArrayList<String> stationsWithLetterAvg(char letter) 
	{
		ArrayList<String> stationsWithLetter = new ArrayList<String>();
		for (int i = 0; i < stations.size(); ++i) {
			if (letter == stations.get(i).charAt(0)) {
				stationsWithLetter.add(stations.get(i));
			}
		}
		return stationsWithLetter;
	}
	
	/*
	 * Prints out the stations that start with the the average letter
	 * 
	 * @return String formated as: 
	 * They are:
	 * station1 \n
	 * station2 \n ...
	 */
	@Override 
	public String toString() 
	{
		ArrayList<String> stations = stationsWithLetterAvg(letter);
		String str = "\nThey are:";
		for (int i = 0; i < stations.size(); ++i) {
			str += "\n" + stations.get(i);
		}
		return str;
	}
	
	

}
