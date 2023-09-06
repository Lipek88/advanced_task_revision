package io.task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task2\\plikTask2.txt");
        file.createNewFile();

        try{
            String line;  //zmienna, w której przetrzymywany jest dana linijka tekstu z pliku
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Java\\advanced_task_revision\\src\\main\\java\\io\\task2\\test1"));
            while ((line = bufferedReader.readLine()) != null){  // tu weryfikujemy, czy nie ma pustej linijki. "Enter" traktowany jets jako normalna linijka
                System.out.println(line);  //tu wyswietlamy linijkę
            }
            bufferedReader.close(); //zamykamy otwarty plik
        }catch (IOException e){
            e.getMessage();
        }
        ;
    }


}
