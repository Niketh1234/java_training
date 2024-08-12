import java.util.Scanner;
public class Program{
    public static void main(String args[]){
        do{
            byte choice;
            System.out.println("1. Registration\n2. Buy\n3. Exit");
            System.out.println("Enter your choice : ");
            switch(new Scanner(System.in).nextByte())
            {
                case 1:  
                    byte choice2;
                    System.out.println("1. Flat\n2. House\n");
                    System.out.println("Enter you choice : ");
                    switch(new Scanner(System.in).nextByte())
                    {
                        case 1:
                            System.out.println("Enter the Details of the Flat");
                            Flat fObj = new Flat();
                            fObj.accept();
                            fObj.showDetails();
                            System.out.println("Redirecting to the Menu....");
                            break;
                        case 2:
                            System.out.println("Enter the Details of the House");
                            House hObj = new House();
                            hObj.accept();
                            hObj.showDetails();
                            System.out.println("Redirecting to the Menu...");
                            break;
                    }  
                    break;                
                case 2:
                    break;
                case 3:
                    System.exit(0);
            }

        }while(true);
    }
}