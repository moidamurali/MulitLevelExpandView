package com.murali.customtree;

/**
 * Element class
 * @author carrey
 *
 */
public class Element {
    /** Text content*/
    private String contentText;
    /** Hierarchy in tree*/
    private int level;
    /** The id of the element*/
    private int id;
    /** id of parent element*/
    private int parendId;
    /** Is there a child element?*/
    private boolean hasChildren;
    /** item Whether to expand*/
    private boolean isExpanded;

    /** Represents that the node has no parent element, that is, a node with level 0.*/
    public static final int NO_PARENT = -1;
    /** Indicates that the element is at the top level.*/
    public static final int TOP_LEVEL = 0;

    public Element(String contentText, int level, int id, int parendId, boolean hasChildren, boolean isExpanded) {
        super();
        this.contentText = contentText;
        this.level = level;
        this.id = id;
        this.parendId = parendId;
        this.hasChildren = hasChildren;
        this.isExpanded = isExpanded;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    public String getContentText() {
        return contentText;
    }

    public void setContentText(String contentText) {
        this.contentText = contentText;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParendId() {
        return parendId;
    }

    public void setParendId(int parendId) {
        this.parendId = parendId;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}