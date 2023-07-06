package bt.DongHoBamGio;

public class StopWatch {
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }



    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    private long endTime;
    private long startTime;
    public long getStartTime() {
        return startTime = System.currentTimeMillis();
    }
    public long start () {
         this.startTime =  System.currentTimeMillis();
         return this.startTime;
    }
    public long stop() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }
   
    public long getElapsedTime () {
        return this.endTime - this.startTime;
    }

}
