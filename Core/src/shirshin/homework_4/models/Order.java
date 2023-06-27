


public class Order {

    private Customer customer;
    private Product product;
    private int amount;
    private float cost;
    private Discount discount;
    
    public Order(){
        discount = chooseRandomDiscount();
    }

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
        discount = chooseRandomDiscount();
        setCost();
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }
    
    /*
    * расчет стоимости всех заказов с учетом скидки
    */
    public void setCost() throws TooMuchSaleException{
        if (product.getProductCategory().equals(ProductCategory.PREMIUM) && discount > 15) {
            throw new ToMuchDiscountException("Discount is too much!");
        } 
        
        float fullPrice = product.getPrice() * amount;
        cost = Math.round((fullPrice - fullPrice * discount / 100) * 100.0) / 100.0f;
    } 
    
    /*
    * выбор случайного % скидки на заказ
    */
    private int chooseRandomDiscount() {
        Discount[] discounts = Discount.values();
        return discounts[new Random().nextInt(5)].getValue();
    }
}
