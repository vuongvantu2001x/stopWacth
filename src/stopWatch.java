import java.util.Calendar;
import java.util.Calendar;
import java.util.Date;

public class stopWatch {
    private long startTime, endTime;
    public stopWatch(){
        start();
    }
    public long getStartTime(){
        return startTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public long getEndTime(){
        return endTime;
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return (endTime-startTime);
    }

    public static void main(String[] args) {
        stopWatch sw = new stopWatch();
        System.out.println(sw.getElapsedTime());
    }
}
