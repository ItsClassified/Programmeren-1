/**
* The main class of a lap timer application. 
*/

public class AiiLapTimer {

	private TimingEngine engine;
    private AiiUserInterface gui;

    /**
     * Create a new lap timer and show it.
     */
    public AiiLapTimer()
    {
        engine = new TimingEngine();
        gui = new AiiUserInterface(engine);
    }

    /**
     * In case the window was closed, show it again.
     */
    public void show()
    {
        gui.setVisible(true);
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AiiLapTimer timer = new AiiLapTimer();
		timer.show();

	}

}
