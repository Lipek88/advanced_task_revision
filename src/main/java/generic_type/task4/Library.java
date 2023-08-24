package generic_type.task4;

import java.util.Arrays;

public class Library <T>{ /* w przypadku takiego zpisu przyjmuje wszystkie typu T*/
//public class Library <T extends GenericItem>{ /* w przypadku takiego zpisu przyjmuje tylko tyty rozszerzaj&#x105;ce GenericItzem

    /*zabezpiecza nas to przed dodaniem obiektu, kt&oacute;re nie dziedzicz&#x105; o obiekcie bazowym nie b&#x119;d&#x105;cyn GenercicItem*/
    /* mamy 10 klas różnego typu. Chcemy, aby nasza klasa Library korzystała tylko z 5 tych klas,
    to muszą być to klasy dziedziczące po klasie rodzicu "GenericItem"> */
    private T[] elements;

    public Library(T[] elements) {
        this.elements = elements;
    }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Library{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
