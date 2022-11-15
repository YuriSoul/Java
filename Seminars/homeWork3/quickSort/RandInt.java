//package Seminars.homeWork3.quickSort;
public class RandInt {
    int minValue = 0;
    int maxValue = 0;

    public RandInt(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int randIntNum(int minValue, int maxValue){
        int randNum = (int) (Math.random()*((maxValue-minValue)+1)) + minValue;
        return randNum;
    }
}
