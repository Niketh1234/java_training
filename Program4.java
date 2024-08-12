class Program4{
    public static void main(String args[])
    {
        Object[] collection = new Object[3];
        collection[0] = 10;
        collection[1] = 1.0;
        collection[2] = "actalent";

        for(Object o : collection)
            System.out.println(o);

            
        System.out.println(Float.parseFloat(collection[1].toString())+Integer.parseInt(collection[0].toString()));
    }
}