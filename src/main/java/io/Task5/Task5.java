package io.Task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) throws IOException {

        UserParser userParser = new UserParser();

        Path path = Paths.get("D:/Java/advanced_task_revision/src/main/java/io/Task5/List");
        List<String> lines = Files.readAllLines(path);
        List<User> users = new ArrayList<>();  // stworzona lista userow

        for(String line : lines){
            User user = userParser.parser(line);  // tu metoda z klasy userParser zwraca nowy obiekt User, ktory zostaje utwozrony z danej linijki z pliku tekstowego
            users.add(user); //a tu dodajemy nowy obiekt User do listy userow
        }

        users.forEach(System.out::println);


    }
}
