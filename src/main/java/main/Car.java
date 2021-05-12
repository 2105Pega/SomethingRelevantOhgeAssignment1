package main;

public class Car {
    private String engine;
    private int miles;


    Car(String engine, int mile){
        this.engine=engine;
        this.miles=miles;
    }


    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }
}
