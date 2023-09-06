package io.task1;

import java.io.File;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Napisz program, który wyświetli wszystkie pliki/katalogi zawarte w danym katalogu.

 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task1\\plik2.txt");
        File file2 = new File("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task1");
        // file służy do "dobrania się" do jakiegoś folderu/ katalogu. W argumencie konstruktora podajemy ścieżkę, na której chcemy pracować

        file.createNewFile(); // konieczne, by utworzyć plik. Dla file2 chyba nie zadziala
        System.out.println(list("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task1"));
        System.out.println("**********");
        String[] filesList = file2.list(); //nazwy plikow przyjmuja typ String. Tu tworzymy sobie listę nazw plikow, po ktorej pozniej iterujemy
        for (String name : filesList){
            System.out.println(name);  // a tu wyswietlamy nazwy plikow
        }
    }
    public static List<String> list(String dir){
        return Stream.of(new File(dir).listFiles())
                .map(File::getName)
                .toList();
    }
}
