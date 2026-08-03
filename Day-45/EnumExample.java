enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumExample {

    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);

        System.out.println("\nAll Days:");

        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}