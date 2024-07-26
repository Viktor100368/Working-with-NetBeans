/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tregulovcourse.nestedclasses.static_nested_class;

/**
 *
 * @author Victor
 */
public class TestCar {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(100);
        System.out.println(engine);
        Car car = new Car("red",4,engine);
        System.out.println(car);
    }
}
class Car{
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method(){
        System.out.println(Engine.counterOfObjects);
        Engine en = new Engine(100);
        System.out.println(en.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }
    public static class Engine{
        private int horsePower;
         static private int counterOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            counterOfObjects++;
            System.out.println(a);
          //  System.out.println(doorCount);
        }

        @Override
        public String toString() {
            return "Engine{" + "horsePower=" + horsePower + '}';
        }
         
     }
}
