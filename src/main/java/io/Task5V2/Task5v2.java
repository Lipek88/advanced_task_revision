package io.Task5V2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5v2 {

    public static void main(String[] args) {

        String stringline;

        try {


            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Java\\advanced_task_revision\\src\\main\\java\\io\\Task5V2\\testowy"));

            while ((stringline = bufferedReader.readLine()) != null) {
//                stringline = bufferedReader.readLine();
                    stringline = stringline.replaceAll(".", "");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringline);
    }
}
