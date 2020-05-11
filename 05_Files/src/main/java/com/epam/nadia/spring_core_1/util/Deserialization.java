package com.epam.nadia.spring_core_1.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserialization {

    private static final Logger LOGGER = LogManager.getLogger(Deserialization.class.getName());

    private Deserialization(){}

    public static<T> T deserialize(String fileName){

        T object = null;

        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object = (T) in.readObject();

            in.close();
            file.close();

            LOGGER.info("Object has been deserialized");
        } catch (IOException ex) {
            LOGGER.error("IOException is caught");
        } catch (ClassNotFoundException ex) {
            LOGGER.error("ClassNotFoundException is caught");
        }

        return object;
    }
}
