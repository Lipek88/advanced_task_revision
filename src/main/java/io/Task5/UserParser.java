package io.Task5;

public class UserParser {

    public User parser(String csvLine){
        String[] line = csvLine.split(", ");
        return new User(line[0], line[1], Integer.parseInt(line[2]));
    }
}
