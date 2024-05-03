package Assignment2part2.Q3;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
     int ModelNo;
    String name;
    private int stock;
    Car(int ModelNo, String name, int stock){
        this.ModelNo=ModelNo;
        this.name=name;
        this.stock=stock;
    }
    @Override
    public int compareTo(Car other){
        return Integer.compare(this.stock, other.stock);
    }
    @Override
    public String toString() {
        return "Car [ModelNo=" + ModelNo + ", name=" + name + ", stock=" + stock + "]";
    }

    

}

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> list=new ArrayList<>();
        
        list.add(new Car(2018, "Kia", 20));
        list.add(new Car(2017, "Audi", 45));
        list.add(new Car(2013, "Hundai", 10));
        list.add(new Car(2020, "MG", 13));
        list.add(new Car(2015, "BMW", 55));
        System.out.println("List before sorting:");
        for(Car car:list){
            System.out.println(car);
        }
        Collections.sort(list);
        System.out.println("List after sorting:");
        for(Car car:list){
            System.out.println(car);
        
        }
    }
    
}
