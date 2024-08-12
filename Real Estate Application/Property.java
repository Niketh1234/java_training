import java.util.Scanner;
public class Property{
    double area,rate;
    String location;
    DealType dtype;
    public void accept()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Area in sq.ft : ");
        area = sc.nextDouble();
        System.out.println("Enter the Rate : ");
        rate = sc.nextDouble();
        System.out.println("Enter the Location : ");
        location = sc.next();
    }
    public void showDetails()
    {
        System.out.println("These are the details");
    }
}