package DefiningClasses;

public class Car {
    private String brand;
    private String model;
    private int horsePower;


    public Car(String brand) {
        this(brand, "unknown", -1); // преизвиквам конструктор

//        this.brand = brand;
//        this.model = "unknown";
//        this.horsePower = -1;
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand; // this - полето на текущия brand на текущата кола
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

//    public String carInfo() {
//        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
//    }

    @Override // означава, че идва от по-базов тип и следи да не объркам нещо
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }
}