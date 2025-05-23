/*
write a code the determine the calender and day from the date
*/
import java.util.Calendar;
import java.util.Scanner;

class CalendarDayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (dd/mm/yyyy):");
        String date = scanner.nextLine();
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 2=Monday, ...
        System.out.println("Day of the week: " + days[dayOfWeek - 1]);

        scanner.close();
    }
}