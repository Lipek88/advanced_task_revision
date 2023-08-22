package generic_type.task2;
/*
jeśli gdziekolwiek w ciele klasy przyjmujemy jakikolwiek typ generyczny to musi on się
pojawić przy nazwie klasy
 */
public class Task1 <T>{

   public static <T> int countIf(T[] table, Validator<T> validator){
       //TODO dlaczego jest zapis "<T> int" powyżej
       int counter = 0;
       for (T element : table)
           if(validator.valid(element)){
               counter++;
           }
       return counter;
   }
}
