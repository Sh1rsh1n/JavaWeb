package shirshin.homework_4.models;

public enum Discount {

    DIS_ZERO(0), DIS_FIVE(5), DIS_TEN(10), DIS_FIFTEEN(15), DIS_TWENTY(20);
    
    private int discount;

    Discount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
