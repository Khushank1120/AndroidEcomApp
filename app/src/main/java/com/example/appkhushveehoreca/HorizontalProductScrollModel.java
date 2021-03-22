package com.example.appkhushveehoreca;

public class HorizontalProductScrollModel {

    private int productImage;
    private String productTitle;
    private String productDescription;
    private String productDescription1;
    private String productPrice;

    public HorizontalProductScrollModel(int productImage, String productTitle, String productDescription, String productDescription1, String productPrice) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productDescription1 = productDescription1;
        this.productPrice = productPrice;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductDescription1() {
        return productDescription1;
    }

    public void setProductDescription1(String productDescription1) {
        this.productDescription1 = productDescription1;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}