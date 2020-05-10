package com.epam.nadia.spring_core_1.util;

import com.epam.nadia.spring_core_1.entity.Employee;

import java.io.*;

public class Deserialization {

    public static void deserialize(String fileName){ //метод дженерик

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (Employee) in.readObject();//!

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("name = " + object1.getName());
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
