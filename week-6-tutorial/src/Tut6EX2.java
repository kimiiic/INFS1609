public class Tut6EX2{

    public static void main(String[] args){
        int sampleInput[] = {1,2,3,4,5};
        int sum = sumArray(sampleInput);
        System.out.println("The sum is: "+sum);
    }

    public static int sumArray(int[] inputArray){
        int sum = 0;

        for(int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }

}