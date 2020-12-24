package feetCentimeter;

public class LengthConverter {
    public static long feetToCentimeters(long feet){
        if(feet < 1)
            return -1;
        else
            return Math.round(feet * 30.48);
    }

    public static double feetToCentimeters(double feet){
        if(feet < 1)
            return -1;
        else
            return feet * 30.48;
    }
}
