package Assignment2part2.Q7;

import java.util.*;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address [plotNo=" + plotNo + ", at=" + at + ", post=" + post + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Address> addressMap = new TreeMap<>();

        Address address1 = new Address("123", "Main Street", "Ranchi");
        Address address2 = new Address("456", "Park Avenue", "Bhubaneswar");

        addressMap.put("Utkarsh", address1);
        addressMap.put("Komolika", address2);

        System.out.println("Addresses in TreeMap:");
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Person: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}