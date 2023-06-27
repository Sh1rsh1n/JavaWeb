package com.geekbrains.javacore.lesson4;

public enum ProductCategory {

    PREMIUM("Премиальный товар"), STANDARD("Не премиальный товар");

    private String category;

    public ProductCategory(String category) {
        this.category = category;
    }
    
    public String getCategory() {
        return category;
    }
}
