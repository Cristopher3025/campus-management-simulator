package edu.una.datastructures.campus.tree;

import edu.una.datastructures.campus.model.Brigade;

public class OrganizationTree extends GeneralTree {

    public OrganizationTree(Brigade rootBrigade) {
        super(rootBrigade);
    }

    public void addBrigade(TreeNode parent, Brigade brigade) {
        addChild(parent, brigade);
    }
}
