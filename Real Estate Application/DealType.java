public enum DealType{
    RENT(1), LEASE(2), SALE(3);
    private int value;
    DealType (int v)
    {
        this.value = v;
    }
}