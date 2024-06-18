package AdvanceLanguageModule.Constructors;

public class Car {

    private String model;
    private int year;
    private Engine engine;

    // Default constructor
    public Car() {}

    // Below 2 are example of constructor overloading.
    // Parameterized constructor 1
    public Car(String model, int year, Engine engine) {
        this.model = model;
        this.year = year;
        this.engine = engine;
    }

    // Parameterized constructor 2
    public Car(String model) {
        this.model = model;
        this.year = 0;
        this.engine = null;
    }

    // Shallow Copy
    public Car(Car otherCar) {
        this.model = otherCar.model;
        this.year = otherCar.year;
        this.engine = otherCar.engine;
    }

    // Deep Copy
    public Car(Car otherCar, boolean isDeepCopy) {
        if (isDeepCopy) {
            this.model = new String(otherCar.model);               // Create a new string
            this.year = otherCar.year;
            this.engine = new Engine(otherCar.engine.getType());   // Create a new Engine
        }
        else {
            new Car(otherCar);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + ", engine=" + engine + "]";
    }

    public static void main(String[] args) {
        Engine engine = new Engine("V12");
        Car originalCar = new Car("Toyota", 2020, engine);

        // Shallow Copy
        Car shallowCopyCar = new Car(originalCar);

        // Deep Copy
//        Car deepCopyCar = new Car(originalCar, true);
        Car deepCopyCar = new Car(originalCar.model, originalCar.year, originalCar.engine);

        // Modify the Deep Copy
        deepCopyCar.setModel("Honda");
        deepCopyCar.getEngine().setType("V10");

        System.out.println("Original Car: " + originalCar);
        System.out.println("Shallow Copy Car: " + shallowCopyCar);
        System.out.println("Deep Copy Car: " + deepCopyCar);
    }
}
