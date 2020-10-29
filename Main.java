package com.danielgluhak;

public class Main {

    public static void main(String[] args) {

       Fridge candy = new Fridge(new Dimension(185,60,60), "Candy", "2", "Silver", 2015);
       Microwave gorenje = new Microwave(new Dimension(40,65,45), "analog", "Silver", 2020, 1000);
       Owen bosch = new Owen(new Dimension(80,80,65), "Bosch", "Digital/analog", "Silver/black", 2020);

       Kitchen kitchen = new Kitchen(candy, gorenje, bosch);

       kitchen.allDevices();

       bosch.lightOn();

       gorenje.adjustIntensity(1002);




    }
}
