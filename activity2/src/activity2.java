public class activity2 {
      public static void main(String[] args) {
    
    int kilogram = 1;
    double pound = 0;

    while(kilogram < 200)
    {
      pound = kilogram * 2.2;
      System.out.print("kilogram:" + kilogram+"\t"+"pound:" + pound + "\t");

      // kilogram = kilogram + 2;

      kilogram += 2;
    }
  }
}
