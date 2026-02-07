package edu.una.datastructures.campus.tree;

public class GeneralTree {

    private TreeNode root;

    public GeneralTree(Object rootData) {
        this.root = new TreeNode(rootData);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void addChild(TreeNode parent, Object childData) {
        if (parent == null) {
            return;
        }

        TreeNode newChild = new TreeNode(childData);

        if (parent.getFirstChild() == null) {
            parent.setFirstChild(newChild);
        } else {
            TreeNode current = parent.getFirstChild();
            while (current.getNextSibling() != null) {
                current = current.getNextSibling();
            }
            current.setNextSibling(newChild);
        }
    }

    public TreeNode search(TreeNode current, Object data) {
        if (current == null) {
            return null;
        }

        if (current.getData().equals(data)) {
            return current;
        }

        TreeNode child = current.getFirstChild();
        while (child != null) {
            TreeNode found = search(child, data);
            if (found != null) {
                return found;
            }
            child = child.getNextSibling();
        }

        return null;
    }

    public void traverse(TreeNode current) {
        if (current == null) {
            return;
        }

        System.out.println(current.getData());

        TreeNode child = current.getFirstChild();
        while (child != null) {
            traverse(child);
            child = child.getNextSibling();
        }
    }
}
