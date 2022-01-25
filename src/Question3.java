
public class Question3 {
    public static void main(String[] args){
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentseconds = totalSeconds % 60;
        long totalMinutes = totalSeconds/60;
        long currentminute = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        long currenthours = totalHours % 24;
        System.out.println("Current time is " + currenthours + ":" + currentminute + ":" + currentseconds + " GMT");
    }
}
