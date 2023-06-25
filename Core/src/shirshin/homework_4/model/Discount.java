package shirshin.homework_4.model;

public enum Discount {
    DIS_0(0), DIS_5(5), DIS_10(10), DIS_15(15), DIS_20(20);

    private int discount;

    Discount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
