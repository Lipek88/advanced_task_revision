package io.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task2\\plikTask2.txt");
        file.createNewFile();

        try{
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task2\\plikTask2.txt"));
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (IOException e){
            e.getMessage();
        }
        ;
    }


}
