package io.task3;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        try{
            String line;  //zmienna, w której przetrzymywany jest dana linijka tekstu z pliku
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Java\\advanced_task_revision\\src\\main\\java\\io\\task3\\task3file"));
            /* jeśli stworzyny plik txt to w sciezce nie przywolujemy skrotu txt (nazwa.txt) bo JDK zinterpretuje to jako zupelnie nowy plik.
              */
            Scanner scanner = new Scanner(System.in);

//            bufferedWriter.write("Nowa linijka teksu");
            bufferedWriter.write(scanner.nextLine());
            bufferedWriter.close();
            }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }


    }

