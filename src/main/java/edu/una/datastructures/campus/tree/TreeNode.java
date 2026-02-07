package edu.una.datastructures.campus.tree;

public class TreeNode {

    private Object data;
    private TreeNode firstChild;
    private TreeNode nextSibling;

    public TreeNode(Object data) {
        this.data = data;
        this.firstChild = null;
        this.nextSibling = null;
    }

    public Object getData() {
        return data;
    }

    public TreeNode getFirstChild() {
        return firstChild;
    }

    public TreeNode getNextSibling() {
        return nextSibling;
    }

    public void setFirstChild(TreeNode firstChild) {
        this.firstChild = firstChild;
    }

    public void setNextSibling(TreeNode nextSibling) {
        this.nextSibling = nextSibling;
    }
}
