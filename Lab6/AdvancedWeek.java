public class AdvancedWeek {
    // Initializing variables
    private int index = 1;
    private String day_1 = "Monday";
    private String day_2 = "Tuesday";
    private String day_3 = "Wednesday";
    private String day_4 = "Thursday";
    private String day_5 = "Friday";
    private String day_6 = "Saturday";
    private String day_7 = "Sunday";
    

    // printing out the days
    public void printDays() {
        System.out.println( "The advanced days of the week are: " + "\n" +
index + ": " + day_1 + ",\n" +
(index + 1) + ": " + day_2 + ",\n" +
(index + 2) + ": " + day_3 + ",\n" +
(index + 3) + ": " + day_4 + ",\n" +
(index + 4) + ": " + day_5 + ",\n" +
(index + 5) + ": " + day_6 + ",\n" +
(index + 6) + ": " + day_7 + "." );
    }
}
