package enums.task1;

public class Task1Demo {
    public static void main(String[] args) {

        Weekday weekday1 = Weekday.SATURDAY;
        Weekday weekday2 = Weekday.MONDAY;
        System.out.println(weekday1.isHoliday());
        System.out.println(weekday2.isHoliday());

        System.out.println(weekday2.ordinal());
        System.out.println(weekday1.ordinal());
        System.out.println("********");
        weekday2.whichIsGreater(weekday1);
        weekday2.whichIsGreater(Weekday.MONDAY);
        weekday1.whichIsGreater(Weekday.TUESDAY);

    }
}
