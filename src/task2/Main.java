package task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Car [][] carArr = new Car[r.nextInt(5)+1][r.nextInt(5)+1];
        for (int i = 0; i <carArr.length ; i++) {
            for (int j = 0; j <carArr[i].length ; j++) {
                Car car = new Car(r.nextInt(120)+20,r.nextInt(39)+1980,
                        new Wheel(r.nextInt(30)+20, "leather"),new Engine(r.nextInt(9)+2));
                carArr[i][j]=car;
            }
        }
        System.out.println("1-toString, 2-fillTheSameCar");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1:{
                System.out.println(Arrays.deepToString(carArr));
                break;
            }
            case 2:{
                Car c = new Car(100,2000,new Wheel(30,"leather"),new Engine(6));
                for (int i = 0; i <carArr.length ; i++) {
                    for (int j = 0; j <carArr[i].length; j++) {
                        Arrays.fill(carArr[i], c);
                    }
                }
                System.out.println(Arrays.deepToString(carArr));
                break;
            }
        }
    }
}
