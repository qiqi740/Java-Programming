public class Main {
    public static void main(String[] args) {
        Loan al = new Loan();
        System.out.println(al.getTotalPayment());
        System.out.println(al.getLoanAmount());
        System.out.println(al.getAnnualInterestRate());
        System.out.println(al.getLoanDate());
        System.out.println(al.getMonthlyPayment());
        System.out.println(al.getNumberOfYears());
    }
}

