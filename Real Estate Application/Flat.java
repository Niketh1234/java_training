import java.util.Scanner;
public class Flat extends Property{
    byte floor;
    double deposit;
    public void accept()
    {
        super.accept();
        System.out.println("Enter the no.of floors : ");
        floor = new Scanner(System.in).nextByte();
        System.out.println("Enter the deposit amount : ");
        deposit = new Scanner(System.in).nextDouble();
    }
    public void showDetails(){
        super.showDetails();
        System.out.println("The details of floor and deposti are shown");
    }
}