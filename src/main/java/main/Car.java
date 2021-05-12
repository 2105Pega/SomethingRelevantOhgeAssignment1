package main;

import java.io.Serializable;

public class Car implements Serializable {
    private String engine;
    private int miles;

    Car(){
        this.engine = "V4";
        this.miles = 0;
    }


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
