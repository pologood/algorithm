/**
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.algorithm.tree;

import com.baidu.algorithm.datastructure.TreeNode;

/**
 * _111_Minimum_Depth_of_Binary_Tree
 *
 * @author xuhaoran01
 */
public class _111_Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Integer.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
