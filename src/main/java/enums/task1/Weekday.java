package enums.task1;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
        return this != SATURDAY || this != SUNDAY;
    }

    public boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater(Weekday weekday){
        if (this.ordinal() < weekday.ordinal()){
            System.out.println(this.name() + " is before " + weekday.name());
        }else if (this.ordinal() > weekday.ordinal()){
            System.out.println(this.name() + " is after " + weekday.name());
        }else {
            System.out.println(this.name() + " is the same day " + weekday.name());
        }
    }


}
