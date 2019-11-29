
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilterAttributes {

    @SerializedName("product_type")
    @Expose
    private String productType;

    @SerializedName("color")
    @Expose
    private String color;

    @SerializedName("parentCategory_UK")
    @Expose
    private String parentCategoryUK;

    @SerializedName("format")
    @Expose
    private String format;

    @SerializedName("key_features")
    @Expose
    private String keyFeatures;

    @SerializedName("ProductReviewFlag")
    @Expose
    private String productReviewFlag;

    @SerializedName("Colour")
    @Expose
    private String colour;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParentCategoryUK() {
        return parentCategoryUK;
    }

    public void setParentCategoryUK(String parentCategoryUK) {
        this.parentCategoryUK = parentCategoryUK;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getKeyFeatures() {
        return keyFeatures;
    }

    public void setKeyFeatures(String keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    public String getProductReviewFlag() {
        return productReviewFlag;
    }

    public void setProductReviewFlag(String productReviewFlag) {
        this.productReviewFlag = productReviewFlag;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
