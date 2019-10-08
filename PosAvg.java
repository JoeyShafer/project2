import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PosAvg  {
	
	//ArrayList that contains all if the station ids
	protected ArrayList<String> stations = new ArrayList<String>();

	//The station id
	private String stID;
	
	//default constructor
	public PosAvg() {
		
	}
	
	/*Constructor for PosAvg takes in a staion id and reads in "Mesonet.txt"
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
       for (int i = 0; i < 6; ++i) {
       	strg = br.readLine();
       }
       
       //read in first line of station Id's.
       strg = br.readLine();
       
     
       while (strg != null) {
       
       	// Get the station Id from the line and add to staion array.
       	String stationID = strg.substring(4, 8);
       	stations.add(stationID);
       	
       	//Read next line and increase lineNum and index.
       	strg = br.readLine();      	
       }
      
       br.close();
		
	}
}
