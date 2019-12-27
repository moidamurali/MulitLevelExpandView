package com.murali.customexpandable;

import java.util.ArrayList;
import java.util.List;

/**
 * Element class
 * @author Murali
 *
 */
public class Elements {

    private String author;
    private String releaseDate;
    private List<ElementsData> elementsData = null;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<ElementsData> getElementsData() {
        return elementsData;
    }

    public void setElementsData(List<ElementsData> elementsData) {
        this.elementsData = elementsData;
    }


    public static class ElementsData{

        /** Text content*/
        private String title;
        /** Hierarchy in tree*/
        private int level;
        /** The id of the element*/
        private String id;
        /** id of parent element*/
        private String parentId;
        /** Is there a child element?*/
        private boolean hasChildren;
        /** item Whether to expand*/
        private boolean isExpanded;

        /** Represents that the node has no parent element, that is, a node with level 0.*/
        public static final String NO_PARENT = ""+-1;
        /** Indicates that the element is at the top level.*/
        public static final int TOP_LEVEL = 0;

        public ElementsData(String contentText, int level, String id, String parentId, boolean hasChildren, boolean isExpanded) {
            super();
            this.title = contentText;
            this.level = level;
            this.id = id;
            this.parentId = parentId;
            this.hasChildren = hasChildren;
            this.isExpanded = isExpanded;
        }

        public boolean isExpanded() {
            return isExpanded;
        }

        public void setExpanded(boolean isExpanded) {
            this.isExpanded = isExpanded;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public boolean isHasChildren() {
            return hasChildren;
        }

        public void setHasChildren(boolean hasChildren) {
            this.hasChildren = hasChildren;
        }
    }


}