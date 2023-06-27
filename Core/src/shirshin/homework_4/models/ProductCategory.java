package shirshin.homework_4.models;

public enum ProductCategory {

    PREMIUM("premium"), STANDARD("standard");

    private String category;

    ProductCategory(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }
}
