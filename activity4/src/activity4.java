public class activity4 {

    public static void main(String[] args) {

        double tuition_fee = 4000;
        double fee_increase = 0.05;
        double fee_afterIncrease = 0;

        for (int year = 1; year <= 10; year++) {
            tuition_fee = tuition_fee * (1 + fee_increase);
        }
        System.out.printf("University tuition fee for 10 years: RM%.2f%n", tuition_fee);

        for (int year = 1; year <= 4; year++) {
            fee_afterIncrease = fee_afterIncrease + tuition_fee;
        }
        System.out.printf("University tuition fee for 4 years: RM%.2f%n", fee_afterIncrease);
    }
}
