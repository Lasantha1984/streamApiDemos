/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamapidemo.filters;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class FilterOutCustomObjectBasedOnProperty {
    
    public static void main(String[] args) {
        List<Customer> list = new ArrayList();
        list.add(new Customer(1, "Sarath", 20));
        list.add(new Customer(2, "Mahesh", 22));
        list.add(new Customer(3, "Ranil", 21));
        list.add(new Customer(4, "Jagath", 16));
        list.add(new Customer(5, "Wicrama", 35));
        list.add(new Customer(6, "Nilani", 25));
        list.add(new Customer(7, "Jayani", 26));
        list.add(new Customer(8, "Kumara", 23));
        list.add(new Customer(9, "Suran", 22));
        list.stream().filter(cust -> cust.getAge() > 21).forEach(cu->System.out.println(cu.name));
        
    }
}
class Customer {
 int Id;
 String name;
 int age;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(int Id, String name, int age) {
        this.Id = Id;
        this.name = name;
        this.age = age;
    }
 
}
