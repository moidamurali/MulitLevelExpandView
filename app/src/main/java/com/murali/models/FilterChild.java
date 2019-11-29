
package com.murali.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilterChild {

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
    private List<SubChild> subChild = null;

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

    public List<SubChild> getSubChild() {
        return subChild;
    }

    public void setSubChild(List<SubChild> children) {
        this.subChild = children;
    }




    public class SubChild {

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
        private List<SubChild.GrandChild> grandChild = null;

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

        public List<SubChild.GrandChild> getGrandChild() {
            return grandChild;
        }

        public void setGrandChild(List<SubChild.GrandChild> children) {
            this.grandChild = children;
        }



        public class GrandChild {

            @SerializedName("key")
            @Expose
            private String key;
            @SerializedName("text")
            @Expose
            private String text;
            @SerializedName("count")
            @Expose
            private Integer count;

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

        }

    }


}
