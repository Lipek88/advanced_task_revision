package io.Task4V2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4v2 {

    public static void main(String[] args) throws IOException {

        String stringline = "string";
        String[] splitted = new String[0];
        String longest = "";
        try {


//            FileWriter fw = new FileWriter("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task4v2\\testowy", true);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\macie\\IdeaProjects\\advanced_task_revision\\src\\main\\java\\io\\task4v2\\testowy"));

            while ((stringline = bufferedReader.readLine()) != null) {
//                stringline = bufferedReader.readLine();
                System.out.println(stringline);
                stringline = stringline.replaceAll("\\.", "");
                stringline = stringline.replaceAll("\\?", "");
                stringline = stringline.replaceAll(",", "");
                splitted = stringline.split(" ");
//                fw.write(stringline);
                System.out.println(stringline);
//                fw.close();
            }

//            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (String oneString : splitted) {
            System.out.println(oneString);
            if (oneString.length() > longest.length()) {
                longest = oneString;
            }

//        for (int i = 0; i < splitted.length-1; i++) {
//            System.out.println(splitted[i]);
//            if (splitted[i].length() > longest.length()){
//                longest = splitted[i];
//            }
//        }
            System.out.println("******");
            System.out.println(longest);
            System.out.println("******");
            System.out.println(stringline);
        }
    }
}
