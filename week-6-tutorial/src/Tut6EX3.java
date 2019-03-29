public class Tut6EX3{
    public static void main(String[] args){
        int[] setA = {1,2,3,4,5};
        int[] setB = {2,4,6,7,8};
        printArray(arrayProduct(setA, setB));
    }

    public static int[] arrayProduct(int[] arrayA, int[] arrayB){
        int[] productArray = new int[arrayA.length];

        for(int i = 0; i < arrayA.length; i++) {
            productArray[i] = arrayA[i] * arrayB[i];
        }
        return productArray;
    }

    public static void printArray(int[] array){
        System.out.print("{"+array[0]);
        for (int i = 1; i < array.length; i++){
            System.out.print(","+array[i]);
        }
        System.out.println("}");
    }
}