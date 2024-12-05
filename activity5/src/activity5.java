
public class activity5 {

    public static void main(String[] args) {

        String[] month = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUN", "JULY", "AUGUST", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DECEMBER"};
        String[] rent_due = {"31/1/2016", "28/2/2016", "31/3/2016", "30/4/2016", "31/5/2016", "30/6/2016", "31/7/2016", "30/8/2016", "31/9/2016", "30/10/2016", "31/11/2016", "30/12/2016"};
        String[] unit_number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        String[] building_number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        double price_per_unit = 800;

        for (int i = 0; i < 12; i++) {
            System.out.println("Payment Coupon for " + month[i] + "\n" + "Building No: " + building_number[i] + "\t\t\tUnit No: " + unit_number[0] + "\n\nAmount of Rent: RM" + price_per_unit + "\nRent Due: " + rent_due[i]);
            System.out.println("-------------------------------------------------------------");
        }
    }
}
