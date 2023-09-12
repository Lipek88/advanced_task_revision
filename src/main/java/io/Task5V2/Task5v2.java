package io.Task5V2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task5v2 {

    public static void main(String[] args) throws IOException {

        String stringline = "string";

        try {


//            FileWriter fw = new FileWriter("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task5v2\\testowy", true);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task5v2\\testowy"));

            while ((stringline = bufferedReader.readLine()) != null) {
//                stringline = bufferedReader.readLine();
                System.out.println(stringline);
                stringline = stringline.replaceAll(".", "");
//                fw.write(stringline);
                System.out.println(stringline);
//                fw.close();
            }

//            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(stringline);
    }
}
