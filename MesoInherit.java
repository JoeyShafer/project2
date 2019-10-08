
public class MesoInherit  extends MesoAbstract {

	//The station Id
	private String stID;
	
	private int[] calAverage;
	
	/*
	 * Constructor for MesoInherit takes in one string repersenting the station id.
	 * 
	 * @Param stID The station id..
	 */
	public MesoInherit (MesoStation stid) {
		this.stID = stid.getStID();
	}
	
	/*
	 * Converts the station Id to ascii numbers and finds the average of them 
	 * then finds the ceiling, floor and average of the number and stores them in an array
	 * of ints.
	 * 
	 * @see MesoAbstract#calAverage()
	 */
	public int[] calAverage() {
		//Create array to store the average and the station id in ascii form
		int[] calAverage = new int[3];
		int[] ascii = new int[4];
		
		//converts station id to ascii numbers
		for (int i = 0; i < stID.length(); ++i) {
			ascii[i] = (int)stID.charAt(i);
		}
		
		//finds the average of the ascii numbers
		double average = 0;
		for (int i = 0; i < ascii.length; ++i) {
			average += ascii[i];
		}
		average = average/ascii.length;
		
		//Finds the ceiling, floor, as well as rounds the average up or down 
		calAverage[0] = (int)Math.ceil(average);
		calAverage[1] = (int)Math.floor(average);
		calAverage[2] = (int)Math.round(average);
		return calAverage;
	}
	
	/*
	 * Gets the letter that is repersented by the average ascii number of a station id.
	 * 
	 * @see MesoAbstract#letterAverage()
	 */
	public char letterAverage() {
		//converts average ascii number to a char that repersents a letter.
		char letter;
		int[] ascii = new int[4];
		
		//converts station id to ascii numbers
		for (int i = 0; i < stID.length(); ++i) {
			ascii[i] = (int)stID.charAt(i);
		}
		
		//finds the average of the ascii numbers
		double average = 0;
		for (int i = 0; i < ascii.length; ++i) {
			average += ascii[i];
		}
		average = average/ascii.length;
		int AsciiAvg = (int)Math.round(average);
		letter = (char)AsciiAvg;
		return letter;
		
	}
}
