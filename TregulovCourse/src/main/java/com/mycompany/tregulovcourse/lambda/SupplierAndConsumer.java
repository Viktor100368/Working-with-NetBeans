/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author Victor
 */
public class SupplierAndConsumer {
    public static ArrayList<Car> createTwoCar(Supplier<Car> supplier){
        ArrayList<Car> list = new ArrayList<>();
        for(int i=0;i<2;i++){
            list.add(supplier.get());
        }
        return list;
    }
    public static void changeCar(Consumer<Car> consumer,Car car){
        consumer.accept(car);
    }
    public static void main(String[] args) {
      ArrayList<Car> ourCar = createTwoCar(()->new Car("Vaz","Black",1.6));
        System.out.println(ourCar);
      changeCar((car)->{
          car.setColor("Blue");
          car.setEngine(6.0);
          car.setModel("Gaz");
      },ourCar.get(1));
        System.out.println(ourCar);       
    }
    
}
class Car{
    private String model;
    private String color;
    private double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", color=" + color + ", engine=" + engine + '}';
    }
    
}