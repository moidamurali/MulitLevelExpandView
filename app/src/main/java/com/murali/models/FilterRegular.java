
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilterRegular {

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
