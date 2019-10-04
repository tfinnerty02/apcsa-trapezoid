import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
   
    System.out.print("\nEnter a top length: ");
    double topLength = in.nextDouble();
    
    System.out.print("Enter a bottom length: ");
    double bottomLength = in.nextDouble();
    
    System.out.print("Enter a height: ");
    double height = in.nextDouble();
    
    double area = (( topLength + bottomLength)/2) * height;
    System.out.printf("\nThe area of the trapezoid is %.1f", area);
    System.out.print(" square units.\n");
    
    in.close();
  }
}
