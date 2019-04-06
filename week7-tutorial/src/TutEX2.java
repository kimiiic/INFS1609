public class Tut7EX2{

    public static void main(String[] args){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        TimeConsumingTask.shortTask();
        stopWatch.stop();

        System.out.print(stopWatch.getElapsedTime());

        // TEST
        TimeConsumingTask.shortTask();
        TimeConsumingTask.mediumTask();
        TimeConsumingTask.longTask();
    }

}