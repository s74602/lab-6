import java.util.Scanner;

public class activity1 {
     public static void main(String[] args) {
    
    int integer_number;
    int number_sum = 0,count_positive = 0,count_negative = 0,count = 0;
    double average;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter integer number: ");
    integer_number = input.nextInt();

    while(integer_number != 0 ){

      if(integer_number > 0){
        count_positive = count_positive + 1;
      }
      else{
        count_negative = count_negative + 1;
      }

      number_sum = number_sum + integer_number;
      count++;

      System.out.print("Enter integer number: ");
      integer_number = input.nextInt();
    }

    average = number_sum/count;

    System.out.println("total positive number:"+count_positive);
    System.out.println("total negative number:"+count_negative);
    System.out.println("summation of all number:"+number_sum);
    System.out.printf("Average: %.2f",average);

    input.close();
  } 
}
