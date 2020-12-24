package speedConverter;

 public class SpeedConversion {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else
            return Math.round(kilometersPerHour / 1.609);
    }

}
