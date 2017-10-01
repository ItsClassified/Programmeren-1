/**
 * The timer engine for a lap timer application. This engine can keep
 * track of a 'run'. A run is a sequence of one or more consecutive laps.
 * The timer records single lap times and the time for the total run, 
 * and it calculate averages and speed. 
 * 
 * @author (Classified) 
 * @version (1)
 */

 /*# 
  * Your task: 
  * - complete the comment above (add your names and version)
  * - implement this class
  * - test until you are convinced that it works correctly
  */

public class TimingEngine {
	
	/**
     * instance variables
     */
	boolean running;
	int lapCount;
	long totalTime;
	long lastTime;
	int lapLength;
	long lapStartTime;
    
    /**
     * Create a TimingEngine object. The object will be initialized at 0,
     * status is "Stopped", ready to start timing. The default lap length
     * is 400m.
     */
    public TimingEngine()
    {
        this.running = false;
        this.lapLength = 400;
    }

    
    /**
     * Instruct the timer to start timing a lap.
     * If we were not timing before, this starts the timer for a new 
     * run. If we were already timing, this starts a new lap, adding the
     * current lap time to the total.
     */
    public void startLap()
    {
        if(!running) {
        	running = true;
        	reset(); // reset all the stats
        	lapStartTime = getSystemTime();
        } else {
        	finishLap();
        }
    }
    
    
    /**
     * Stop timing. Add the current lap time to the total, and set
     * the timer into idle mode (waiting for a new run).
     */
    public void stop()
    {
    	if(running) {
    		finishLap(); // Finish current lap
    		running = false;
    	}
    }
    
    
    /**
     * Return the current status of the timer. The status is one of the
     * two Strings "Timing..." or "Stopped", indicating whether this 
     * timer is currently running or stopped.
     */
    public String getStatus()
    {
    	if(running) {
    		return "Timing...";
    	} else {
    		return "Stopped";
    	}
    }
    
    
    /**
     * Return the number of laps completed in this run.
     */
    public int getLapCount()
    {
        return lapCount; // return number of laps
    }
    
    
    /**
     * Return the time of the last lap completed.
     * 
     */
    public long getLastTime()
    {
        return lastTime; //return the time of the last lap
    }
    
    
    /**
     * Return the average time for a lap in this run.
     */
    public long getAverageTime()
    {
    	if(lapCount != 0) {
    		return (totalTime/lapCount); //return the average time
    	}
		return 0;
    }
    
    
    /**
     * Return the total time of the last or current run.
     */
    public long getTotalTime()
    {
        return totalTime; //return the total time
    }
    
    
    /**
     * Return the average speed in this run in meters per second.
     * The result is a String such as "73 m/s".
     */
    public String getAverageSpeed()
    {
    	long avgSpeed = 0;
    	if(getAverageTime() != 0) {
    		avgSpeed = (lapLength / getAverageTime());  	
    	}
    	return avgSpeed + " m/s"; //return the average speed
    }
    
    
    /**
     * Return the length of a lap.
     */
    public int getLapLength()
    {
    	return lapLength; //return the length of the lap
    }
    
    
    /**
     * Set the length of a lap.
     */
    public void setLapLength(int length)
    {
    	lapLength = length;
    }
    

    /**
     * Private method called whenever a lap is finished. This method
     * updates the statistics.
     */
    private void finishLap()
    {
    	lapCount++;
    	long oldTime = totalTime;
    	totalTime = getSystemTime() - lapStartTime;
    	lastTime = totalTime - oldTime;
    }
    
    private void reset()
    {
    	lapCount = 0;
    	totalTime = 0;
    	lastTime = 0;
    	lapStartTime = 0;
    }
    

    
    
    
    /**
     * Return the current time of the system clock (in milli-seconds).
     */
    private long getSystemTime()
    {
        return System.currentTimeMillis();
    }
}



