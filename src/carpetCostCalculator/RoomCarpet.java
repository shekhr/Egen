package carpetCostCalculator;

public class RoomCarpet extends RoomDimensions{
    private double costPerSqFt;

    public double getCostPerSqFt() {
        return costPerSqFt;
    }

    public void setCostPerSqFt(double costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }

    public RoomCarpet(){

    }

    public RoomCarpet(RoomDimensions roomDimensions, double costPerSqFt){
        super(roomDimensions);
        setCostPerSqFt(costPerSqFt);
    }

    public double getCarpetCost(){
        return costPerSqFt * super.getArea();
    }
}
