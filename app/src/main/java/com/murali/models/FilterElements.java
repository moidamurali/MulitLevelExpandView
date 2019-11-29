
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterElements {

    @SerializedName("key")
    @Expose
    private String key;

    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("children")
    @Expose
    private List<FilterChild> child = null;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<FilterChild> getChild() {
        return child;
    }

    public void setChild(List<FilterChild> children) {
        this.child = children;
    }

}
