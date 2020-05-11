package com.epam.nadia.spring_core_1.util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    private static final Logger LOGGER = LogManager.getLogger(Serialization.class.getName());

    private Serialization(){}

    public static void serialize(String fileName, Object object) {
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            LOGGER.info("Object has been serialized");

        } catch (IOException ex) {
            LOGGER.error("IOException is caught");
        }
    }
}
