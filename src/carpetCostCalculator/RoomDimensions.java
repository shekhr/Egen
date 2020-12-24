package carpetCostCalculator;

public class RoomDimensions {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

    public RoomDimensions(){
        setLength(0);
        setWidth(0);
    }

    public RoomDimensions(double length,double width){
        setLength(length);
        setWidth(width);
    }
    public RoomDimensions(RoomDimensions rd){
        setLength(rd.length);
        setWidth(rd.width);
    }

    public double getArea(){
        return getLength() * getWidth();
    }
}
