import java.util.Arrays;
public class Task11 {

    static class Employee {
        int id;
        int[] hours;
        int totalHours;

        public Employee(int id, int[] hours) {
            this.id = id;
            this.hours = hours;
            this.totalHours = Arrays.stream(hours).sum();
        }
    }

    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        Employee[] employees = new Employee[hours.length];
        for (int i = 0; i < hours.length; i++) {
            employees[i] = new Employee(i, hours[i]);
        }
        Arrays.sort(employees, (e1, e2) -> Integer.compare(e2.totalHours, e1.totalHours));

        System.out.println("Employee Total Hours in Decreasing Order:");
        for (Employee e : employees) {
            System.out.printf("Employee %d: %d%n", e.id, e.totalHours);
        }
    }
}

