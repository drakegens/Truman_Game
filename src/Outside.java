/**
 * 
 * @author Seth Martin
 * @version 12/2
 */
public class Outside extends Room{

	private int weather;
	/**
	 * weather has 4 states
	 * 0 is sunny
	 * 1 is cloudy
	 * 2 is raining
	 * 3 is windy
	 */
	public Outside() {
		weather = 4 *(int) Math.random();
	}
}
