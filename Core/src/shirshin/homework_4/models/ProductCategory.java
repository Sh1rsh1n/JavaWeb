

public enum ProductCategory {

    PREMIUM("premium"), STANDARD("standart");

    private String category;

    public ProductCategory(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }
}
