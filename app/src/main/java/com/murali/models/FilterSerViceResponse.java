
package com.murali.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class FilterSerViceResponse implements Serializable {

    @SerializedName("products")
    @Expose
    private FilterProducts products;

    public FilterProducts getProducts() {
        return products;
    }

    public void setProducts(FilterProducts products) {
        this.products = products;
    }

    public class FilterProducts implements Serializable {

        private FilterRedirectUrl redirectUrl;
        private String query;
        private FilterPaging paging;
        private List<FilterHit> hits = null;
        private List<FilterFacet> facets = null;

        public FilterRedirectUrl getRedirectUrl() {
            return redirectUrl;
        }

        public void setRedirectUrl(FilterRedirectUrl redirectUrl) {
            this.redirectUrl = redirectUrl;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public FilterPaging getPaging() {
            return paging;
        }

        public void setPaging(FilterPaging paging) {
            this.paging = paging;
        }

        public List<FilterHit> getHits() {
            return hits;
        }

        public void setHits(List<FilterHit> hits) {
            this.hits = hits;
        }

        public List<FilterFacet> getFacets() {
            return facets;
        }

        public void setFacets(List<FilterFacet> facets) {
            this.facets = facets;
        }

    }

    public class FilterFacet {

        private String key;
        private String text;
        private String type;
        private List<FilterElements> elements = null;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<FilterElements> getElements() {
            return elements;
        }

        public void setElements(List<FilterElements> elements) {
            this.elements = elements;
        }

    }

    public class FilterPaging {

        @SerializedName("index")
        @Expose
        private Integer index;

        @SerializedName("size")
        @Expose
        private Integer size;

        @SerializedName("total")
        @Expose
        private Integer total;

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

    }

    public class FilterRedirectUrl {


    }


}
