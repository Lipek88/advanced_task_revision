package io.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            String filename =
                    "C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task3\\plikTask3.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Java I/0 Exercises1111111111111\n");
            fw.write("second");
            fw.close();
            BufferedReader br = new BufferedReader(new
                    FileReader(filename));
            while (strLine != null) {
//                stringBuilder.append(strLine);
//                stringBuilder.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("I0Exception: " +
                    ioe.getMessage());
        }
    }
}
