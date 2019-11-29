
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilterReviews {

    @SerializedName("rounded")
    @Expose
    private Integer rounded;

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("average")
    @Expose
    private Double average;

    public Integer getRounded() {
        return rounded;
    }

    public void setRounded(Integer rounded) {
        this.rounded = rounded;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

}
