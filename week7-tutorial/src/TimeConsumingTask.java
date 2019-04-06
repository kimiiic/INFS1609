public class TimeConsumingTask {
    public static void shortTask(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
    }

    public static void mediumTask(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }
    }

    public static void longTask(){
        try {
            Thread.sleep(10000);
        } catch (Exception e){

        }
    }
}