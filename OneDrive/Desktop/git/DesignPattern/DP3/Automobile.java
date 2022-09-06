package DP3;

public class Automobile {
    private String plate;
    private Type type;

    public Automobile(String plate){
        this.plate = plate;
    }
    public void setType(Type type){
        this.type = type;
    }
    public Type getType(){
        return type;
    }
}
enum Type{
    TRUCK, CAR, CARRIAGE
}
