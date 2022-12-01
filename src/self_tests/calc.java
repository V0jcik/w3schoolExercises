package self_tests;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class calc {

    public static void main(String[] args) {
        //getting local time, date, day of week and other details in local timezone
        Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());

        int currentMonth = localCalendar.get(Calendar.MONTH);
        int currentYear = localCalendar.get(Calendar.YEAR);

        String[] cmonth = {"Styczeń","Luty","Marzec","Kwiecień","Maj","Czerwiec","Lipiec","Sierpień","Wrzesień","Październik","Listopad","Grudzień"};
        int[] days = {31, ((currentYear%4==0) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        System.out.println("\nAktualny miesiąc: " + (cmonth[currentMonth]));
        System.out.println("Aktualny rok: " + currentYear);

        System.out.print("\nNOC - 8h x 1.5 \nDZIEN - 12h \nHOLIDAY/WEEKEND - 12h x 1.5\nPRE-WEEK - 10h x 1.5\n");

        Scanner scan = new Scanner(System.in);

        System.out.print("\nPodaj stawkę: ");
        double stawka = Double.parseDouble(scan.nextLine());
        System.out.print("\n");
        double result = 0;

        String input;

        for(int i = 0; i < days[currentMonth]; i++){
            System.out.print((i + 1)+ " " + cmonth[currentMonth] + " : ");
            input = scan.nextLine();
            if(input.equals("d")){
                result = result + (stawka*12);
            }
            if(input.equals("n")){
                result = result + (stawka*8*1.5) + (stawka*4);
            }
            if(input.equals("wh")){
                result = result + (stawka*12*1.5);
            }
            if(input.equals("pw")){
                result = result + (stawka*10*1.5) + (stawka*2);
            }
        }
        System.out.println("\n Razem: " + Math.round(result * 100.0) / 100.0);
    }
}