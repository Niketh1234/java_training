import java.util.Scanner;
public class House extends Property{
    byte bhk;
    boolean isParking;
    double plinthArea;
    public void accept()
    {
        super.accept();
        System.out.println("Enter the no.of bhk : ");
        bhk = new Scanner(System.in).nextByte();
        System.out.println("Parking Availablity (true/false) : ");
        isParking = new Scanner(System.in).nextBoolean();
        System.out.println("Enter the plinth area in sq.ft : ");
        plinthArea = new Scanner(System.in).nextDouble();
    }
    public void showDetails()
    {
        super.showDetails();
        System.out.println("The bhk, isParking, plinthArea Details");
    }
}