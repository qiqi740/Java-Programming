public class Lab6Task14 {
    public static void main(String[] args) {
        final double INITIAL_TUITION = 10000;
        final double INCREASE_RATE = 1.07;
        double currentTuition = INITIAL_TUITION;
        int years = 0;

        while (currentTuition < 2 * INITIAL_TUITION) {
            currentTuition *= INCREASE_RATE;
            years++;
        }

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in %d years\n", currentTuition, years);
    }
}