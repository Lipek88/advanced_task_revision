package io.task3;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {

        try{
            String line;  //zmienna, w której przetrzymywany jest dana linijka tekstu z pliku
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Java\\advanced_task_revision\\src\\main\\java\\io\\task2\\test1.txt"));
            bufferedWriter.write("Nowa linijka teksu");
            bufferedWriter.close();
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }


    }

