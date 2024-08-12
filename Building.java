package estate;
public class Building{
    double area = 1330;
    public double calculateRent(){
        return area * .012;
    }
    public void showRent(){
        System.out.println("area is : " +calculateRent());
    }
}

