public class StopWatch {
    // Attributes
    // startTime, endTime and boolean started
    private long startTime;
    private long endTime;
    private boolean started;

    // Constructors
    // A constructor that should initialise all the values to a sensible default
    public StopWatch() {
        this.startTime = 0;
        this.endTime = 0;
        this.started = false;
    }

    public StopWatch(long startTime, long endTime, boolean started) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.started = started;
    }

    // startTime
    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // endTime
    public long getEndtime() {
        return this.endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // start() - a method start() that returns a boolean
    public boolean start() {
        if(this.started == false) { // IF the stop watch isn't already started
            this.startTime = System.currentTimeMillis(); // sets startTime to the current time
            this.started = true;
            return true;
        } else { // stopwatch already started (started is true)
            return false; // returns false if the stop watch is already started
        }
    }

    //stop() - a method stop() that returns a boolean
    public boolean stop() {
        if(this.started == true) { //IF the stop watch has stopped
            this.endTime = System.currentTimeMillis(); // sets endTime to the current time
            this.started = false; // set status to false (stop)
            return true; // return true
        } else { // stop watch has stopped
            this.started = false; // set status to stopped
            return false; // return false
        }
    }

    // a method getElapsedTime() which returns the time elapsed in milliseconds
    public long getElapsedTime() {
        if(this.started == true) { // if the stop watch is still running
            return 0; // return 0
        } else { // stop watch has stopped
            System.out.print("End time " + this.endTime);
            return this.endTime - this.startTime;
        }
    }
}