package com.rddc.miw.oceandataretrieval.Model;

public class Product {

    private final String productUrl;
    private final String description;

    public Product(String productUrl, String description) {
        this.description = description;
        this.productUrl = productUrl;
    }

    public String getProductUrl() { return this.productUrl; }
    public String getDescription() { return this.description; }
}
