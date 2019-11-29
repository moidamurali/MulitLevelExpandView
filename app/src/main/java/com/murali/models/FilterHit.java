
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterHit {

    private FilterPricing pricing;
    private String brand;
    private FilterAttributes attributes;
    private FilterVariants variants;
    private List<FilterCategory> categories = null;
    private FilterReviews reviews;
    private FilterParent parent;
    private FilterImages images;
    private List<String> offers = null;
    private String iconUri;
    private String title;
    private String referenceUri;
    private String highlight;
    private String objectId;

    public FilterPricing getPricing() {
        return pricing;
    }

    public void setPricing(FilterPricing pricing) {
        this.pricing = pricing;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public FilterAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(FilterAttributes attributes) {
        this.attributes = attributes;
    }

    public FilterVariants getVariants() {
        return variants;
    }

    public void setVariants(FilterVariants variants) {
        this.variants = variants;
    }

    public List<FilterCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<FilterCategory> categories) {
        this.categories = categories;
    }

    public FilterReviews getReviews() {
        return reviews;
    }

    public void setReviews(FilterReviews reviews) {
        this.reviews = reviews;
    }

    public FilterParent getParent() {
        return parent;
    }

    public void setParent(FilterParent parent) {
        this.parent = parent;
    }

    public FilterImages getImages() {
        return images;
    }

    public void setImages(FilterImages images) {
        this.images = images;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    public String getIconUri() {
        return iconUri;
    }

    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReferenceUri() {
        return referenceUri;
    }

    public void setReferenceUri(String referenceUri) {
        this.referenceUri = referenceUri;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public class FilterVariants {

        @SerializedName("colours")
        @Expose
        private List<String> colours = null;

        public List<String> getColours() {
            return colours;
        }

        public void setColours(List<String> colours) {
            this.colours = colours;
        }

    }

    public class FilterImages {

        @SerializedName("thumbnailImage")
        @Expose
        private String thumbnailImage;

        @SerializedName("thumbnail")
        @Expose
        private String thumbnail;

        public String getThumbnailImage() {
            return thumbnailImage;
        }

        public void setThumbnailImage(String thumbnailImage) {
            this.thumbnailImage = thumbnailImage;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

    }

    public class FilterParent {

        @SerializedName("product")
        @Expose
        private String product;

        @SerializedName("partNumber")
        @Expose
        private String partNumber;

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getPartNumber() {
            return partNumber;
        }

        public void setPartNumber(String partNumber) {
            this.partNumber = partNumber;
        }

    }

    public class FilterPricing {

        @SerializedName("current")
        @Expose
        private FilterCurrent current;

        @SerializedName("regular")
        @Expose
        private FilterRegular regular;

        @SerializedName("perUnit")
        @Expose
        private String perUnit;

        public FilterCurrent getCurrent() {
            return current;
        }

        public void setCurrent(FilterCurrent current) {
            this.current = current;
        }

        public FilterRegular getRegular() {
            return regular;
        }

        public void setRegular(FilterRegular regular) {
            this.regular = regular;
        }

        public String getPerUnit() {
            return perUnit;
        }

        public void setPerUnit(String perUnit) {
            this.perUnit = perUnit;
        }

    }

    public class FilterCurrent {

        @SerializedName("currency")
        @Expose
        private String currency;

        @SerializedName("value")
        @Expose
        private Double value;

        @SerializedName("text")
        @Expose
        private String text;

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

    public class FilterCategory {

        @SerializedName("name")
        @Expose
        private List<String> name = null;

        @SerializedName("label")
        @Expose
        private List<String> label = null;

        public List<String> getName() {
            return name;
        }

        public void setName(List<String> name) {
            this.name = name;
        }

        public List<String> getLabel() {
            return label;
        }

        public void setLabel(List<String> label) {
            this.label = label;
        }

    }

}
