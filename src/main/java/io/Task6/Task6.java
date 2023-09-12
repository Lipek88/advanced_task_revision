package io.Task6;

import java.io.*;

public class Task6 {

    public static void main(String[] args) {

        try{
            Movie movieToSerialize = new Movie(100, "Titanic", "Drama", "ByleKto", 1990);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("movie.txt"));
            out.writeObject(movieToSerialize);
            out.flush();
            out.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileIn = new FileInputStream("movie.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Movie movieToDeserialize = (Movie) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(movieToDeserialize);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}
