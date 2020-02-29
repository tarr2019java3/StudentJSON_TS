package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONtils {

    public JSONtils() {
    }

    public JSONtils(String file, ArrayList list) {

    }

    public void writeList(String filename, List<Student> students){
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            objectMapper.writeValue(new File(filename+".json"), students);
        }
        catch (IOException e)   {
            e.printStackTrace();
        }
    }
    public void readList(String file){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Student[] students = objectMapper.readValue(new File(file), Student[].class);
            for(Student stu: students){
                System.out.println(stu.getName()+" "+ stu.getLastname()+" " +"lat " + stu.getIndex());
            }
        }
        catch (IOException e)   {
            e.printStackTrace();
        }
        System.out.println();
    }




}
