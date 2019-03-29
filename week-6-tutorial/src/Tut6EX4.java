public class Tut6EX4{

    public static void main(String[] args){
        String[] testData = {"a","even","set","test"};
        String[] test2 = {"an", "odd", "set"};
        printArray(pairSwap(testData));
        printArray(pairSwap(test2));
    }

    public static String[] pairSwap(String[] inputArray){
        String[] swappedArray = new String[inputArray.length];

        int aLength = inputArray.length;

        for(int i = 0; i < aLength; i+=2) {
            if(i == aLength-1) {
                swappedArray[i] = inputArray[i];
                break;
            }

            swappedArray[i] = inputArray[i+1];
            swappedArray[i+1] = inputArray[i];
        }
        return swappedArray;
    }

    public static void printArray(String[] array){
        System.out.print("{"+array[0]);
        for (int i = 1; i < array.length; i++){
            System.out.print(","+array[i]);
        }
        System.out.println("}");
    }
}