package wave_generator;

import javax.swing.JFrame;

/**
 * @author Classified
 * @version 1
 * 
 */

public class WuppyWaver
{
	private JFrame aii_Frame;
	private AiiCanvas aii_Canvas;
	
	private int[] m_XPositions;
	private int[] m_YPositions;
	
	private int m_WuppyAmount;
	private int[] m_YHeadings;		// needed for 'opdracht 4' and 'opdracht 5'?
	
////////////////// YOUR CODE - START ///////////////////////	
	
	// Use this space to declare your own instance 
	// variables if you think you need them:
	
	int[] m_position;
	
/////////////////// YOUR CODE - END ////////////////////////
	
	/**
	 * Instanciates our WuppyWaver and initializes + runs it.
	 * 
	 * @param args		Arguments (command line input)
	 * 
	 */
	public static void main(String[] args)
	{
		WuppyWaver waver = new WuppyWaver();
		waver.aiiInitialize();
		waver.aiiCreateArrays();
		waver.onInitialize();
		
		waver.aiiRun();
	}
	
////////////////// YOUR CODE - START ///////////////////////
	
	/**
	 * This method is called at the start of the program. 
	 * Here, we set the initial values of our arrays:
	 */
	private void onInitialize()
	{
		// Use 'm_WuppyAmount' for the amount of wuppys. In aiiInitialize, this variable gets the value 10;
		int increase = 0;
		
		// Loop for every wup we have
		for (int i = 0; i < m_WuppyAmount; i++) {
			
			increase += 50; // We want to have 50 px between all the wups so add 50 to every x per wup
			m_XPositions[i] = increase;
			m_YPositions[i] = 450;
		}
	}
	
	/**
	 * This method is called about 60 times per second. 
	 * Here we change the position of our wuppys so they seem to move:
	 */
	private void performStep()
	{
		// Use 'm_WuppyAmount' for the amount of wuppys. In aiiInitialize, this variable gets the value 10;
		// Loop for every wup we have
		/*for (int i = 0; i < m_WuppyAmount; i++) {
			// Add the index to the wup to make alst go up quicker (o.5 is to make the first one move)
			m_YPositions[i] -= i + 0.5;
		}*/
		
		for (int i = 0; i < m_WuppyAmount; i++) {
			if(m_YPositions[i] < 0) {
				m_position[i] = 1;
			} 
			if(m_YPositions[i] > 550) {
				m_position[i] = -1;
			}
			
			if(m_position[i] == 1) {
				m_YPositions[i] += i+0.5;
			} else {
				m_YPositions[i] -= i+0.5;
			}
		}
	}
	
/////////////////// YOUR CODE - END ////////////////////////
	
	private void aiiInitialize()
	{
		// Create a new frame and add our canvas to draw on:
		aii_Canvas = new AiiCanvas(this);
		
		aii_Frame = new JFrame("Wuppyyyy waverrrr.... !!!");
		aii_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aii_Frame.getContentPane().add(aii_Canvas);
		aii_Frame.pack();
		aii_Frame.setVisible(true);
		m_WuppyAmount = 10;
	}
	
	private void aiiCreateArrays()
	{
		if (m_WuppyAmount > 0)
		{
			m_XPositions = new int[m_WuppyAmount];
			m_YPositions = new int[m_WuppyAmount];
			m_YHeadings = new int[m_WuppyAmount];	// needed for 'opdracht 4' and 'opdracht 5'?
			m_position= new int[m_WuppyAmount];
		}
	}
	
	private void aiiRun()
	{
		while(true)
		{
			try
			{
				Thread.sleep(15);
			}
			catch(Exception e)
			{
				System.out.println("AII Thread Exception: " + e.getMessage());
			}
			performStep();
			aii_Frame.repaint();
		}
	}
	
	public int[] aiiGetXPositions()
	{
		return m_XPositions;
	}
	
	public int[] aiiGetYPositions()
	{
		return m_YPositions;
	}
}
