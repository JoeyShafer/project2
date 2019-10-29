import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg  {
	
	//ArrayList that contains all if the station ids.
	protected ArrayList<String> stations = new ArrayList<String>();

	//The station id.
	private String stID;
	
	//default constructor
	public PosAvg() {
		
	}
	
	/*
	 * Constructor for PosAvg takes in a staion id and reads in "Mesonet.txt"
	 * 
	 * @Param stID the station Id
	 */
	public PosAvg (String stID) throws IOException  {
		this.stID = stID;
		read();
	}
	
	/*
	 * Loads a list of station Id's from a txt file. Each line repersents one station.
	 * 
	 *  @Param filename name of txt file that will be read in.
	 */
	public void read() throws IOException
	{
		// Declare a BufferReader to read in file.
	   BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
       String strg;
       
       // Read in and throw out the first five lines of the file to get to station Id's.
       for (int i = 0; i < 3; ++i) {
       	strg = br.readLine();
       }
       
       //read in first line of station Id's.
       strg = br.readLine();
       
     
       while (strg != null) {
       
       	// Get the station Id from the line and add to staion array.
       	String stationID = strg.substring(1,5);
       	stations.add(stationID);
       	
       	//Read next line and increase lineNum and index.
       	strg = br.readLine();      	
       }
      
       br.close();
		
	}
	
	/*
	 * Finds the index of the staion id in the staions array.
	 * 
	 * @Param stID the id of the station
	 */
	public int indexOfStation() {
		int indexOfStation = 0;
		
		//Loops through stations array to find the stID and gets the index of it.
		for (int i = 0; i < stations.size(); ++i) {
			if (stID.equalsIgnoreCase(stations.get(i))) {
				indexOfStation = i + 1;
				break;
			}
		}
		return indexOfStation;
	}
	
	/*
	 * Uses the index of a station to find stations whoese average is that index and adds 
	 * their id to an array of strings
	 * 
	 * @Param index index of a sation in the stations array
	 */
	public String[] indexAvgOfStations(int index) {
		String[] avgStations = new String[4];
		avgStations[0] = stations.get(index - 2);
		avgStations[1] = stations.get(index);
		avgStations[2] = stations.get(index - 3);
		avgStations[3] = stations.get(index + 1);
		return avgStations;
	}
	
	/*
	 * Prints out the stations whose  index averages equal the index of the orginal station.
	 * 
	 * @return String formated as "This index is average of %s and %s, and %s and %s, and so on."
	 */
	@Override
	public String toString() {
		int index  = indexOfStation();
		String[] avgStations = indexAvgOfStations(index);
		return String.format("This index is average of %s and %s, %s and %s, and so on."
				, avgStations[0], avgStations[1], avgStations[2], avgStations[3]);
	
	}
	
}
