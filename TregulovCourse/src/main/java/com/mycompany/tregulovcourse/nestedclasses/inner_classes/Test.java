/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.nestedclasses.inner_classes;

/**
 *
 * @author Victor
 */
public class Test {
    public static void main(String[] args) {
        Car car = new Car("black",5,150);
        Car car2 = new Car("green",3);
        Car.Engine engine = car2.new Engine(100);
        car2.setEngine(engine);
        System.out.println("car -> "+car);
        System.out.println("car2 -> "+car2);
    }
}
class Car{
    private String color;
    private  int doorCount;    
    Engine engine;

    public Car(String color, int doorCount, int horsePower){    
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }
       
    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;        
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
    public void info(){
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower);
    }


    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }
   public class Engine{
       private  int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" + "horsePower=" + horsePower + '}';
        }
       
   }
}
