package task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList carArr = new ArrayList();
        for (int i = 0; i <r.nextInt(10)+1; i++) {
            Car car = new Car(r.nextInt(120)+20,r.nextInt(39)+1980,
                    new Wheel(r.nextInt(30)+20, "leather"),new Engine(r.nextInt(9)+2));
            carArr.add(car);

        }
        System.out.println("1-toString, 2-fillTheSameCar");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:{
                System.out.println(carArr);
                break;
            }
            case 2:{
                Car c = new Car(100,2000,new Wheel(30,"leather"),new Engine(6));
                carArr.clear();
                for (int i = 0; i <r.nextInt(10)+1; i++) {
                    carArr.add(c);
                }
                System.out.println(carArr);
                break;
            }
        }
    }
}
