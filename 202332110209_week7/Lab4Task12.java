import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab4Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full year (e.g., 2012): ");
        int year = scanner.nextInt();

        System.out.print("Enter month as number between 1 and 12: ");
        int month = scanner.nextInt();

        Calendar calendar = new GregorianCalendar(year, month-1, 1);

        System.out.printf("%n   %s %d%n", calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault()), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }

    }
}