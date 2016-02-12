import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        DayOfWeek day = today.getDayOfWeek();
        int days = today.lengthOfMonth();
        int dom = today.getDayOfMonth();
        System.out.println("Today's date : " + today + " Today: " + dom);
        System.out.println("Month : " + month + ", Day of week : " + day);
        System.out.println("Length of this month: " + days);

        int i = 1;
        while (i <= days) {
            LocalDate d=today.minusDays(today.getDayOfMonth()-i);
            DayOfWeek dweek=d.getDayOfWeek();
            System.out.print(i + " - " + dweek + "; ");
            if ((i%7)==0) System.out.println("");
            i++;
        }
    }


}
