package Package_Car;

public class UtilityVehicle extends Car {
    private boolean isFourWheelDrive;

    public UtilityVehicle(int vinNumber, String make, String model, int mileage, boolean isFourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        isFourWheelDrive = fourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }
}
