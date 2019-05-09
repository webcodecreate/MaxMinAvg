package maxminavg;

public class MaxMinAvg {

    static float[] floatArray;
    static float maxValue;
    static float minValue;
    static float midValue;
    
    MaxMinAvg (int index) {
        floatArray = new float [index];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) Math.random();
        }
    }
    
    public String getFloatOfArray () {
        String finalStringOfArray = "";
        for (float i : floatArray) {
            finalStringOfArray += System.out.printf("%f ", i);
        }
        return finalStringOfArray;
    }
    
    public float getMaxValueOfArray () {
        maxValue = floatArray[0];
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] > maxValue) {
                maxValue = floatArray[i];
            }
        }
        return maxValue;
    }
    
    public float getMinValueOfArray () {
        minValue = floatArray[0];
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] < minValue) {
                minValue = floatArray[i];
            }
        }
        return minValue;
    }
    
    public float getMidValueOfArray () {
        midValue = 0;
        for (int i = 0; i < floatArray.length; i++) {
            midValue += floatArray[i];
        }
        return midValue / floatArray.length;
    }

    public static void main(String[] args) {
        MaxMinAvg mma = new MaxMinAvg(20);
        System.out.print("Array is ");
        mma.getFloatOfArray();
        System.out.println("");
        System.out.println("Max value of array is " + mma.getMaxValueOfArray());
        System.out.println("Min value of array is " + mma.getMinValueOfArray());
        System.out.println("Mid value of array is " + mma.getMidValueOfArray());
    }
    
}
