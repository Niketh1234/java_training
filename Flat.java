package estate;
public class Flat{
    double area = 1330;
    int bhk = 2;
    public double calculateLease(){
        return bhk * area;
    }
    public void showLease(){
        System.out.println("area is : "+calculateLease());
    }
}