const BinaryTreeNode = require("./nodes/BinaryTreeNode")

const BinarySearchTree = class {
    constructor(val=0) {
        this.root = new BinaryTreeNode(val);
    }

    insert(val) {
        let curr = this.root;
        
        while (true) {
            if (val < curr.get()) {
                curr = curr.left;
            } else if (val > curr.get()) {
                curr = curr.right;
            }
                
        }
    }

    search(val) {
        let curr = this.root;
        
        while (curr) {
            if (val < curr.get()) {
                curr = curr.left;
            } else if (val > curr.get()) {
                curr = curr.right;
            } else {
                return curr;
            }
        }
        return -1;
    }
    
    remove(val) {}

    bfs() {}

    dfs() {}
    
    toString() {}
}

module.exports = BinarySearchTree;