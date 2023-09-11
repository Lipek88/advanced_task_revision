package io.Task5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {

    public static void main(String[] args) throws FileNotFoundException {


        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("D:/Java/advanced_task_revision/src/main/java/io/Task5/test")); //slasze w prawo zamiast dwóch slaszy w lewo

        String temporary ="";

        try{
            String stringline;


            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Java\\advanced_task_revision\\src\\main\\java\\io\\Task5\\test"));
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
