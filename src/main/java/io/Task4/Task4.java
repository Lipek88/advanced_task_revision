package io.Task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task4\\plikTask4.txt")); //slasze w prawo zamiast dwóch slaszy w lewo

        String temporary ="";

        try{
            String stringline;


            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task4\\plikTask4.txt"));
            while((stringline = bufferedReader.readLine()) !=null)
            {
                if(stringline.length()>temporary.length())
                temporary=stringline;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(temporary);

    }
}
