package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	Student student = new Student("Jan", "Kowalski", 32);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("student.json"), student);
        }
        catch (IOException e)   {
            e.printStackTrace();
        }
    }
}
