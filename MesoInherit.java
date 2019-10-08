
public class MesoInherit  extends MesoAbstract {

	//The station Id
	private String stID;
	
	/*
	 * Constructor for MesoInherit takes in one string repersenting the station id.
	 * 
	 * @Param stID The station id..
	 */
	public MesoInherit (String stID) {
		this.stID = stID;
	}
	
	public int[] calAverage() {
		int[] calAverage = new int[3];
		int[] ascii = new int[stID.length()];
		for (int i = 0; i < stID.length(); ++i) {
			ascii[i] = (int)stID.charAt(i);
		}
		double average = 0;
		for (int i = 0; i < ascii.length; ++i) {
			average += ascii[i];
		}
		average = average/ascii.length;
		calAverage[0] = (int)Math.ceil(average);
		calAverage[1] = (int)Math.floor(average);
		calAverage[2] = (int)Math.round(average);
		return calAverage;
	}
}
