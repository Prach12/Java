/*
write a code the determine the calender and day from the date
*/
# -*- coding: utf-8 -*-
import calendar
import datetime
import java.util.Scanner;
class Calendar
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the date (dd/mm/yyyy):");
    String date = scanner.nextLine();
    String[] parts = date.split("/");
    int day = Integer.parseInt(parts[0]);
    int month = Integer.parseInt(parts[1]);
    int year = Integer.parseInt(parts[2]);
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);
    System.out.println("Day of the week: " + calendar.get(Calendar.DAY_OF_WEEK));

}