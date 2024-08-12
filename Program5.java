import java.util.Scanner;
class Program5{
    public static void main(String args[])
    {
        int [][][] arr = new int[2][2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  numbers : ");
        for(int a = 0;a<arr.length;a++)
        {
            for(int b = 0;b<arr[0].length;b++)
            {
                for(int c = 0;c<arr[0][0].length;c++)
                {
                    arr[a][b][c] = sc.nextInt();
                }
            }
        }
        /*
        for(int a = 0;a<arr.length;a++)
        {
            for(int b = 0;b<arr[0].length;b++)
            {
                for(int c = 0;c<arr[0][0].length;c++)
                {
                    System.out.println(arr[a][b][c]);
                }
            }
        }
        */

        for(int[][] a : arr)
            for(int[] b : a)
                for(int c : b)
                    System.out.println(c);
    }
}